package Week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int [] scores= {50,48,29,68,80,76,50,85,68,40,80};
		
		Arrays.sort(scores);
		
				
		for (int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
			
			if (scores[i]==scores[i+1]) {
				
			System.out.println(scores[i]);
			}
			
			
			
			
		}
		
		
	}

}
