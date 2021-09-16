package tw.iii.Dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import test.TestOpenData;
import tw.iii.model.Animal;
import tw.iii.model.Hospital;
import tw.iii.model.Product;
import tw.iii.model.ProductImgs;
import tw.iii.model.ProductJ;
import tw.iii.model.ProductOptions;

public class OpenData {

	public Animal[] getAnimal() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		URL url = new URL(
				"https://quality.data.gov.tw/dq_download_json.php?nid=85903&md5_url=c37f10282e2229a6459d7d85e601c38e");
		Animal[] animals = mapper.readValue(url, Animal[].class);

		return animals;
	}
	
	public Product[] getProduct () throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		 InputStream input = TestOpenData.class.getClassLoader().getResourceAsStream("animalpretty.json");
		Product[] product = mapper.readValue(input, Product[].class);
		return product;
	}
	

	public ArrayList<ArrayList<Hospital>> getAllHospital() throws IOException {
		ArrayList<ArrayList<Hospital>> allHospital = new ArrayList<>();
		OpenData openData = new OpenData();
		allHospital.add(openData.getTaipelHospital());
		allHospital.add(openData.getNewTaipelHospital());
		allHospital.add(openData.getTainanHospital());
		allHospital.add(openData.getTaichungHospital());
		allHospital.add(openData.getKaohsiungHospital());
		allHospital.add(openData.getHsinchuHospital());
		allHospital.add(openData.getChiayiHospital());
		return allHospital;
	}

	public ArrayList<Hospital> getTainanHospital() throws IOException {
		String url = "https://data.tainan.gov.tw/dataset/0205e18a-13de-47f5-bdd1-8b18405b12f8/resource/2ac2f474-a367-4019-84af-c5e8f9475611/download/a2019.csv";
		return getHospital("UTF-8", url, "台南市", 3, 7, 5, false);
	}

	public ArrayList<Hospital> getNewTaipelHospital() throws IOException {
		String url = "https://data.ntpc.gov.tw/api/datasets/DE4CFD62-E977-4C4F-822F-7D2AA65F6E4A/csv/file";
		return getHospital("UTF-8", url, "新北市", 0, 2, 1, true);
	}

	public ArrayList<Hospital> getTaipelHospital() throws IOException {
		String url = "https://data.taipei/api/getDatasetInfo/downloadResource?id=01bcb5ee-7c18-41fa-86d4-4e75daee1f94&rid=1f2009a0-c735-4fcd-be11-e3c157a64741";
		return getHospital("BIG5", url, "台北市", 0, 1, 2, true);
	}

	public ArrayList<Hospital> getKaohsiungHospital() throws IOException {
		String url = "https://data.kcg.gov.tw/dataset/87e6d8e3-07d3-4c5f-826f-d1b2ae4132e0/resource/762fbb38-59d7-4084-84f4-7158f1ade850/download/110-1.csv";
		return getHospital("UTF-8", url, "高雄市", 0, 3, 4, true, 2);
	}

	public ArrayList<Hospital> getHsinchuHospital() throws IOException {
		String url = "https://ws.hsinchu.gov.tw/001/Upload/1/opendata/8774/215/bdae7448-0f6b-4462-a30f-f48a304cad2c.csv";
		return getHospital("BIG5", url, "新竹市", 0, 3, 4, false);
	}

	public ArrayList<Hospital> getTaichungHospital() throws IOException {
		String url = "https://datacenter.taichung.gov.tw/swagger/OpenData/49dacd04-f1cf-4fa1-8aa9-8d3e1ce82f4e";
		return getHospital("UTF-8", url, "台中市", 0, 3, 4, true, 2);
	}

	public ArrayList<Hospital> getChiayiHospital() throws IOException {
		String url = "https://data.chiayi.gov.tw/opendata/api/getResource?oid=5222e133-b615-4a7c-8f0d-1bc68fa77429&rid=e95f76b6-cf64-4cad-8964-8286000c422a";
		return getHospital("UTF-8", url, "嘉義市", 0, 2, 1, false);
	}

	private static ArrayList<Hospital> getHospital(String encode, String sourceUrl, String area, int nameIndex,
			int addressIndex, int telIndex, boolean flag) throws IOException {
		URL url = new URL(sourceUrl);
		InputStream openStream = url.openStream();
		CsvListReader reader = new CsvListReader(new BufferedReader(new InputStreamReader(openStream, encode)),
				CsvPreference.STANDARD_PREFERENCE);
		List<String> openList = reader.read();

		ArrayList<Hospital> hospitalList = new ArrayList<>();
		while ((openList = reader.read()) != null) {
			Hospital hospital = new Hospital();
			hospital.setHospitalName(openList.get(nameIndex));
			hospital.setArea(area);
			String newAddress = openList.get(addressIndex);
			if (flag) {
				newAddress = area + openList.get(addressIndex);
			}
			hospital.setAddress(newAddress);
			hospital.setTel(openList.get(telIndex));

			hospitalList.add(hospital);
		}

		reader.close();
		openStream.close();
		return hospitalList;

	}

	private static ArrayList<Hospital> getHospital(String encode, String sourceUrl, String area, int nameIndex,
			int addressIndex, int telIndex, boolean flag, int distIndex) throws IOException {
		URL url = new URL(sourceUrl);
		InputStream openStream = url.openStream();
		CsvListReader reader = new CsvListReader(new BufferedReader(new InputStreamReader(openStream, encode)),
				CsvPreference.STANDARD_PREFERENCE);
		List<String> openList = reader.read();

		ArrayList<Hospital> hospitalList = new ArrayList<>();
		while ((openList = reader.read()) != null) {
			Hospital hospital = new Hospital();
			hospital.setHospitalName(openList.get(nameIndex));
			hospital.setArea(area);
			String newAddress = openList.get(addressIndex);
			if (flag) {
				newAddress = area + openList.get(distIndex) + openList.get(addressIndex);
			}
			hospital.setAddress(newAddress);
			hospital.setTel(openList.get(telIndex));

			hospitalList.add(hospital);
		}

		reader.close();
		openStream.close();
		return hospitalList;

	}

}
