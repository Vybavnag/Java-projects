import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class mergesort {
public static void main (String [] args){
		long startTime = System.nanoTime();
		Scanner inp = new Scanner(System.in);
        System.out.println("length");
		int length = inp.nextInt();
        System.out.println("mid value");
        int m = inp.nextInt();
		System.out.println("max");
        int r = inp.nextInt();
        int [] x= new int[length];

		 
        int count= 0;
    
    
        while (count<length)
        {
           x[count]= (int)(Math.random()*m);
            count++;
        }
		 int n1 = m + 1;
        int n2 = r - m;
		int u[] = new int[n1];
        int f[] = new int[n2];
	
	for (int i = 0; i < n1; ++i){
            u[i] = x[1 + i];
			}
        for (int j = 0; j < n2; ++j){
            f[j] = x[m + 1 + j];
			}
			int i = 0;
			int j = 0;
	
	int k = length;
        while (i < n1 && j < n2) {
            if (u[i] <= f[j]) {
               x[k] = u[i];
                i++;
            }
            else {
                x[k] = f[j];
                j++;
            }
            k++;
        }
		  while (i < n1) {
            x[k]=u[i];
            i++;
            k++;
        }
 
     
        while (j < n2) {
            x[k] = f[j];
            j++;
            k++;
        }
//for (int i = 0; i <list.length; i++) {     
          // System.out.print(list[i] + " ");    
       // }    
        
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000);

    }
	

}

    