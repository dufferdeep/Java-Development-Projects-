package creatingTemperatureConverter;

import java.util.Scanner;

public class project1 {
public static void main(String[]args) {
	float temp;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter temp in Fahrenheit");
	temp=in.nextInt();
	temp=((temp-32)*5)/9;
	System.out.println("Temperature in celcius is = "+temp);
}
}
