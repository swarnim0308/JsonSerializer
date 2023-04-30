import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class MainClass {
    public static String formatJson(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json);
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        String out="";
        try {
            out=writer.writeValueAsString(jsonNode);
            return out;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return out;
    }

    public static void main(String[] args)
    {
        CustomerVo cvo = new CustomerVo();
        CustomerOrderVo covo = new CustomerOrderVo();
        LineItemVo lvo = new LineItemVo();
        CartVo cavo = new CartVo();
        AddressVo avo = new AddressVo();
        InventoryVo ivo = new InventoryVo();
        OrderVo ovo = new OrderVo();
        ProductInventoryVo pivo = new ProductInventoryVo();
        ProductVo pvo = new ProductVo();
        Object[] obs = new Object[]{cvo,covo,lvo,cavo,avo,ivo,ovo,pivo,pvo};
        for(Object objj:obs)
        {
            try {
                System.out.println(objj.getClass()+"\n"+formatJson(Deserializer.getJson(objj)));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }
}
