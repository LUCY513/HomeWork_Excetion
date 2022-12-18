public class Main {
    public static void main(String[] args) {
        StackOverFlow excep = new StackOverFlow();
        MessegError print = new MessegError();

        try {
            excep.printNumber(1);
        }catch (StackOverflowError a){
            System.out.println("StackOverflowError");
            System.out.println(print.a +"\n" + print.b + "\n" + print.c);
        }
    }
}