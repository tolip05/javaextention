package aDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> refer = Class.forName("aDemo.Reflection");
        Field[]fields = refer.getDeclaredFields();
        Method[]methods = refer.getDeclaredMethods();

        for (Field field : fields) {
            if (!Modifier.isPrivate(field.getModifiers())){
                System.out.println(String.format("%s must be private"
                ,field.getName()));
            }
        }
        Arrays.sort(methods, Comparator.comparing(Method::getName));
        Method[]allGetter = Arrays.stream(methods)
                .filter(a-> a.getName().startsWith("get"))
                .toArray(Method[]::new);
        for (Method method : allGetter) {
            if (!Modifier.isPublic(method.getModifiers())){
                System.out.println(String.format("%s must be public",
                        method.getName()));
            }
        }
        Method[]allSeters = Arrays.stream(methods).filter(a-> a.getName()
                .startsWith("set")).toArray(Method[]::new);
        for (Method allSeter : allSeters) {
            if (void.class.equals(allSeter.getReturnType())){
                if (Modifier.isPublic(allSeter.getModifiers())){
                    System.out.println(String.format("%s the methods to be " +
                            "private or protected",allSeter.getName()));
                }
            }
        }
    }
}
