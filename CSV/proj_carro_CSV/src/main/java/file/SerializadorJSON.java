package file;

import classes.Carro;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author kfrural
 */
public class SerializadorJSONCarro {
    public String ToJSON(List<Carro> carro){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(carro);
            return jsonString;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Carro> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Carro> carro = mapper.readValue(jsonString, new TypeReference<List<Carro>>(){});
            return carro;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
