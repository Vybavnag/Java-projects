import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class insertionsort{
	public static void main (String [] args){
		long startTime = System.nanoTime();
		Scanner inp = new Scanner(System.in);
        System.out.println("length");
        int length = inp.nextInt();
        System.out.println("Max");
        int m = inp.nextInt();
        int [] x= new int[length];
        
        int count= 0;
    
    
        while (count<length)
        {
           x[count]= (int)(Math.random()*m);
            count++;
        }
       
		for (int i =0; i<x.length; i++){
			int temp = x[i];
			int j=i-1;
			while (j>=0 && x[j]>temp){
				x[j+1]= x[j];
				j= j-1;
			}
			x[j+1]= temp;
		}
		//for (int i = 0; i < x.length; ++i) {
           // System.out.print(x[i] + " "); 
		//	}
     //   System.out.println(); 
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000);
		
    } 
	
}