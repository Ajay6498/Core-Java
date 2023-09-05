public class FibSeries {
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
                System.out.println(n1);
                System.out.println(n2);
        for(int i=0;i<=10;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }

    }
}

// output
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
// 55
// 89
// 144


