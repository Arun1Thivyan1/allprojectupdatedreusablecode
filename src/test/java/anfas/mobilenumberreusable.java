package anfas;

import java.util.Random;

public class mobilenumberreusable

{
	
	
    public static String generateRandomMobileNumber() {
        Random random = new Random();
        int number = 10000000 + random.nextInt(90000000);  // Ensures 8 digits
        return "5" + number;  // Makes it 9 digits starting with 5
    }

}
