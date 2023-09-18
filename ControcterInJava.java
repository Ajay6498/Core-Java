class Demo {
    int No1=0;
    int No2=0;
    //int Ans=0;
    Demo(int no1,int no2)      // parameterized constructor 
    {
        this.No1=no1;
        this.No2=no2;
    }
    int Add()
    {
        return No1+No2;
    }
    int Sub()
    {
        return No1-No2;
    }
    int Mult()
    {
        return No1*No2;
    }
    int Div()
    {
        return  No1/No2;
    }
}
public class ControcterInJava
{
    public static void main(String[] args) 
    {
        Demo dobj=new Demo(100, 5);
        System.out.println(dobj.Add());        
        System.out.println(dobj.Sub());
        System.out.println(dobj.Mult());
        System.out.println(dobj.Div());

    }
}
