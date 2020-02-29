package adapter.exercise1;

public class Application {

    public static void main(String[] args) {

        Hdmi hdmi = new HdmiImpl();
        Usb usb = new Usb();

        HdmiToUsb hdmiToUsb = new HdmiToUsbImpl(hdmi);

        usb.connect(hdmiToUsb);

    }

}
