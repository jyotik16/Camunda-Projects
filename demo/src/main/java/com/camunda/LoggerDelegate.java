package com.camunda;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * This is an easy adapter implementation 
 * illustrating how a Java Delegate can be used 
 * from within a BPMN 2.0 Service Task.
 */
public class LoggerDelegate implements JavaDelegate {
 
  private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
  
  public void execute(DelegateExecution execution) throws Exception {
    
	         
	  	System.out.println("Logger Delegate");
	  	String name = (String) execution.getVariable("name");
		String address = (String) execution.getVariable("address");
		String PancardNum = (String) execution.getVariable("PancardNum");
		String Dob = (String) execution.getVariable("dob");
		
		System.out.println(name+" "+address+" "+PancardNum+" "+Dob);
		send_mail();
		System.out.println("Card Not Approved.");
	    
  }
  
void send_mail() throws IOException {
	//authentication info
			final String username = "jyotikasjk@gmail.com";
			final String password = "joyfull16";
			String fromEmail = "jyotikasjk@gmail.com";
			String toEmail = "jyotikasjk@gmail.com";
			
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "587");
			
			Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username,password);
				}
			});
			//Start our mail message
			MimeMessage msg = new MimeMessage(session);
			try {
				msg.setFrom(new InternetAddress(fromEmail));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
				msg.setSubject("Credit Card Rejection!");
				
//				msg.setText("My Frist Mail from java code.");
//				String htmlcode ="<h2> We love Java..</h2>";
//				msg.setContent(htmlcode,"text/html");
				
				Multipart emailContent = new MimeMultipart();
								
				//Text body part
				MimeBodyPart textBodyPart = new MimeBodyPart();
				textBodyPart.setText("Your Credit card is not Approved.");
				
				//Attachment body part.
				MimeBodyPart pdfAttachment = new MimeBodyPart();
				pdfAttachment.attachFile("H:/Miscellanous/naresh it.txt");
				
				//Attach body parts
				emailContent.addBodyPart(textBodyPart);
				emailContent.addBodyPart(pdfAttachment);
				
				//Attach multipart to message
				msg.setContent(emailContent);
				
				Transport.send(msg);
				System.out.println("Sent message");
			} catch (MessagingException e) {
				e.printStackTrace();
			}

}
}
