package _01_creatinal_patterns._02_factory_method._02_after;

//public class WhiteShipFactory implements ShipFactory { //Java9 이상
public class WhiteShipFactory extends DefaultShipFactory { //Java89 미만

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
