import adapter.HDMIMonitor;
import adapter.RaspberryPi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern: ");
        RaspberryPi pi = new RaspberryPi();
        pi.display(new HDMIMonitor());
    }
}
