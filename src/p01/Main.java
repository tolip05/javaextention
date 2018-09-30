package p01;

public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("Pesho");
        sos.push("Gosho");
        sos.push("Vanio");
        sos.push("Bakal");
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
