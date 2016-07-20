# reverseint
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		String s=String.valueOf(num);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
    
