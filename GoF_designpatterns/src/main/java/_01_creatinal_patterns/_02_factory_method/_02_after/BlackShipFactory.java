package _01_creatinal_patterns._02_factory_method._02_after;

//public class BlackShipFactory implements ShipFactory { //Java9 이상
public class BlackShipFactory extends DefaultShipFactory { //Java9 미만

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
