package _01_creatinal_patterns._02_factory_method._02_after;

public interface ShipFactory {

    Ship createShip();

/*
    //Java8 이상
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    //Java9 이상
    private void validate(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름이 없습니다.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일이 없습니다.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
*/
    Ship orderShip(String name, String email);

    void validate(String name, String email);

    void prepareFor(String name);

    void sendEmailTo(String email, Ship ship);

}
