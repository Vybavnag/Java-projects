import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class selectionsort
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
	

		for (int i = 0; i <list.length; i++) {     
         for (int j = i+1; j <list.length; j++) {     
            if(list[i] >list[j]) {      //swap elements if not in order
                a = list[i];    
                list[i] = list[j];    
                list[j] = a;    
               }     
            }     
        }    
//for (int i = 0; i <list.length; i++) {     
          // System.out.print(list[i] + " ");    
       // }    
        
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000);
		
		return;
    }
	
}

 //1609866957364
 //1609866990682
 //1609867018738
 //1609867674684
 //1609867859683
 //1609867859683