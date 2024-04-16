package file;

import classes.Casa;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author kfrural
 */
public class SerializadorJSONCasa {
    public String ToJSON(List<Casa> casa){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(casa);
            return jsonString;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Casa> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Casa> casa = mapper.readValue(jsonString, new TypeReference<List<Casa>>(){});
            return casa;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
