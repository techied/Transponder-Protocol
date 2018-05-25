import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PeerUpdateOuterClass.PeerUpdate update = PeerUpdateOuterClass.PeerUpdate.newBuilder().setId("0").setLat(0.1).setLong(0.1).setTime(System.currentTimeMillis()).setSignalStrength(9000.01f).setDeviceType("Testing").setBattery(0.46).build();
        if (!update.isInitialized()) {
            System.out.println("Error: not initialized\n" + update);
        }

        FileOutputStream fos = new FileOutputStream(new File("write.tech"));
        update.writeTo(fos);
        fos.close();
        Receiver.run();
    }
}
