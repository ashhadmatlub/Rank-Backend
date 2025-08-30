package Backend.app;

import Backend.student.StudentList;

public class App {
    public void run() {
        // FileDealing files = new FileDealing();
        // files.fileReader();

        StudentList list = new StudentList();
        list.studnentInfo();
        list.searchData();
    }
}
