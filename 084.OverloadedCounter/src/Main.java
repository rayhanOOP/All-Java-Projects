public class Main {
    public static void main(String[] args) {
        Counter c = new Counter (900, true);
        c.decrease(7);
        
        System.out.println(c.value());
    }
}
