import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {
            Class worker = Class.forName("Worker");

            Constructor[] constructors = worker.getConstructors();
            Constructor[] declaredConstructor = worker.getDeclaredConstructors();

            Field[] fields = worker.getFields();
            Field[] declaredFields = worker.getDeclaredFields();

            Method[] methods = worker.getMethods();
            Method[] declaredMethods = worker.getDeclaredMethods();

            for (Constructor c : constructors){
                System.out.println("constructor : " + c.getName());
            }

            for (Constructor c : declaredConstructor){
                System.out.println("declared constructor : " + c.getName());
            }

            for (Field f : fields){
                System.out.println("fields : " + f.getName());
            }

            for (Field f : declaredFields){
                System.out.println("declared fields : " + f.getName());
            }

            for (Method m : methods){
                System.out.println("methods : " + m.getName());
            }

            for (Method m : declaredMethods){
                System.out.println("declared methods : " + m.getName());
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
