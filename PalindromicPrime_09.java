
public class PalindromicPrime_09 {

	public static void main(String[] args) {
		System.out.print( 2 + "\t" );
		int count = 1;
		int number = 3;
		
		while( count < 120 ) {	
			int copyNumber = number;
			int reversedNumber = 0;
			while( copyNumber != 0 )
			{
				int remainder = copyNumber % 10;
				reversedNumber = reversedNumber * 10 + remainder;
				copyNumber /= 10;
			}
			
		   boolean isPalindrom = number == reversedNumber;
		   if( ! isPalindrom ) {
			   number++;
			   continue;
		   }
		   
		   int maxDivider = ( int ) Math.ceil( Math.sqrt( number ) );
		   boolean isPrime = true;
		   for( int i = 2; i <= maxDivider; i++ ) {
			   if( number % i == 0 ) {
				   isPrime = false;
				   break;
			   }
		   }
		   
		   if ( ! isPrime ) {
			   number++;
			   continue;
		   }
		   
		   System.out.print(number + "\t");
		   count++;
		   number++;
		   if( count % 10 == 0 ) {
			   System.out.println();
		   }
		}
	}    
}
