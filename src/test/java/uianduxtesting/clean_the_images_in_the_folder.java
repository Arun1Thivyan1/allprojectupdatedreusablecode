package uianduxtesting;

import java.io.File;

public class clean_the_images_in_the_folder

{
	
	
	public void cleanDirectory(String folderPath) {
        File directory = new File(folderPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                        System.out.println("Deleted: " + file.getName());
                    }
                    
                }
            }
        }
	}

}
