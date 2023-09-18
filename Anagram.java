import java.util.Scanner;

public class Anagram {
    /**
     * @param args
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st String");
         String str1=sc.nextLine();
         System.out.println("Enter 2nd String");
         String str2=sc.nextLine();
        //  if(str1.length()!=str2.length()){
        //     System.out.println("Non Anagram");
        //    
        //  }

        //Conver lowerCase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //String to Array
         char[] ch1=str1.toCharArray();
         char[] ch2=str2.toCharArray();

         int freq1[]=new int[26];
         int freq2[]=new int[26];

        for(int i=0;i<ch1.length;i++){
            freq1[ch1[i]-'a']++;
        }
        for(int i=0;i<ch2.length;i++){
            freq2[ch2[i] -'a']++;
        }
        for(int i=0 ;i<freq1.length;i++){
            if(freq1!=freq2){
                break;
            }
            if(){

            }
        }
         

             
                 
         






         
         

    }
}
