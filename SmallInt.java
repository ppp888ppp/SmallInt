public class SmallInt
{
	public static final int MAX_VALUE = 1000;
	private int value = 0;
	
	public SmallInt(int value)
	{
		setDec(value);
	}

	public void setDec(int value)
	{
		if(value >= 0 && value <= MAX_VALUE)
		{
			this.value = value;
		}
		else
		{
			System.out.println("out of range");
			this.value = 0;
		}
	}
	
	
	public String getDec()
	{
		return value + "";
	}
	
	public String getBin()
	{
		String bin = "";
		int temp = value; 
		
		if(temp == 0)
		{
			bin = 0 + "";
		}
		
		while(temp > 0)
		{
			bin = temp%2 + bin;
			temp = temp / 2 ;
		}
		
		return bin;
	}
	
	/*
	 * when we put 0 in the value, then it will return 0.  
	 * other than that let's suppose we put 10 as a value
	 * 10 % 2 will be 0 , so that we put the result in the String bin.
	 * Since the outcome of "temp % 2" is placed in the backside of the String in sequence, I set "bin = temp%2 + bin"
	 * then I update the temp through "temp/2" and then I will keep repeating the process by doing "temp%2" 
	 * it finally returns the result when the temp condition does not satisfies(temp >0)
	 
	
	 *  binary 	  update 
	 * 	(10%2 =0, 10/2 = 5) 
	 *  (5%2 = 1, 5/2 = 2) 
	 *  (2%2 = 0, 2/2 = 1) 
	 *  (1%2 = 1, 1/2 = 0(here, out of the loop)) 
	 *  read down to top
	 *  1010 
	*/ 
	
	public String getHex()
	{
		int temp = value;
		int remainder = temp % 16;
		String hex = "";
		
		if(temp == 0)
		{
			hex = "" + 0;
		}
		
		while(temp > 0)
		{
			remainder = temp % 16;

			if(remainder < 10)
			{
				hex = remainder + hex;
			}
			else
			{
				hex =  (char)('A' + remainder - 10) + hex;
			}
			
			temp = temp / 16;	
		}
		hex = "0x" + hex;
		return hex;
	}
/*
 * the logic is similar as before, but
 * we need to care about when the remainder is between 10~15 
 * if the remainder is within the range, we need to change it to the alphabet.
 * 
 * let's suppose the example value is 160
 * 
 *  hex 	          update 
 *  (160%16 = 0,      160 / 16 = 10) 
 *	(10 % 16 = 10(A), 10/16 = 0(here,out of the loop))	
 *	read down to top 0xA0
 *	
 * 	
 */
	
	public int BinToDec(String bin) // 101
	{
		int decimalValue = 0;
		int exponent = 0;
		
		for(int i = bin.length()-1; i >= 0 ; i--)
		{
			double binaryDigit = Double.parseDouble("" + bin.charAt(i)); // change String to Double 
			
			decimalValue += (int)(Math.pow(2.0, exponent) * binaryDigit);
			exponent++;
		}
		return decimalValue;
	}
	
	public boolean sameValue(String binary, String hex)
	{
		int BinToDec = BinToDec(binary);
		setDec(BinToDec);
		String binAsHex = getHex();
		
		if(binAsHex.equals(hex))
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
}
