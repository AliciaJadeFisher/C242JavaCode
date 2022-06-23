package Exercises.AddressBookApp.ui;

import Exercises.AddressBookApp.dto.Address;
import Exercises.AddressBookApp.dto.AddressBookRecord;

import java.util.Map;

public class AddressBookView
{
    private UserIO io;

    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection()
    {
        io.print("Main Menu");
        io.print("1. List Addresses");
        io.print("2. Search for an Address");
        io.print("3. Add a New Address");
        io.print("4. Remove an Address");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public AddressBookRecord getNewAddressBookInfo()
    {
        String firstName = io.readString("Please enter First Name: ");
        String lastName = io.readString("Please enter Last Name: ");
        int number = io.readInt("Please enter House Number: ");
        String road = io.readString("Please enter Road Name: ");
        String city = io.readString("Please enter City Name: ");
        String state = io.readString("Please enter State Name: ");
        String postCode = io.readString("Please enter Postcode: ");

        Address currentAddress = new Address(number, road, city, state, postCode);
        AddressBookRecord currentRecord = new AddressBookRecord(firstName, lastName, currentAddress);

        return currentRecord;
    }

    public void displayAddressBookList(Map<Integer, AddressBookRecord> addressBook) {
        for (Integer i : addressBook.keySet()) {
            AddressBookRecord currentRecord = addressBook.get(i);
            String recordInfo = String.format("%s - %s %s : %s %s %s %s %s", String.valueOf(i),
                    currentRecord.getFirstName(),
                    currentRecord.getLastName(),
                    String.valueOf(currentRecord.getAddress().getNumber()),
                    currentRecord.getAddress().getRoad(),
                    currentRecord.getAddress().getCity(),
                    currentRecord.getAddress().getState(),
                    currentRecord.getAddress().getPostcode());
            io.print(recordInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public Integer getAddressBookRecordIdChoice() {
        return io.readInt("Please enter the Address ID.");
    }

    public void displayAddressBookRecord(AddressBookRecord record) {
        if (record != null)
        {
            io.print(record.getFirstName());
            io.print(record.getLastName());
            io.print(String.valueOf(record.getAddress().getNumber()));
            io.print(record.getAddress().getRoad());
            io.print(record.getAddress().getCity());
            io.print(record.getAddress().getState());
            io.print(record.getAddress().getPostcode());
            io.print("");
        } else {
            io.print("No such address record.");
        }
        io.readString("Please hit enter to continue.");
    }

    public String getLastNameChoice()
    {
        return io.readString("Please enter a Last Name: ");
    }

    public void displayRemoveResult(AddressBookRecord addressRecord) {
        if(addressRecord != null){
            io.print("Address successfully removed.");
        }else{
            io.print("No such address.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayAddAddressBanner() {
        io.print("=== Add Address ===");
    }

    public void displayAddSuccessBanner() {
        io.readString(
                "Address successfully added.  Please hit enter to continue");
    }

    public void displayRemoveSuccessBanner() {
        io.readString(
                "Address successfully removed.  Please hit enter to continue");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All Addresses ===");
    }

    public void displayDisplayAddressBanner () {
        io.print("=== Display Address ===");
    }


    public void displayRemoveAddressBanner () {
        io.print("=== Remove Address ===");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
