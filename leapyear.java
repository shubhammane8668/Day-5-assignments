
public class leapyear {
public static void main(String[] args) {

	// Generating random year
  int min =999;
  int max = 9999;
  
  System.out.println("Random year between"+min+" to "+max+ ":");  
  int year = (int)(Math.random()*(max-min)+min);  
  System.out.println(year);  	
  
  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
      System.out.println("Specified year is a leap year");
   else
      System.out.println("Specified year is not a leap year");


}

}