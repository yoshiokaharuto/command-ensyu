
import java.util.Scanner;
public class Main {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
	  double height = sc.nextDouble();
	  double weight = sc.nextDouble();	  
	  double bmi = weight/(height*height);
	  System.out.println((Math.floor(bmi*10000))/100);

	  sc.close();
	}
}
