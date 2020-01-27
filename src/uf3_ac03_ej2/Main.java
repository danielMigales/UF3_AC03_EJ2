package uf3_ac03_ej2;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * @Daniel Migales
 */

public class Main {

    public static void main(String[] args)throws FileNotFoundException, IOException, SAXException{
        
        XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
        Gestor gestor = new Gestor();
        procesadorXML.setContentHandler(gestor);
        InputSource fileXML = new InputSource("personas.xml");
        procesadorXML.parse(fileXML);

    }

}
