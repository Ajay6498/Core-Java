import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfLetter {
    public static void main(String[] args) {
        String str="AJAY";
        char ch[]=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap();
         for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i])) {
                hm.put(ch[i], hm.get(ch[i])+1);
            }else{
             hm.put(ch[i], 1);
            }
         }
         //System.out.println(hm);

         for (HashMap.Entry<Character,Integer> c : hm.entrySet() ) {
            System.out.println(c.getKey() + ":" + c.getValue());
         }
          
		
    }
}
