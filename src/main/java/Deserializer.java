import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserializer {
    static String getJson(Object obj){
        ObjectMapper ob = new ObjectMapper();
        String json= null;
        try {
            json = ob.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
