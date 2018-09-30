import java.util.Collections;

public class Racursia2 {
    public static void main(String[] args) {
        draw(5);
    }
    private static void draw(int n){
        if (n <=0){
            return;
        }
        System.out.println(String.join("", Collections.nCopies(n,"*")));
        draw(n - 1);
        System.out.println(String.join("", Collections.nCopies(n,"#")));

    }
}
