package file;

import classes.Casa;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author kfrural
 */
public class SerializadorJSONProduto {
    public String ToJSON(List<Produto> produto){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(produto);
            return jsonString;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Produto> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Produto> produto = mapper.readValue(jsonString, new TypeReference<List<Produto>>(){});
            return produto;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
