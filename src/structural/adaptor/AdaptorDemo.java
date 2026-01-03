package structural.adaptor;

public class AdaptorDemo {
    public static void main(String[] args) {
        SocketAdapter adapter = new PhilipsAdaptor(new WallSocket());
        System.out.println("Mobile Voltage : " + adapter.get3Volt().getVolt() + "V");
        System.out.println("Tablet Voltage : " + adapter.get5Volt().getVolt() + "V");
        System.out.println("Laptop Voltage : " + adapter.get10Volt().getVolt() + "V");
    }
}
