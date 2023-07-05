public class Methods {
    public static void main(String[] args) {
        Methods example = new Methods();
        int returned = example.go() ;
        int value = Methods.go (5);
        
    }
    public int go() {
        return 14;
    }
    public static int go(int x) {
        return x;
    }
}
