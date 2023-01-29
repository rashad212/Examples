import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CatMain {

    public static void main(String[] args) throws Exception {

        Cat myCat = new Cat("Garfield",5);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for(Field field : catFields){
//            System.out.println(field.getName());
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Jimmy McGill");
            }
        }
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for(Method method : catMethods){
            if(method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible(true);
                method.invoke(myCat);
//                method.invoke(null);
//                myCat.heyThisIsPrivate();
            }
//            System.out.println(method.getName());
        }

//        System.out.println(myCat.getName());
    }
}
