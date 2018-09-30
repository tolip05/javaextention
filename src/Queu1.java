import java.util.ArrayDeque;

public class Queu1 {
    public static void main(String[] args) {
        ArrayDeque<String>queu = new ArrayDeque<>();
        queu.offer("Mimi");
        queu.offer("Pepi");
        queu.offer("Toshko");

        int n = 2;

        while (queu.size() > 1){
            for (int i = 1; i < n; i++) {
                queu.offer(queu.poll());
            }
            System.out.println("Remooved " + queu.poll());
        }
        System.out.println("Last in " + queu.poll());
    }
}
