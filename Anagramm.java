import java.util.Arrays;
import java.util.Scanner;

public class Anagramm {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st String");
         String str1=sc.nextLine();
         System.out.println("Enter 2nd String");
         String str2=sc.nextLine();
         char[] arr1=str1.toCharArray();
         char[] arr2=str2.toCharArray();
         if(checkAnagram(arr1,arr2)){
           System.out.println("Givern two string are Anagram");
         }else{
            System.out.println("Given to string are non-Anagram");
         }
    }
    static Boolean checkAnagram(char[] str1, char[] str2){
      
        int no1=str1.length;
        int no2=str2.length;

        if(no1!=no2)
        return false;

        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i< no1;i++)
            if(str1[i] != str2[i]) 
            return false;
        
        return true;

    }
}
