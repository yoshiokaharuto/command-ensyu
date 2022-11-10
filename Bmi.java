
import java.util.Scanner;
public class Main {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

    for (int i=0; i<2; i++){		
	  double height = sc.nextDouble();
	  double weight = sc.nextDouble();	  
	  double bmi = weight/(height*height);
	  System.out.println((Math.floor(bmi*100))/100);
           }
	  sc.close();
	}
}
