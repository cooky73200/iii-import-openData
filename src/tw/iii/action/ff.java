package tw.iii.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.junit.Test;
import org.python.core.PyString;

import com.fasterxml.jackson.databind.ObjectMapper;






public class ff {

	@Test
	public void getProduct () throws IOException, InterruptedException  {
		String str ="寵物玩具";
		String[] args1 = {"python","D:\\Python\\catchShopeeDataForJava.py",str};
		

		Process proc = Runtime.getRuntime().exec(args1);// 執行py檔案
		proc.waitFor();

		
		
		
	}
}
