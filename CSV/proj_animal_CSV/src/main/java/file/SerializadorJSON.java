package file;

import classes.Animal;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author kfrural
 */
public class SerializadorJSONAnimal {
    public String ToJSON(List<Animal> animal){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(animal);
            return jsonString;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Animal> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Animal> animal = mapper.readValue(jsonString, new TypeReference<List<Animal>>(){});
            return animal;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
