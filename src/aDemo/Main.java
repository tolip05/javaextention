package aDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?>ref = Class.forName("aDemo.Reflection");
        Reflection rs = (Reflection) ref.getConstructor().newInstance();
        String debug="";
        Class reflection = Reflection.class;
        if (reflection.isAnnotationPresent(Venci.class)){
            Venci venci = (Venci) reflection.getAnnotation(Venci.class);
            System.out.println(venci.name());
        }
        Field[] allFields = reflection.getDeclaredFields();
        Arrays.sort(allFields, Comparator.comparing(Field::getName));
        for (Field allField : allFields) {
            if (!Modifier.isPrivate(allField.getModifiers())){
                System.out.println(String.format("%s must be private",allField.getName()));
            }
        }

    }
}
