package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.iii.Dao.OpenData;
import tw.iii.model.Animal;
import tw.iii.model.Hospital;
import tw.iii.model.Product;

public class TestOpenData {

	@Test
	public void test() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		 InputStream dd = TestOpenData.class.getClassLoader().getResourceAsStream("animalfood1.json");
		Product[] food = mapper.readValue(dd, Product[].class);
		
	}

}
