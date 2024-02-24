import java.util.Scanner ; 

public class CreditcardValidators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		long card_number;
		
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0 ; i<10 ; ++i)
		{
			System.out.print("Enter a card number as a long integer : " );
			card_number = sc.nextLong();
			
			if ( isValid(card_number)==true)
				System.out.println(card_number + " is valid");
			else
				System.out.println(card_number + " is invalid");
			
		}
	}


	
	
	
	
	
	public static boolean isValid(long number)
	{
		boolean card_size = false;
		boolean card_prefix = false;
		boolean card_number = false;
		int even_place;
		int odd_place;
		
		if (  (getSize(number)>=13) && (getSize(number)<= 16)  )
			card_size = true;
		if (
				(prefixMatched(number, 4)==true) ||
				(prefixMatched(number, 5)==true) ||
				(prefixMatched(number, 37)==true) ||
				(prefixMatched(number, 6)==true)
				)
			card_prefix = true;
		
		even_place = sumOfDoubLeEvenPlace(number);
		
		odd_place = sumOfDoubLeOddPLace(number);
		
		if(( even_place + odd_place) % 10 == 0)
			card_number = true;
		
		if( (card_size==true) && (card_prefix==true) && (card_number==true) )
			return true;
		else
			return false;
			
	}
	
	
	public static int getSize(long number)
	{
		String card = number + "";
		
		return card.length();
	}
	
	
	public static boolean prefixMatched(long number, int prefix)
	{
		long result;
		
		result = getPrefix(number, getSize(prefix));
		
		if ( result == prefix)
				return true;
		else
			return false;
		
	}
	
	
	public static long getPrefix(long number, int prefix)
	{
		String num = number + "";
		
		String sub_string;
		
		sub_string = num.substring(0, prefix);
		
		return Long.parseLong(sub_string);
		
	}
	
	
	public static int sumOfDoubLeEvenPlace(long number)
	{
		int sum = 0;
		String num = number +"";
		
		int size;
		String digit_char;
		int digit_int;
		
		size = getSize(number);
		for (int i = 0; i<size ; i+=2)
		{
			digit_char = num.charAt(i) + "";
			digit_int = Integer.parseInt(digit_char);
			
			sum += getDigit(digit_int * 2);
		}
		return sum;
	
	}
	
	public static int getDigit(int number)
	{
		int digit;
		
		if ( number > 9)
			digit = number / 10 + number % 10;
		else
			digit = number;
		
		return digit;
		
	}
	
	public static int sumOfDoubLeOddPLace(long number)
	{
		int sum = 0;
		String num = number + "";
		int size;
		String digit_char;
		int digit_int;
		
		size = getSize(number);
		for (int i = 1; i<size ; i+=2)
		{
			digit_char = num.charAt(i) + "";
			digit_int = Integer.parseInt(digit_char);
			
			sum += digit_int;
		}
			
			return sum; 

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

