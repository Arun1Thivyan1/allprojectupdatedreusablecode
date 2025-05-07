package anfas;

import java.io.File;

public class delete_old_screenshotimage_and_extend_report 
{
	
	 public static void deleteFilesInFolder(String folderPath) 
	 {
		 
	        File folder = new File(folderPath);
	        if (folder.exists() && folder.isDirectory()) 
	        {
	        	
	            File[] files = folder.listFiles();
	            if (files != null) {
	                for (File file : files) {
	                    file.delete(); // Delete each file
	                }
	            }
	        }
	    }

}
