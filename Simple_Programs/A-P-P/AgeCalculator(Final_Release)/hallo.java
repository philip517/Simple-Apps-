
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class hallo {
 public static void main(String[] args) throws ParseException {
  /*direct age calculation 
  LocalDate l = LocalDate.of(1998, 04, 23); //specify year, month, date directly
  LocalDate now = LocalDate.now(); //gets localDate
  Period diff = Period.between(l, now); //difference between the dates is calculated
  System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
*/
  //using Calendar Object
  String s = JOptionPane.showInputDialog("Enter the year,month and day you were born in the format \n\n year/month/day\n\n yyyy/mm/dd")/*"1994/06/23"*/;
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
  Date d = sdf.parse(s);
  Calendar c = Calendar.getInstance();
  c.setTime(d);
  int year = c.get(Calendar.YEAR);
  int month = c.get(Calendar.MONTH) + 1;
  int date = c.get(Calendar.DATE);
  LocalDate l1 = LocalDate.of(year, month, date);
  LocalDate now1 = LocalDate.now();
  Period diff1 = Period.between(l1, now1);
  JOptionPane.showMessageDialog(null,"age: " + diff1.getYears() +" years","RESULTS", JOptionPane.INFORMATION_MESSAGE);
 }
} 
