package uianduxtesting;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class screenshotutil 
{
	
	
    public static String convertImageToBase64(String imagePath) 
    {
        try 
        {
            File file = new File(imagePath);
            FileInputStream imageInFile = new FileInputStream(file);
            byte[] imageData = new byte[(int) file.length()];
            imageInFile.read(imageData);
            imageInFile.close();
            return Base64.getEncoder().encodeToString(imageData);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
    }

}
