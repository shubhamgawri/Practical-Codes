import java.util.Scanner;
 
public class SymmetricMatrix
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the no. of row : ");
         
        int row = sc.nextInt();
         
        System.out.println("Enter the no. of columns : ");
         
        int col = sc.nextInt();
         
        int matrix[][] = new int[row][col];
         
        System.out.println("Enter the elements :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Printing the input matrix :");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
         
        if(row != col)
        {
            System.out.println("The given matrix is not a square matrix");
        }
        else
        {
            boolean symmetricity = true;
             
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetricity = false;
                        break;
                    }
                }
            }
             
            if(symmetricity)
            {
                System.out.println("Given Matrix is symmetric");
            }
            else
            {
                System.out.println("Given Matrix is not symmetric");
            }
        }
         
        sc.close();
    }
}