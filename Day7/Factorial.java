// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println(ans);
    }
}
