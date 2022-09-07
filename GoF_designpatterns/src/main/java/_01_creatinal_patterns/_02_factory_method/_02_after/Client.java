package _01_creatinal_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        /**
         * 패턴 적용하기
         */
/*
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship", "white@mail.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackship", "black@mail.com");
        System.out.println("blackship = " + blackship);
*/
        /**
         * 인터페이스 적용하기기
         */
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "white@mail.com");
        client.print(new BlackShipFactory(), "blackship", "black@mail.com");
    }

    // 메서드 인수를 인터페이스로 처리
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
