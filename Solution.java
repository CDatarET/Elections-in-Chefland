import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int i = 0; i < cases; i++){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    
		    if(a > 50){
		        System.out.println("A");
		    }
		    else if(b > 50){
		        System.out.println("B");
		    }
		    else if(c > 50){
		        System.out.println("C");
		    }
		    else{
		        System.out.println("nota");
		    }
		}
	}
}
