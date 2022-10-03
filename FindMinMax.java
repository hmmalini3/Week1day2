package Week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		
		int [] numbers= {3,6,2,8,5,78,45,32,3,2,45};
		
		Arrays.sort((numbers));
		
		System.out.println(Arrays.toString(numbers));
	    
     System.out.println("The min value" + numbers[0]);
     
     System.out.println("The max value"+ numbers[numbers.length-1]);
        
        	
         
            
            
        }
        
          
		
	}


