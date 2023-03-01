package maven.maven;

import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LocalTime currentTime = LocalTime.now();
    	String greeting = "";
    	if (currentTime.isBefore(LocalTime.NOON)) {
    	    greeting = "Good morning";
    	} else {
    	    greeting = "Good afternoon";
    	}
    	String studentName = "Andrea"; // Replace this with the actual student's name
    	String welcomeMessage = String.format("%s, %s, Welcome to COMP367!!", greeting, studentName);
    	System.out.println(welcomeMessage);

    }
}
