// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int marks=sc.nextInt();
        // if(marks>35){
        //     System.out.println("pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }
        // int n=sc.nextInt();
        // if((n%2==0) &&(n%3==0)){
        //     System.out.println("2 and 3");
        // }
        // else{
        //     System.out.println("not");
        // }
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is max");
        }
        else if(b>=a && b>=c){
            System.out.println("b is max");
        }
        else{
            System.out.println("c is max");
        }
        
        int i=1;
        while(i<=5){
            System.out.println("Algo");
            i++;
        }
    }
}
