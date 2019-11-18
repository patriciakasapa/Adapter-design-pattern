import adapter.HDMIMonitor;
import adapter.RaspberryPi;
import adapter.VGAMonitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern: ");
        RaspberryPi pi = new RaspberryPi();
        pi.display(new HDMIMonitor());

        // pi.display(new VGAMonitor());
        //
        // Using adapter so that vga is compatible

    }
}
