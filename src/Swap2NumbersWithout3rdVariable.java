
public class Swap2NumbersWithout3rdVariable {

	public static void main(String[] args) {
		
		int num1=1022;
		int num2=2220;
		
		num1 = num2+num1;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println(num1+" "+num2);
		
		
	} 
	
}
