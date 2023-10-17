public class Pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                if(j%2==0){
                 System.out.print(" & ");

                }else{
                    System.out.print(j);
                }
            }
        }
    }
}

/*output
 * & 1 & 3
   & 1 & 3
   & 1 & 3
   & 1 & 3
 */
