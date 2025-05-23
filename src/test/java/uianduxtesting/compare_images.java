package uianduxtesting;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class compare_images 
{
	
	
	
	


	
	
	
	
	public String compareImages(BufferedImage expected, BufferedImage actual, String imageName) throws IOException {
        ImageDiffer imgDiffer = new ImageDiffer();
        ImageDiff diff = imgDiffer.makeDiff(expected, actual);

        if (diff.hasDiff()) 
        {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String diffPath = "/Users/apple/eclipse-workspace/all_pro_maj_flow_automation/difference_images/difference_"
                    + imageName + "_" + timestamp + ".png";

            ImageIO.write(diff.getMarkedImage(), "PNG", new File(diffPath));
            System.out.println("Difference found in " + imageName + " page, check " + diffPath);

            return diffPath;
        } 
        else 
        {
            System.out.println(imageName + " page: Images are identical.");
            return null;
        }
    }
	
	

}
