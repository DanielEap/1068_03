
public class AsciiArt2 {
	//SIZE works for all positive integers
	public static final int SIZE = 2;
	//ITERATIONS prints number of art next to each other
	//works for all nonzero positive integers
	public static final int ITERATIONS = 4;
	
	public static final int EXTRA_CREDIT_SIZE = 4;
	
	public static void main(String[] args) {
		/*will print the snowflake
		snowflakeUpper and snowflakeLower have the doubly nested*/
		snowflakeUpper();
		snowflakeMiddle();
		snowflakeLower();
		parkingLot();
		
		
	}
	//initial snowflake drawing will be 16 wide and 8 tall when SIZE is 2
	
	public static void snowflakeUpper() {
		/*snowflake tiers is the "y" axis, 
		occurrences is iterations and applies to "x" axis
		spaces left means as is
		*/
		for(int snowflakeTiers = SIZE; snowflakeTiers >= 0; snowflakeTiers--) {
			for(int occurrences = 0; occurrences < ITERATIONS; occurrences++) {
				for(int spacesLeft = 0; spacesLeft <= ((2* SIZE)- snowflakeTiers); spacesLeft++) {
					System.out.print(" ");
				}
				//print left snowflake branch
				System.out.print("_\\/");
				//largest space in middle will be * 2 
				//should start initial from 0 and will decrease because snowflakeTiers--
				for(int spacesMiddle = 0; spacesMiddle < (snowflakeTiers *2 ); spacesMiddle++) {
					System.out.print(" "); 
				}
				//right branch
				System.out.print("\\/_");
				//spaces right help for the connectivity with the occurrences
				for(int spacesRight = 0; spacesRight <= ((2* SIZE )- snowflakeTiers); spacesRight++) {
					System.out.print(" ");
				}
			}
			//print new line so that the next snowflake tier can fill
			System.out.println();
		}
		
	}
	public static void snowflakeMiddle() { 	
		for(int occurrences = 0; occurrences < ITERATIONS; occurrences++) {
			//upper structure of the left side of the middle portion
			 	for(int snowflakeLeft = 0; snowflakeLeft < 2 + SIZE; snowflakeLeft++) {
				System.out.print("_\\");
			}
			//upper structure, right side, middle
			for(int snowflakeRight = 0; snowflakeRight < 2 + SIZE; snowflakeRight++) {
				System.out.print("/_");
			}
		}
		//new line for bottom structure, spaces added to account for the additional "_" that is part of the upper structure
		System.out.println();
		System.out.print(" ");
		for(int occurrences = 0; occurrences < ITERATIONS; occurrences++) {
			for(int snowflakeBottomLeft = 0; snowflakeBottomLeft < SIZE; snowflakeBottomLeft++) {
				System.out.print("/ ");
			}
			//intersection
			System.out.print("/_/\\_\\");
			for(int snowflakeBottomRight = 0; snowflakeBottomRight < SIZE; snowflakeBottomRight++) {
				System.out.print(" \\");
			}
			//spaces in order to help with occurrences
			System.out.print("  ");
		}
		//new line to help with occurrences
		System.out.println();
	}
	//does same thing as snowflakeUpper, just in reverse
	public static void snowflakeLower() {
		for(int snowflakeTiers = 0; snowflakeTiers <= SIZE; snowflakeTiers++) {
			for(int occurrences = 0; occurrences < ITERATIONS; occurrences++) {
				for(int spacesLeft = 0; spacesLeft <= ((2* SIZE)- snowflakeTiers); spacesLeft++) {
					System.out.print(" ");
				}
				//print left snowflake branch
				System.out.print("_/\\");
				for(int spacesMiddle = 0; spacesMiddle <(snowflakeTiers * 2); spacesMiddle++) {
					System.out.print(" "); 
				}
				System.out.print("/\\_");
				for(int spacesRight = 0; spacesRight <= ((2* SIZE)- snowflakeTiers); spacesRight++) {
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		}		
	}
	//reference 
	/*    _\/    \/_   				SIZE 2		
	       _\/  \/_
	        _\/\/_
	   _\_\_\_\/_/_/_/_
	   	/ / /_/\_\ \ \
	   	    _/\/\_
	   	   _/\  /\_
	   	  _/\    /\_
	   	  
	   	  
	   	  
	     _\/      \/_	  			SIZE 3
	   	  _\/    \/_   
	       _\/  \/_
	        _\/\/_
	 _\_\_\_\_\/_/_/_/_/_
	  / / / /_/\_\ \ \ \
	   	    _/\/\_
	   	   _/\  /\_
	   	  _/\    /\_
	   	 _/\      /\_
	   	 */

	
	
	
	
	// EXTRA CREDIT
	
	public static void parkingLot() {
		System.out.print(" ");
		//prints upper border
		for(int top = 0; top <= (EXTRA_CREDIT_SIZE * 4); top++) {
			System.out.print("_");
		}
		System.out.println();
		for(int rows = 0; rows < (EXTRA_CREDIT_SIZE *4); rows++) {
			for(int mid = 0; mid < 2; mid++) {
				System.out.print("|");
				for(int underscores = 0; underscores < (EXTRA_CREDIT_SIZE * 2); underscores++) {
					System.out.print("_");
				}
			}
			System.out.print("|");
			System.out.println();
		}
	}
}	
