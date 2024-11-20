package com.file.util;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EMail {

    public static void sendEmail(String userEmail, String userMessage){
        String host = "smtp.gmail.com";
        String MyEmail = "mukeshcse94@gmail.com";
        String MyPassword = "qtfr mgvr dhpc vqgw";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth" , "true");
        properties.put("mail.smtp.starttls.enable" , "true");
        properties.put("mail.smtp.host" , host);
        properties.put("mail.smtp.port" , "587");


        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MyEmail , MyPassword);
            }
        });

        try{
            Message mes = new MimeMessage(session);
            mes.setFrom(new InternetAddress(MyEmail));
            mes.setRecipients(Message.RecipientType.TO , InternetAddress.parse(MyEmail));
            mes.setSubject("Feedback from " + userEmail);
            mes.setText("Message from: " + userEmail + "\n\n" + userMessage);

            Transport.send(mes);
            JOptionPane.showMessageDialog(null, "Email sent successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        }
        catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error sending email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
