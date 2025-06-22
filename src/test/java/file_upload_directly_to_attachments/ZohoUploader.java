package file_upload_directly_to_attachments;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import anfas.extendreport;

import org.apache.http.*;


import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

public class ZohoUploader 
{
	
	
	private static final String ACCESS_TOKEN ="1000.2d0fd4702727d826ce09129fc287eda6.8bffceab8677ede8192a6e3506b8b58f";
	
	// replace with your token
    private static final String PROJECT_ID ="297769000000057991"; 
    
    
    //297769000000040596
    
    // replace with your project ID
    private static final String ISSUE_ID ="297769000000158065"; 
    
    // already known
    
    
    
    
    

    
    
    

   
    
    
    
    public static void uploadExtentReport() 
    
    
    {
        String portalName ="annztechdotcom"; // Replace with actual portal name
        
        
        
//        String filePath = extendreport.getReportPath();
        
        
        String filePath ="/Users/apple/Downloads/check.jpeg" ;
        
        
        
        String url = String.format("https://projectsapi.zohoapis.in/restapi/portal/annztechdotcom/projects/297769000000057991/issues/297769000000164019/attachments/",portalName, PROJECT_ID, ISSUE_ID);
        
        
        
        
        System.out.println(url);
        
        
        
        System.out.println("File path: " +filePath);
       
        

        CloseableHttpClient client = null;
        try 
        {
            client = HttpClients.createDefault();
            HttpPost upload = new HttpPost(url);
            upload.addHeader("Authorization", "Zoho-oauthtoken " + ACCESS_TOKEN);

            File file = new File(filePath);
            if (!file.exists()) 
            {
                System.out.println("File not found: " +filePath);
                return;
            }
            
            
            
            
            

            // Set multipart/form-data entity
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            
            
   //       builder.addPart("attachment", new FileBody(file, ContentType.DEFAULT_BINARY, file.getName()));
            
            
            builder.addBinaryBody("attachment", file, ContentType.DEFAULT_BINARY, file.getName());
            
            
            HttpEntity entity = builder.build();

            upload.setEntity(entity);
            
            
            
            
            
            
            
            
            
            

            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(HttpResponse response) throws IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        return "Upload successful!";
                    } else {
                        return "Upload failed with status: " + status;
                    }
                }
            };
            
            
            
            
            
            
            
            
            
            
            
            

            String result = client.execute(upload, responseHandler);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
}


