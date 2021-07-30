
public class ReverseAString {

	public static void main(String[] args) {
		
		String string  = "abcdef";
		
		char[] arr = string.toCharArray();
		
		System.out.println(string);
		for (int i = arr.length-1; i >= 0; i--) {
			 System.out.print(arr[i]);
		}
		
	}
}
