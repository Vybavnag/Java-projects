
import java.util.*;
public class cramer{

int A[][];
int m[][];
int N=4;
int B[];

public int[] cramers(int A[][],int B[])
{
  int temp[][] = new int[N][N];
  int x[] = new int[N];
  for(int i=0;i<N;i++)
  {
      for(int j=0;j<N;j++){
         for(int k=0;k<N;k++){
           if(k == i)
            temp[j][k] = B[j];
            else
             temp[j][k] = A[j][k];      
           }
		   }
		   int r=determinant.determinantOfMatrix(temp,N);
		   int r1=determinant.determinantOfMatrix(A,N);
       x[i]=r/r1;


    }
 for(int i=0;i<N;i++){
 System.out.println(x[i]);}
return x;
}


public static void main(String args[]){


 cramer d = new cramer();
 int A [] [] =    {{ 1, 0, 2, -1 },
					   { 3, 0, 0, 5 },
					   { 2, 1, 4, -3 },
		               { 1, 0, 5, 0 }};  
 int B []= {4,7,8,20};
  d.cramers(A,B);
   }
}
 