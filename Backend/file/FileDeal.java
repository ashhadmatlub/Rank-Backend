package Backend.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDeal {
    public List<String> fileReader() {
        List<String> lines = new ArrayList<>();

        File myFile = new File(
                "C:\\ASHHAD PROGRAMMING\\OOPS UNI CS-352\\R-App-Backend\\Backend\\student\\Result-_2nd-Semester_-Section-A-Checked-by-BETA-Group (1).txt");

        try (Scanner sc = new Scanner(myFile)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line); // store instead of just printing
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lines; // return all lines to whoever calls this
    }
}
