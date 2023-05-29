import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();  //Date class to get the date
		
		System.out.println(d.toString());  //To convert the date object into String
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("d/M/yyyy HH:mm:ss");
		System.out.println(sd.format(d));
		
		
		

	}

}
