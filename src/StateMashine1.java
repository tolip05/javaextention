import java.util.Scanner;

public class StateMashine1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          char[] s = scanner.nextLine().toCharArray();
          int state=0;
          int index = 0;
          char prev = s[index];
            StringBuilder sb = new StringBuilder();
          while (index < s.length){
              switch (state){
                  case 0:

                      state = 1;
                      prev = s[index];
                      break;
                  case 1:
                      if (s[index] == prev){
                          state = 2;
                      }
                      sb.append(s[index -1]);
                      prev = s[index];
                      break;
                  case 2:
                      if (s[index]!= prev){
                          state =1;
                      }
                      prev = s[index];
                      break;
              }
              ++index;
          }
          if (s[index - 2] != prev){
              sb.append(prev);
          }
        System.out.println(sb.toString());
    }
}
