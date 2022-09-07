package _01_creatinal_patterns._02_factory_method._02_after;

/**
 * Java9 미만의 경우
 */
 public abstract class DefaultShipFactory implements ShipFactory {
    //Ship createShip(); 를 구현하지 않았기 때문에 추상클래스다.

    @Override
    public Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름이 없습니다.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일이 없습니다.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
