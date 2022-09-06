package _01_creatinal_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) throws Exception {
/*
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(settings == settings1);
*/

        /**
         * 싱글톤 패턴 구현 방법을 깨트리는 방법
         */

/*
        //1. reflaction 사용
        Settings settings = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings == settings1); //false
*/

/*
        //2. 직렬화 & 역직렬화 사용
        Settings settings = Settings.getInstance();
        Settings settings1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }
        System.out.println(settings == settings1);
*/

        /**
         * enum 클래스 reflaction 대응 확인 : Exception
         */
/*
        Settings settings = Settings.INSTANCE;

        Settings settings1 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }
        System.out.println(settings == settings1);
*/

        Settings settings = Settings.INSTANCE;
        Settings settings1 = Settings.INSTANCE;
        System.out.println(settings == settings1); //true

    }

}
