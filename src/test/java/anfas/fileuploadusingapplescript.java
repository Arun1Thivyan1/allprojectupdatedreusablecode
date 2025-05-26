package anfas;

import java.io.IOException;

public class fileuploadusingapplescript 
{

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void uploadFile(String filePath) throws IOException, InterruptedException 
//    {
//    	
//        // Escape double quotes just in case
//	     String appleScript = "osascript -e 'tell application \"System Events\" to keystroke \"G\" using {command down, shift down}' " +
//        "-e 'delay 1' " +
//        "-e 'tell application \"System Events\" to keystroke \"" + filePath + "\"' " +
//        "-e 'delay 1' " +
//        "-e 'tell application \"System Events\" to key code 36' " + // Press Enter
//        "-e 'delay 1' " +
//        "-e 'tell application \"System Events\" to key code 36'"; // Press Enter again to select file
//
//	     
//	     Thread.sleep(4000); 
//	     
//        Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", appleScript});
//    	
//    	
//        Thread.sleep(5000); // Wait for the file to upload
//        System.out.println("File uploaded successfully using AppleScript");
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    private static final Object uploadLock = new Object();

    public static void uploadFile(String filePath) {
        synchronized (uploadLock) {
            try {
                // Construct AppleScript for "Go to Folder" and paste the path
                String appleScript =
                        "osascript -e 'tell application \"System Events\" to keystroke \"G\" using {command down, shift down}' " +
                        "-e 'delay 1' " +
                        "-e 'tell application \"System Events\" to keystroke \"" + filePath + "\"' " +
                        "-e 'delay 1' " +
                        "-e 'tell application \"System Events\" to key code 36' " + // Press Enter to go to path
                        "-e 'delay 1' " +
                        "-e 'tell application \"System Events\" to key code 36'";  // Press Enter to confirm file selection

                // Small delay to ensure file chooser is open
                Thread.sleep(4000);

                // Execute the AppleScript via bash
                Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", appleScript});

                // Wait for upload to complete (you can tune this delay)
                Thread.sleep(5000);

                System.out.println("File uploaded successfully using AppleScript");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
