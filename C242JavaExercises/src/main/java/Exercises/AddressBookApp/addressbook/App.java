package Exercises.AddressBookApp.addressbook;


import Exercises.AddressBookApp.controller.AddressBookController;
import Exercises.AddressBookApp.dao.AddressBookAuditDao;
import Exercises.AddressBookApp.dao.AddressBookAuditDaoFileImpl;
import Exercises.AddressBookApp.dao.AddressBookDao;
import Exercises.AddressBookApp.dao.AddressBookDaoFileImpl;
import Exercises.AddressBookApp.service.AddressBookServiceLayer;
import Exercises.AddressBookApp.service.AddressBookServiceLayerImpl;
import Exercises.AddressBookApp.ui.AddressBookView;
import Exercises.AddressBookApp.ui.UserIO;
import Exercises.AddressBookApp.ui.UserIOConsoleImpl;

public class App
{
    public static void main(String[] args) {
        // Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        // Instantiate the View and wire the UserIO implementation into it
        AddressBookView myView = new AddressBookView(myIo);
        // Instantiate the DAO
        AddressBookDao myDao = new AddressBookDaoFileImpl();
        // Instantiate the Audit DAO
        AddressBookAuditDao myAuditDao = new AddressBookAuditDaoFileImpl();
        // Instantiate the Service Layer and wire the DAO and Audit DAO into it
        AddressBookServiceLayer myService = new AddressBookServiceLayerImpl(myDao, myAuditDao);
        // Instantiate the Controller and wire the Service Layer into it
        AddressBookController controller = new AddressBookController(myService, myView);
        // Kick off the Controller
        controller.run();
    }
}
