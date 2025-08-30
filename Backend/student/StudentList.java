package Backend.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Backend.file.FileDeal;

public class StudentList {
    ArrayList<Student> data = new ArrayList<>();
    String line;

    public void studnentInfo() {

        try {
            // use our own file reading method
            FileDeal fd = new FileDeal();
            List<String> lines = fd.fileReader();

            // line = bfrd.readLine();
            for (String line : lines) {

                String[] fields = line.split("\\s+");

                if (fields.length > 3) {

                    String seatNo = fields[1];
                    String Name = fields[2];
                    double Marks = Double.parseDouble(fields[3]);

                    data.add(new Student(seatNo, Name, Marks));
                    // System.out.println("Seat no : " + fields[1]);
                    // System.out.println("Name : " + fields[2]);
                    // System.out.println("Marks : " + fields[3]);
                    // System.out.println();

                    // data.add(fields[1]);
                    // System.out.println(data);
                }

                // line = bfrd.readLine();
            }

            // bfrd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // public void sort() {
        // sorting the number array
        data.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));
        // }

        // public void ranking() {

        // giving the ranks to the students
        int rank = 1;
        for (Student s : data) {
            s.setRank(rank++);
        }
        // }
    }

    public void searchData() {

        String searcher;
        String trim;
        Student found;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Seat Number e.g. ( B24110006143 )");

        searcher = sc.nextLine();
        trim = searcher.replaceAll("\\s", ""); // this will remove the space

        found = null;

        for (Student stud : data) {
            if (stud.getSeatNo().trim().equalsIgnoreCase(trim)) { // search the current entered seat number
                // from the data of student we have
                found = stud;
                break;
            }
        }

        if (found != null) { // means we have found the data of the student with exact same number
            System.out.println("RESULT : " + found);
        } else {
            System.out.println("Sorry the seat number is not found ");
        }

        sc.close();
    }
}
