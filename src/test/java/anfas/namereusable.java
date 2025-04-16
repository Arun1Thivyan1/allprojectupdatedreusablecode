package anfas;

import java.util.Random;

import com.github.javafaker.Faker;

public class namereusable 
{
	
	
//	  public static String generateDynamicName() {
//	        String[] names = {"gopal", "ravi", "kumar", "mani", "arun", "bala", "vijay"};
//	        Random random = new Random();
//	        String randomName = names[random.nextInt(names.length)];
//	        return "test " + randomName;
//	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  public static String generateDynamicName() {
//	        String[] syllables1 = {"go", "ra", "ku", "ma", "ar", "ba", "vi", "si", "ka", "sa"};
//	        String[] syllables2 = {"pal", "vi", "mar", "ni", "un", "la", "jay", "va", "sh", "th"};
//
//	        Random random = new Random();
//
//	        String name = syllables1[random.nextInt(syllables1.length)] +
//	                      syllables2[random.nextInt(syllables2.length)];
//
//	        return "test " + name;
//	    }
//
//	    public static void main(String[] args) {
//	        for (int i = 0; i < 20; i++) {
//	            System.out.println(generateDynamicName());
//	        }
//	    }
	    
	    
	   
	
	
	
	
	
	
	
	    public static String generateDynamicName() 
	    {
	        Faker faker = new Faker();
	        String name = faker.name().firstName();
	        return "test " + name.toLowerCase();
	    }

	   
	
	    
	    
	    
	    
	    
	    
	    
	

}
