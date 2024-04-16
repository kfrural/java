package file;

import classes.Casa;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author kfrural
 */
public class SerializadorJSONMusica {
    public String ToJSON(List<Musica> musica){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(musica);
            return jsonString;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Musica> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Musica> musica = mapper.readValue(jsonString, new TypeReference<List<Musica>>(){});
            return musica;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
