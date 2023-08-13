// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("a is max");
        }
        else if((b>=a) && (b>=c)){
            System.out.println("b is max");
        }
        else{
            System.out.println("c is max");
        }
    }
}
