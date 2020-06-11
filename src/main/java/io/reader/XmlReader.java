package io.reader;

import domain.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {

    public Settings readSettingsFromFile(File file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (Settings) unmarshaller.unmarshal(file);
    }
}
