package support;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DB2code {

    public static void main(String[] args) throws FileNotFoundException {
        DB2code D2 = new DB2code();
        System.out.println(D2.getUsername());
    }

    protected static String email;
    static String colon;
    private static String pass;
    public static String username;

    public DB2code() throws FileNotFoundException {

        File db = new File("src/userDB.txt");
        Scanner sc = new Scanner(db);
        StringBuffer sb = new StringBuffer();

        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
        }
        sc.close();

        StringTokenizer st = new StringTokenizer(sb.toString());

        while (st.hasMoreTokens()) {
            email = st.nextToken();
            colon = st.nextToken();
            pass = st.nextToken();
            colon = st.nextToken();
            username = st.nextToken();
        }
    }

    public String getPass() {
        return pass;
    }
    public String getMail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
}
