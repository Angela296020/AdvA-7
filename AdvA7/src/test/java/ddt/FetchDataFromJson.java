package ddt;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromJson {

	public static void main(String[] args) throws IOException{
	File file = new File("./src/test/resources/jsonFile.json");
	
	ObjectMapper jsondata = new ObjectMapper();
	
	JsonNode data = jsondata.readTree(file);
	
	System.out.println(data.get("url").asText());
	System.out.println(data.get("username").asText());
	
	WebDriver driver = new ChromeDriver();
	String Url = data.get("url").asText();
	driver.get(Url);
	}

}
