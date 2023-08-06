// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a=20,b=30;
        System.out.println(a+" "+b);
        
        int x=1000;
        long l=x;
        System.out.println(l);
        
        long y=1200;
        int z=(int)y;
        System.out.println(z);
        
        // int a=10000000000;
        // long t=a;
        // System.out.println(t);
        
        Scanner Sc=new Scanner(System.in);
        int x1=Sc.nextInt();
        System.out.println(x1);
        
        double d=4.4;
        int i=(int)d;
        System.out.println(i);
    }
}
