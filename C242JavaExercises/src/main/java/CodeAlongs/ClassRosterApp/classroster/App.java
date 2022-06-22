package CodeAlongs.ClassRosterApp.classroster;

import CodeAlongs.ClassRosterApp.controller.ClassRosterController;
import CodeAlongs.ClassRosterApp.dao.ClassRosterDao;
import CodeAlongs.ClassRosterApp.dao.ClassRosterDaoFileImpl;
import CodeAlongs.ClassRosterApp.ui.ClassRosterView;
import CodeAlongs.ClassRosterApp.ui.UserIO;
import CodeAlongs.ClassRosterApp.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller =
                new ClassRosterController(myDao, myView);
        controller.run();
    }
}
