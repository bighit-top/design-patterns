package _01_creatinal_patterns._02_factory_method._01_before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름이 없습니다.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일이 없습니다.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("W");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("B");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
