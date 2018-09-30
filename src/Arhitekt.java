public class Arhitekt {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int sas = 3 - --b * -a++;
        long sum = 1 + 3 - --b * -a++ + ++a - 20L;
        System.out.println(sas);
    }
}
