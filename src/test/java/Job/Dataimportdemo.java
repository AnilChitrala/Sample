package Job;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataimportdemo {

	@DataProvider
	public Object[] getData()
	{
		Object[] data=new Object[2];
		data[0] = "chitralaanilkumar@gmail.com";
		data[1] = "atp.anilkumar@gmail.com";
		
	    
	    return data;
	}
	
	@Test(dataProvider="getData")
	public void weblogin(String username) throws EmailException
	{
		EmailAttachment attachment = new EmailAttachment();
	attachment.setPath("G:\\Resume\\Anil_Chitrala_Testing_3.7Years.docx");
	attachment.setDisposition(EmailAttachment.ATTACHMENT);
	// attachment.setDescription("Picture of John");
	// attachment.setName("John");

	// Create the email message
	MultiPartEmail email = new MultiPartEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("chitralaanilkumar@gmail.com", "Happy@100%"));
	email.setSSLOnConnect(true);
	email.setFrom("chitralaanilkumar@gmail.com");
	email.setSubject("Applying for Testing position");
	email.setMsg("Hi,\r\n" + "\r\n"
			+ "I am Anil Kumar Chitrala. I have 3.7 Years of experience in manual and Automation testing in Tech Mahindra.\r\n"
			+ "\r\n"
			+ "Could you please find my resume for the same and let me know if there are any requirements.\r\n"
			+ "\r\n" + "Notice period : Immediate Joining\r\n" + "\r\n" + "Thank you\r\n" + "\r\n" + "Regards,\r\n"
			+
			"Anil Kumar Chitrala,\r\n" +
			"Contact No : +91-9010555446\r\n" +
			"Email : chitralaanilkumar@gmail.com ");
	email.addTo(username);
	email.attach(attachment); 
	System.out.println("Attachment");
	email.send();
	System.out.println("Mail sent");
		//System.out.println(username);
  		
	}
	
	
}
