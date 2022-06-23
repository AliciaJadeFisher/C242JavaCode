package Exercises.AddressBookApp.controller;

import Exercises.AddressBookApp.dao.AddressBookPersistenceException;
import Exercises.AddressBookApp.dto.AddressBookRecord;
import Exercises.AddressBookApp.service.AddressBookDataValidationException;
import Exercises.AddressBookApp.service.AddressBookServiceLayer;
import Exercises.AddressBookApp.ui.AddressBookView;

public class AddressBookController
{
    private AddressBookView view;
    private AddressBookServiceLayer service;

    public AddressBookController(AddressBookServiceLayer service, AddressBookView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listAddresses();
                        break;
                    case 2:
                        searchAddresses();
                        break;
                    case 3:
                        addAddress();
                        break;
                    case 4:
                        removeAddress();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (AddressBookPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addAddress() throws AddressBookPersistenceException {
        view.displayAddAddressBanner();
        boolean hasErrors = false;
        do {
            AddressBookRecord currentRecord = view.getNewAddressBookInfo();
            try {
                service.addAddress(currentRecord);
                view.displayAddSuccessBanner();
                hasErrors = false;
            } catch (AddressBookDataValidationException | AddressBookPersistenceException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }

    private void listAddresses() throws AddressBookPersistenceException {
        view.displayAddressBookList(service.getAllAddresses());
    }

    private void searchAddresses() throws AddressBookPersistenceException {
        view.displayDisplayAddressBanner();
        String lastName = view.getLastNameChoice();
        view.displayAddressBookList(service.searchRecord(lastName));
    }

    private void removeAddress() throws AddressBookPersistenceException {
        view.displayRemoveAddressBanner();
        Integer index = view.getAddressBookRecordIdChoice();
        service.removeAddress(index);
        view.displayRemoveSuccessBanner();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
