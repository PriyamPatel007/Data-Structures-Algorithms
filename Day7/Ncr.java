// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nmr=n-r;
        int nfact=1,rfact=1,nmrfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;
        }
        for(int i=1;i<=r;i++){
            rfact*=i;
        }
        for(int i=1;i<=nmr;i++){
            nmrfact*=i;
        }
        int ans=nfact/(rfact*nmrfact);
        System.out.println(ans);
    }
}
