import java.math.BigDecimal;
import java.util.*;

public class Arhitect01 {
    public static void main(String[] args) {
        Integer[]inputArray = {1,5,9,2,7,8,5,7,5,1};
        List<Integer>inputList = new ArrayList<>(10);
        inputList.addAll(Arrays.asList(inputArray));
        Map<Integer,List<Integer>>duplication = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (duplication.containsKey(inputList.get(i))){
                List<Integer>dupIndexesFori = duplication.get(inputList.get(i));
                dupIndexesFori.add(i);
            }else {
                List<Integer>duplicateIndexes= new ArrayList<>();
                duplicateIndexes.add(i);
                duplication.put(inputList.get(i),duplicateIndexes);
            }
        }
        printDuplication(duplication);


    }

    private static void printDuplication(Map<Integer, List<Integer>> dup) {
        Set<Integer>duplicateValues= dup.keySet();
        for (Integer duplicateValue : duplicateValues) {
            List<Integer>dupList = dup.get(duplicateValue);
            if (dupList.size()>1){
                System.out.print(duplicateValue + " -> ");
                for (int i = 0; i < dupList.size(); i++) {
                    Integer dupIndex = dupList.get(i);
                    System.out.print(dupIndex);
                    if (i < dupList.size()-1){
                        System.out.print(" , ");
                    }
                }
                System.out.println("; ");
            }
        }
    }
}
