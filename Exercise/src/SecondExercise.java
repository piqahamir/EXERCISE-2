import java.util.*;
public class SecondExercise {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		exercise7();
		exercise11();
	    exercise15();
		exercise20();
		exercise22();
		exercise32();
		exercise9();
		exercise13();
		exercise5();
		exercise12();
		
	}
	
	public static void exercise7() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		int num = in.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
			
		}
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise11() {
		Scanner in = new Scanner (System.in);
		
		double pi = 3.142;
		
		System.out.print("Enter the radius of a circle: ");
		double rad = in.nextDouble();
		
		double area = (rad*rad)*pi;
		double C = pi*(rad*2);
		
		System.out.println("Perimeter is: " + C);
		System.out.println("Area is: " + area);
		System.out.println("----------------------------------------------------");
		
	}
	
	public static void exercise15() {
		
		int a=7, b=11, swap;
		System.out.println("Before swap a=" + a + " and b=" + b);
		swap = a;
		a = b;
		b = swap;
		
		System.out.println("After swap a=" + a + " and b=" + b);
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise20() {
		Scanner in = new Scanner (System.in);
		
		int dec_num, remainder;
		String hex_num = "";
		
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		System.out.print("Enter a decimal number: ");
		dec_num = in.nextInt();
		
		while(dec_num>0)
		{
			remainder = dec_num%16;
			hex_num = hex[remainder] + hex_num;
			dec_num = dec_num/16;
		}
		System.out.println("Hexadecimal number is " + hex_num);
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise22() {
		Scanner in = new Scanner (System.in);
		
		long dec_num=0, binary_num,remainder, i=1;
		
		System.out.print("Enter binary number: ");
		binary_num = in.nextLong();
		
		while (binary_num != 0)
		{
			remainder = binary_num%10;
			dec_num = dec_num + remainder * i;
			i = i*2;
			binary_num = binary_num/10;
			
		}
		System.out.println("Decimal Number is " + dec_num);
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise32() {
		Scanner in = new Scanner (System.in);
		
		int num1, num2;
		System.out.print("Enter first number: ");
		num1 = in.nextInt();
		System.out.print("Enter second number: ");
		num2 = in.nextInt();
		
		if(num1 == num2)
			System.out.printf("%d==%d\n", num1,num2);
		if(num1!=num2)
			System.out.printf("%d!=%d\n", num1,num2);
		if(num1>num2)
			System.out.printf("%d>%d\n", num1,num2);
		if(num1>=num2)
			System.out.printf("%d>=%d\n", num1,num2);
		if(num1<num2)
			System.out.printf("%d<%d\n", num1,num2);
		if(num1<=num2)
			System.out.printf("%d<=%d\n", num1,num2);
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise9() {
		System.out.println("   J   a   v     v   a");
		System.out.println("   J  a a   v   v   a a");
		System.out.println("J  J aaaaa   V V   aaaaa");
		System.out.println(" JJ  a   a    V    a   a");
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise13() {
		
		double width=5.5, height=8.5;
		
		double perimeter = 2*(height+width);
		double area = height*width;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);
		System.out.printf("Area is 2*(%.1f + %.1f) = %.2f\n", height, width, area);
		System.out.println("----------------------------------------------------");
			
	}
	
	public static void exercise5() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
		System.out.println("----------------------------------------------------");
	}
	
	public static void exercise12() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Enter third number: ");
		int num3 = in.nextInt();
		
		System.out.println("The average of 3 numbers are = " + (num1+num2+num3)/3);
	}
}
		