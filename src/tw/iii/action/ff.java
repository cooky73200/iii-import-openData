package tw.iii.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import test.TestOpenData;
import tw.iii.model.Att;
import tw.iii.model.Product;

public class ff {

	@Test
	public void getProduct () throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		 InputStream input = TestOpenData.class.getClassLoader().getResourceAsStream("animalplay.json");
		Product[] product = mapper.readValue(input, Product[].class);
	
	}
}
