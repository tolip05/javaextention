import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HashMapClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<studentSpeciality>student = new ArrayList<>();
        List<studentSpeciality>studentSpec = new ArrayList<>();

//        readInputAndAddToArray("Students:",studentSpec,br);
//        readInputAndAddToArray("End",student,br);
        while (true){
            String[]line = br.readLine().split("\\s+");
            if ("Students:".equalsIgnoreCase(line[0])){
                break;
            }
            studentSpec.add(new studentSpeciality(line[0] + line[1],line[2]));
        }
        while (true){
            String[]line = br.readLine().split("\\s+");
            if ("END".equalsIgnoreCase(line[0])){
                break;
            }
            student.add(new studentSpeciality(line[1] + line[2],line[0]));
        }

        student.stream().sorted(Comparator.comparing(studentSpeciality::getName))
                .forEach(s -> {
                    studentSpec.stream().filter((spec) -> spec.getNumber().equalsIgnoreCase(s.getNumber()))
                            .forEach(specialyti -> System.out.printf("%s %s %s\n",
                                    s.getName().trim(),s.getNumber(),specialyti.getName()));
                });



    }



}

class studentSpeciality{
    private String name;
    private String number;
    studentSpeciality(String _name,String num){
    this.setName(_name);
    this.setNumber(num);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}