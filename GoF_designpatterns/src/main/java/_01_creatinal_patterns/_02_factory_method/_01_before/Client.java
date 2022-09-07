package _01_creatinal_patterns._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship", "white@mail.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "black@mail.com");
        System.out.println("blackship = " + blackship);
    }
}
