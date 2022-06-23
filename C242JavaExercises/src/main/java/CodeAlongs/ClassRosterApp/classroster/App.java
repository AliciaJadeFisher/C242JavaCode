package CodeAlongs.ClassRosterApp.classroster;

import CodeAlongs.ClassRosterApp.controller.ClassRosterController;
import CodeAlongs.ClassRosterApp.dao.ClassRosterAuditDao;
import CodeAlongs.ClassRosterApp.dao.ClassRosterAuditDaoFileImpl;
import CodeAlongs.ClassRosterApp.dao.ClassRosterDao;
import CodeAlongs.ClassRosterApp.dao.ClassRosterDaoFileImpl;
import CodeAlongs.ClassRosterApp.service.ClassRosterServiceLayer;
import CodeAlongs.ClassRosterApp.service.ClassRosterServiceLayerImpl;
import CodeAlongs.ClassRosterApp.ui.ClassRosterView;
import CodeAlongs.ClassRosterApp.ui.UserIO;
import CodeAlongs.ClassRosterApp.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        // Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        // Instantiate the View and wire the UserIO implementation into it
        ClassRosterView myView = new ClassRosterView(myIo);
        // Instantiate the DAO
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // Instantiate the Audit DAO
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        // Instantiate the Service Layer and wire the DAO and Audit DAO into it
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        // Instantiate the Controller and wire the Service Layer into it
        ClassRosterController controller = new ClassRosterController(myService, myView);
        // Kick off the Controller
        controller.run();
    }
}
