package rdv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import rdv.XMLTools;

public class Test {
	
	
	public static void main (String[] args) throws FileNotFoundException, IOException, ParseException{

        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String today = formatter.format(date);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Date date1 = sdf.parse("10-04-2019");
        Date date2 = sdf.parse(today);

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Today");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Today");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Today");
        } else {
            System.out.println("How to get here?");
        }


	}

}
