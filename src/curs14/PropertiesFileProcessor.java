package curs14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writePropertiesFile() {
		
		try (OutputStream outputStream = new FileOutputStream("test.properties");){ 
			
			Properties propFile = new Properties();
			propFile.setProperty("user", "testUser");
			propFile.setProperty("pass", "test123");
			propFile.setProperty("email", "test@test.com");
			
			propFile.store(outputStream, "am salvat fisierul");
			
			//outputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void readPropertiesFile(String key) {
		
		try(InputStream inputStream = new FileInputStream("test.properties")){
			
			Properties propfile = new Properties();
			propfile.load(inputStream);
			
			System.out.println(propfile.getProperty(key));
			
		}catch (IOException e) {
			
		}
		
	}
	
	public void updatePropertiesFile(String key, String value) {
		
		try(OutputStream output = new FileOutputStream("test.properties")
				InputStream input = new FileInputStream("test.properties")){
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
