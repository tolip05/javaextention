package mordorsis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String>foods = Arrays.asList(br.readLine().split("\\s+"));
        Wizard wizard = new Wizard();
        wizard.setHappinessIndex(foods);
        System.out.println(wizard.getHappinessIndex());
        System.out.println(wizard.getMood());
    }
}
