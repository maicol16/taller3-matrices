import java.util.*;
class Circular_Matrix
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el número de elementos");
            int n = sc.nextInt();
 
            int A[][] = new int[n][n];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
 
            while(k<=n*n)
                {
                    for(int i=r1;i<=r2;i++)
                    {
                        A[c1][i]=k++;
                    }
 
                    for(int j=c1+1;j<=c2;j++)
                    {
                        A[j][r2]=k++;
                    }
 
                    for(int i=r2-1;i>=r1;i--)
                    {
                        A[c2][i]=k++;
                    }
 
                    for(int j=c2-1;j>=c1+1;j--)
                    {
                        A[j][r1]=k++;
                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            /* Printing the Circular matrix */
            System.out.println("La Matriz  es:");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(A[i][j]+ "\t");
                        }
                 System.out.println();
                }
        }
    }