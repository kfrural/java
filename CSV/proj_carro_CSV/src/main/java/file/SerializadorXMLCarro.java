
package file;

import classes.Gerenciador;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author kfrural
 */
public class SerializadorXMLCarro {
    public String ToXML(Gerenciador carro){
        try{
            JAXBContext context = JAXBContext.newInstance(Gerenciador.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            StringWriter writer = new StringWriter();
            marshaller.marshal(carro, writer);
            return writer.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public Gerenciador fromXML(String xmlString){
        try{
            JAXBContext context = JAXBContext.newInstance(Gerenciador.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xmlString);
            return (Gerenciador) unmarshaller.unmarshal(reader);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
