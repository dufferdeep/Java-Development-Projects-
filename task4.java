package creatingRandomPasswordGenerator;
import java.util.Random;
import java.util.Scanner;
public class task4 {
	
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	Random random=new Random();
	System.out.println("enter no of length:");
	int len=scan.nextInt();
	System.out.println("the password is:");
	for(int i=0;i<len;i++){
	System.out.print(random.nextInt(10));
	} 
	}
	}

