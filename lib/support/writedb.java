package support;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class writedb {

    public static void main(String[] args) throws InvalidEmail, IOException, InvalidPass {
        writeData("Kunall@gmail.com", "Ra123", "LodeStar2476");
    }

    static File db = new File("src/userDB.txt");

    private static String readDb() throws FileNotFoundException {

        Scanner sc = new Scanner(db);
        StringBuffer sb = new StringBuffer("");

        while (sc.hasNextLine()); {
        sc.nextLine();
        sb.append(sc.nextLine() + "\n");
        System.out.println(sb);
        } 
        sc.close();
        return sb.toString();
    }

    public static void writeData(String email, String password, String username) throws InvalidEmail, IOException, InvalidPass {        
        if (validMail(email) && validPass(password)) {

            //String rdb = readDb();
            FileWriter fw = new FileWriter(db);
            try {
                fw.write(email + " : " + password + " : " + username);
            } catch (Exception e ) {
                System.out.println(e);
            }
            finally {
                fw.close();
            }
        }
        else if (!validMail(email)) {
            throw new InvalidEmail();
        }
        else if (!validPass(password)) {
            throw new InvalidPass();
        }
    }

    public static void writeData(String email, String password) throws InvalidEmail, IOException, InvalidPass {

        //File db = new File("src/userDB.txt");

        if (validMail(email) && validPass(password)) {
            try (FileWriter fw = new FileWriter(db)) {
            fw.write(readDb() + email + " : " + password);
            }
        }
        else if (!validMail(email)) {
            throw new InvalidEmail();
        }
        else if (!validPass(password)) {
            throw new InvalidPass();
        }
    }

    private static boolean validMail(String mail) throws InvalidEmail {

        boolean containsAT = mail.contains("@") ? true : false;
        boolean isBelow20 = mail.length() < 20 ? true : false;
        boolean Dotcom = mail.contains(".com") ? true : false;

        return containsAT && isBelow20 && Dotcom;
    }

    private static boolean validPass(String password) throws InvalidPass {
        
        boolean hasNum = CheckNum(password);
        boolean hasCap = CheckCap(password);
        boolean hasSml = CheckSml(password);

        return hasNum && hasCap && hasSml;
    }

    private static boolean CheckNum(String s) {
        List<Integer> Int = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        boolean b = false;
        for (int i = 0; i <  10; i++) {
            b = s.contains(Int.get(i).toString()) ? true : false;
            if (b) {
                break;
            }
        }
        return b;
    }

    private static boolean CheckCap(String s) {
        List<Character> Alphabets = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'Q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        boolean b = false;
        for (int i = 0; i < Alphabets.size(); i++) {
            b = s.contains(Alphabets.get(i).toString().toUpperCase());
            if (b) {
                break;
            }
        }
        return b;
    }

    private static boolean CheckSml(String s) {
        List<Character> Alphabets = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'Q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        boolean b = false;
        for (int i = 0; i < Alphabets.size(); i++) {
            b = s.contains(Alphabets.get(i).toString().toLowerCase());
            if (b) {
                break;
            }
        }
        return b;
    }
}