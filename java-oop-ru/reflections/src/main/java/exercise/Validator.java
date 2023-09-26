package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> list = new ArrayList<>();
        Class<?> aClass = obj.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for(Field field: fields) {
            NotNull notNullInfo = field.getAnnotation(NotNull.class);
            if(notNullInfo != null) {
                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    if(value == null) {
                        list.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return list;
    }
}
// END
