package adapter;

public class HDMIAdapter extends HDMIMonitor{
    private VGAMonitor vgaMonitor;

    public HDMIAdapter(VGAMonitor vgaMonitor) {
        this.vgaMonitor = vgaMonitor;
    }

    @Override
    public void hdmiDisplay() {
        System.out.println("Using an adapter: ");
        vgaMonitor.vgaDisplay();
    }
}
