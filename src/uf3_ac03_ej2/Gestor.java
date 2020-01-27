package uf3_ac03_ej2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @Daniel Migales
 */

public class Gestor extends DefaultHandler {

    public Gestor() {
        super();
    }
    
    @Override
    public void startDocument() {
        System.out.println("Comienzo del Documento XML.");
    }

    @Override
    public void endDocument() {
        System.out.println("Final del Documento XML.");
    }

    @Override
    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
       System.out.printf("\t Principio Elemento: %s %n", nombre);
    }

    public void endElement(String uri, String nombre, String nombreC) {
       System.out.printf("\t Fin Elemento: %s %n", nombre);
    }

    @Override
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String(ch, inicio, longitud);
        //quitar saltos de linea
        car = car.replaceAll("[\t\n]","");
        System.out.printf("\t Caracteres: %s %n", car);
    }
}

