package vfs;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?>ref = Class.forName("vfs.Zavod");

        Zavod zavod = (Zavod) ref.getConstructor().newInstance();
        Field [] fields = ref.getDeclaredFields();
        Field field = fields[0];
        field.setAccessible(true);
        field.set(zavod,"sas");

        String debug ="";
    }
}
