package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ResourceMainEncoding {
	static Properties loadUtf8Properties(String resourceName) throws IOException{
		try(InputStream is = ResourceMainEncoding.class.getResourceAsStream(resourceName);
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader reader = new BufferedReader(isr)){ 
			
			Properties result = new Properties();
			
			result.load(reader);
			
			return result;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Properties Properties = loadUtf8Properties("/test.properties");
		System.out.println(Properties.getProperty("任意の日本語のキーを入力"));
	}
}
