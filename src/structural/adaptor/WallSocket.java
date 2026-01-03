package structural.adaptor;

public class WallSocket {
    public Voltage getVoltage() {
        return new Voltage(240);
    }
}
