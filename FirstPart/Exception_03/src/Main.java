public class Main {
    public static void main(String[] args) {
        CastException x = new CastException();

        System.out.println((String) x.a);
    }
}