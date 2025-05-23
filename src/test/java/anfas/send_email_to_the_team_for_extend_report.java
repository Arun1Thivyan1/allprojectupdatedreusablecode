package anfas;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class send_email_to_the_team_for_extend_report 

{
	
	
	
	public static void sendEmailWithReport() {
        final String username = "arunthivyan@annztech.com";  // your Gmail address
        final String password = "wnmjfnlzuofufwrc";  // 16-digit App Password (no spaces)
        
        
        
        
        String reportPath = extendreport.getReportPath();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse("arunthivyanvg@gmail.com") // Replace with dev emails
            );
            message.setSubject("✅ Selenium Automation Report");

            
            
            
            
            // Email body
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi Team,\n\nPlease find attached the latest Selenium automation report.\n\nRegards,\nQA Team");

            // Attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(reportPath));

            
            
            
            
            
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("📧 Report emailed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }	
	
	
	
	
	
	
	
	
	

}
