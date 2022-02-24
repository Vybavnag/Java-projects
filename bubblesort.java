import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class bubblesort
{
    public static void main(String[]args)
    {
		long startTime = System.nanoTime();
        Scanner inp = new Scanner(System.in);
        System.out.println("N");
        int n = inp.nextInt();
        System.out.println("Max");
        int m = inp.nextInt();
        int [] list= new int[n];
        
        int count= 0;
        int a= 0;
     
        while (count<n)
        {
            list[count]= (int)(Math.random()*m);
            count++;
        }
        count=0;
        for (int i = 0; i < list.length-1; i++) 
            for (int j = 0; j < list.length-i-1; j++) 
                if (list[j] >list[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = list[j]; 
                    list[j] = list[j+1]; 
                    list [j+1] = temp; 
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