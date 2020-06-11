import io.reader.XmlReader;

import javax.xml.bind.JAXBException;
import java.io.File;

public class Generator {

    public static void main(String[] args) {
        XmlReader reader = new XmlReader();
        try {
            reader.readSettingsFromFile(new File("settings.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
