package _01_creatinal_patterns._03_abstract_factory._02_after;

import _01_creatinal_patterns._03_abstract_factory._01_before.WhiteAnchor;
import _01_creatinal_patterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
