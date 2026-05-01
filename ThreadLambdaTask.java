
public class ThreadLambdaTask {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });

        thread.start();

        System.out.println("Main method finished.");
    }
}