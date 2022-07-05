package support;
import java.util.*;

public class HexKey {
    
    static Random rand = new Random();

    // |> Runnable
    public static void main(String[] args) { 
        String key = genKey();
        System.out.println(key);
    }
    public static String genKey() {

        StringBuffer out = new StringBuffer();
        List<Object> RandKey = new ArrayList<>();

        // :: Alphabets
        char chr = 'A';
        for (int i = 65; i < 90; i++) {
            RandKey.add(chr);
            chr++;
        }

        // :: Numbers
        for (int i = 0; i < 10; i++) {
            RandKey.add(i);
        }

        for (int i = 0; i < 7; i++) {
            out.append(ChooseRand.getRandom(RandKey));
        }

        //System.out.println(out);
        //System.out.println(RandKey.toString());
        return out.toString();
    }
}