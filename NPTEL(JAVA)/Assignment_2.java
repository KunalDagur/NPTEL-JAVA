import java.util.*;

class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}

class cls2 extends cls1{
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void task(int a, int b){
        int square= (a*a)+ (b*b);
        System.out.print(square);
    }
}
public class Assignment_2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    }
}
