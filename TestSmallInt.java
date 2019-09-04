import java.util.*;
public class TestSmallInt
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("put the number between 0 - " + SmallInt.MAX_VALUE + " (inclusive)");
		int input = scan.nextInt();
		
		SmallInt s = new SmallInt(input);

		System.out.println("decimal: " + input);
		System.out.println("binary: " + s.getBin());
		System.out.println("hexadecimal: " + s.getHex()); 
		System.out.println();
		
		System.out.println("----Testing \"sameValue()\" function----");
		System.out.println("Put binary expression: ");
		String bin = scan.next();
		
		System.out.println("Put hex expression as following format (i.e 0x12): ");
		String hex = scan.next();
		
		System.out.println("Are they same value?: "+ s.sameValue(bin, hex));
	}
}// main ends here 

