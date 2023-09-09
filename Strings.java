import java.util.HashMap;
import java.util.Map;

public class Strings {
    public static void main(String[] args) {
        String s = "samsung";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        for (HashMap.Entry<Character,Integer> c : map.entrySet() ) {
            System.out.println(c.getKey() + ":" + c.getValue());
         }

    }
}
