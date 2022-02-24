import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class QuickSort { 
	public static void main (String [] args){
		long startTime = System.nanoTime();
		Scanner inp = new Scanner(System.in);
        System.out.println("length");
        int length = inp.nextInt();
        System.out.println("Max");
        int m = inp.nextInt();
		System.out.println("r");
        int r = inp.nextInt();
        int [] x= new int[length];

		 
        int count= 0;
    
    
        while (count<length)
        {
           x[count]= (int)(Math.random()*m);
            count++;
        }
		 
    int partition(int arr[], int low, int high) 
    { 
        int pivot = x[m];  
        int i = (r-1); 
        for (int j=r; j<m; j++) 
        { 
           
            if (x[j] < pivot) 
            { 
                i++; 
  
  
                int temp = x[i]; 
                x[i] =x[j]; 
                x[j] = temp; 
            } 
        } 
  
   
        int temp = x[i+1]; 
        x[i+1] = x[high]; 
        x[high] = temp; 
   
    } 
  	for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i] + " "); 
			}
        System.out.println(); 
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000);
		
	}
}

 
   
  
    
  