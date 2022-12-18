public class StackOverFlow {
    int a = 1;

    public int printNumber(int e) {
        a += 2;
        return a + printNumber(a + 1);
    }
}
