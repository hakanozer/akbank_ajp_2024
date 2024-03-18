package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainReflection {

    public static void main(String[] args) {

        Object action = new Action();
        Class clazz = action.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for ( Field field : fields ) {
            System.out.println( field.getName() );
            System.out.println("===============");
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getName());
            }
        }


    }

}
