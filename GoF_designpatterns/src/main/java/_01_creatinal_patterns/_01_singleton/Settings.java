package _01_creatinal_patterns._01_singleton;

import java.io.Serializable;

//public class Settings implements Serializable {

/**
 * 안전하고 단순하게 singleton을 구현하는 방법 : enum 클래스
 * - 권장2
 * - 역직렬화에 대응: enum은 기본적으로 직렬화/역직렬화를 구현
 * - 리플랙션에 대응: enum은 리플랙션 생성이 막혀있음
 * - lazy 로딩이 안됨. 리소스 낭비될 수 있음
 * - 상속을 사용하지 못함
 */
public enum Settings {

    /**
     * 싱글톤 패턴을 단순히 구현하는 방법
     * thread safe 하지 않음
     */
/*
    //static 으로 global 하게 활용
    private static Settings instance;

    //private 접근제어를 사용하여 외부에서 new 생성하지 못하도록 방어
    private Settings() {}

    public static Settings getInstance() {
        //하나만 생성하도록
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
*/

    /**
     * 멀티 스레드 환경에서 안전하게 구현하는 방법
     */
/*
    //1. synchronized : 동기화 작업으로 성능이 떨어짐
    private static Settings instance;

    private Settings() {}

    //synchronized 키워드 사용하여 동기화
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
*/

/*
    //2. 이른 초기화 사용 : lazy 로딩이 안됨. 리소스 낭비될 수 있음
    private static final Settings INSTANCE = new Settings(); //초기화를 먼저 진행

    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
*/

/*
    //3. double checked locking
    private static volatile Settings instance; //volatile: jdk1.5 이상 더블체크

    private Settings() {}

    public static Settings getInstance() {
        //하나만 생성하도록. 체크 한번
        if (instance == null) {
            //체크를 한번 더
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
*/

/*
    //4. static inner 클래스 사용 : 권장1
    private Settings() {}

    //static inner class
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 대응 : Serializable 구현시 역직렬화에 사용되는 명시되지 않은 메소드 오버라이딩
    protected Object readResolve() {
        return getInstance();
    }
*/

    // enum 클래스
    INSTANCE;

}
