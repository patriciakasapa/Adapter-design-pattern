package adapter;

public class HDMIAdapter extends HDMIMonitor{
    private VGAMonitor monitor;

    public HDMIAdapter(VGAMonitor vgaMonitor) {
        this.monitor = vgaMonitor;
    }

    @Override
    public void hdmiDisplay() {
        monitor.vgaDisplay();
    }
}
