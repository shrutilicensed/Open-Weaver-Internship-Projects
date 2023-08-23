import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConverter {
    public static void main(String[] args) {
        String inputDateTime = "2023-08-21 15:30:00"; 

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH-MM-yyyy hh:mm:ss");
        // Open Weaver Week 1 Coding Project by Shruti Choudhary

        try {
            Date date = inputFormat.parse(inputDateTime);
            String formattedDateTime = outputFormat.format(date);

            System.out.println("Input Date/Time: " + inputDateTime);
            System.out.println("Formatted Date/Time: " + formattedDateTime);
        } catch (ParseException e) {
            System.out.println("Error parsing date/time: " + e.getMessage());
        }
    }
}

