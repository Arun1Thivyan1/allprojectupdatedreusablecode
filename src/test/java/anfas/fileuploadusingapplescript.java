package anfas;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import anfas_main_classes_for_all_modules.Beneficiary;

public class fileuploadusingapplescript 
{

    
    
	 private static final Logger logger = LogManager.getLogger(fileuploadusingapplescript.class);	  
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void uploadFile(String filePath) throws IOException, InterruptedException 
    {
    	
        // Escape double quotes just in case
	     String appleScript = "osascript -e 'tell application \"System Events\" to keystroke \"G\" using {command down, shift down}' " +
        "-e 'delay 1' " +
        "-e 'tell application \"System Events\" to keystroke \"" + filePath + "\"' " +
        "-e 'delay 1' " +
        "-e 'tell application \"System Events\" to key code 36' " + // Press Enter
        "-e 'delay 1' " +
        "-e 'tell application \"System Events\" to key code 36'"; // Press Enter again to select file

	     
	     Thread.sleep(4000); 
	     
        Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", appleScript});
    	
    	
        Thread.sleep(5000); // Wait for the file to upload
        System.out.println("File uploaded successfully using AppleScript");
    }
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
