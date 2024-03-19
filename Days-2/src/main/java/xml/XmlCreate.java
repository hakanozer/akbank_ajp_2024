package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlCreate {
    public static void main(String[] args) {

        Service service = new Service();
        Products products = new Products();
        products.setProducts(service.result());

        // Xml Create
        try {
            File file = new File("sample.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(products, file);
        }catch (Exception ex) {
            System.err.println("XmlCreate Error:"  + ex);
        }

    }
}
