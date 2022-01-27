package in.ashokit;

import in.ashokit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PasswordService ps=new PasswordService();
        String encryptPassword = ps.encrypt("abc@yahoo.in");
        System.out.println(encryptPassword);
        
        String decryptString = ps.decrypt(encryptPassword);
        System.out.println(decryptString);
    }
    
}
