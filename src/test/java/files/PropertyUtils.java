package files;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;
public class PropertyUtils {

    String propertyFileName= null;

    public void setPropertyFile( String propertyFileName){
        this.propertyFileName=propertyFileName;
    }

@Test
    public String gettingValueOfProperty(String property) throws Exception{
        Properties prop = new Properties();
        InputStream input = null;
       String requiredPropertyValue = null ;
        try{
            input = new FileInputStream(propertyFileName);
            FileReader read = new FileReader("/home/rivigo/IdeaProjects/untitled11/src/test/java/org/example/utils/zoom.properties");
            prop.load(read);
            // get the property value
            requiredPropertyValue=prop.getProperty("env");
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(input!=null)
            {
                input.close();
            }

        }
    System.out.println(property);
        return requiredPropertyValue;


    }


}