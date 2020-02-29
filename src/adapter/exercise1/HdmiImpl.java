package adapter.exercise1;

public class HdmiImpl implements  Hdmi {

    @Override
    public void connect() {
        System.out.println("Sygnał z HDMI");
    }
}
