package support;

import java.util.*;

public class ChooseRand <Thing> {
    public static Object getRandom (List<Object> inList) {

        Random rand = new Random();
        Object sb;

        int len = inList.size();
        int RandIndex = rand.nextInt(0, len + 1);
        sb = inList.get(RandIndex); 

        return sb;
    }
}