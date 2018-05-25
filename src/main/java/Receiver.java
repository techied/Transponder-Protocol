import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Receiver {
    static void run() throws IOException {
        FileInputStream fis = new FileInputStream(new File("write.tech"));
        PeerUpdateProtos.PeerUpdate update = PeerUpdateProtos.PeerUpdate.parseFrom(fis);
        System.out.println(update);
        fis.close();
    }
}
