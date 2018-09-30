package randoms;

public class Main {
    public static void main(String[] args) {
        RandomArrays ral = new RandomArrays();
        ral.add(1);
        ral.add("name");
        ral.add(4);
        ral.add(5);
        ral.add(new RandomArrays());

        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
    }
}
