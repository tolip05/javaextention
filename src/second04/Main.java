package second04;

public class Main {
    public static void main(String[] args) {
      Predator p = new Predator(0);
      p.eat(new Food());
        System.out.println(p.getHealth());
    }
}
