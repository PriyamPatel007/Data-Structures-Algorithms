// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Pair p3=new Pair(10,20);
        System.out.println(p3.x);
        System.out.println(p3.y);
    }
    public static class Pair{
        int x;
        int y;
        Pair(int v,int w){
            x=v;
            y=w;
        }
    }
}
