package structural.adaptor;

/**
 * Adapter responsibility:
 *
 * Wraps WallSocket
 *
 * Converts incompatible voltage
 *
 * Client never sees 240V
 */
public class PhilipsAdaptor implements SocketAdapter {

    // Adaptee
    private final WallSocket wallSocket;

    public PhilipsAdaptor(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }

    @Override
    public Voltage get3Volt() {
        return convertVoltage(wallSocket.getVoltage(), 3);
    }

    @Override
    public Voltage get5Volt() {
        return convertVoltage(wallSocket.getVoltage(), 5);
    }

    @Override
    public Voltage get10Volt() {
        return convertVoltage(wallSocket.getVoltage(), 10);
    }

    private Voltage convertVoltage(Voltage voltage, int requiredVolts) {
        return new Voltage(requiredVolts);
    }
}
