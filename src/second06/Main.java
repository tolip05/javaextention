package second06;

public class Main {
    public static void main(String[] args) {
    RandomArrayList ral = new RandomArrayList();
    ral.add("maikul");
    ral.add(5);
    ral.add("m");
    ral.add(1);
    ral.add("mn");
    ral.add(4);
    ral.add("maik");
    ral.add(2);
    ral.add("l");
    ral.add(8);

        System.out.println(ral.getRandomElement());
        System.out.println(ral);
    }
}
