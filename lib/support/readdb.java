package support;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readdb {
    
    static File db = new File("src/userDB.txt");

    public static String readDB()  {
        StringBuffer sb = new StringBuffer();
        Scanner sc;
        try {
            sc = new Scanner(db);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        return sb.toString();
    }
}
