package rotate1;

import java.util.ArrayList;
import java.util.Scanner;

public class monk2 {
	static String rotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	static int Conversion(String s, int k) {
		int b = Integer.parseInt(s,2);
		return b;
	}
	public static void main(String args[] ) throws Exception {
        //  Sample code to perform I/O:
        //  * Use either of these methods for input

        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        // String name = s.nextLine();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int EnterCases = s.nextInt();
        for (int x = 0; x<EnterCases; x++) {

        // Write your code here
        String A;
        int N = s.nextInt();
        int K = s.nextInt();
        A = s.next();
        ArrayList<Integer> Result = new ArrayList<Integer>(); 
        int max = 0;
        
        for(int j=0;j<N;j++) {
        	String Rotated = rotate(A,j);
        	int converted = Conversion(Rotated, 2);
        	if (converted > max) {
        		max = Conversion(A, j);
        		       	}
        }
        int i =0;
        while(i>=0) {
        	if (Conversion(rotate(A, i%N),2)==max) {

        		Result.add(i);
        	
        		if(Result.size() == K+1) {
        	   		
        	        System.out.println(Result.get(K)-1);
        			break;
        		}
        		
        	}
        	
        	i++;
        }



    }
	}
}


