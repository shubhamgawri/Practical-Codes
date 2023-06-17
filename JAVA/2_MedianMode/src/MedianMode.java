import java.util.*;
public class MedianMode {
    public static void main(String[] args){
        float median1,median2,mode1,mode2;
        int[] a1 = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 elements for 1D array");
        for (int i = 0; i < 10; i++)
        a1[i]=s.nextInt();
        int[][] b = new int[5][2];
        System.out.println("Enter 10 elements for 2D array");
        for (int i = 0; i < 5; i++)
        for (int j = 0; j < 2; j++)
        b[i][j]=s.nextInt();
        int[] a2 = new int[10];
        int k=0;
        for (int i = 0; i < 5; i++)
        for (int j=0; j < 2; j++)
        {
          a2[k]=b[i][j];                   //Copying 2D arrary elements into 1D array
          k++;
        }
        median1=median(a1);             
        median2=median(a2);
        mode1=mode(a1);
        mode2=mode(a2);
        System.out.println("For 1D Array :\nMedian = " + median1);
        System.out.println("Mode = " + mode1);
        System.out.println("For 2D Array:\nMedian = " + median2);
        System.out.println("Mode = " + mode2);
        s.close();
}
static int median(int[] a)
{
    int median;
    Arrays.sort(a);
    if(a.length%2==0)
    median=(a[(a.length/2)-1] + a[(a.length/2)+1]) / 2;
    else
    median=a[(a.length+1)/2];
    return median;
}
static int mode(int[] a)
{
    Arrays.sort(a);
    int mode;
    int key=0,keycount=0,count;
    for (int i = 0; i < 10; i++)
    {
     count=1;
     for (int j = i+1; j < 10; j++)
     {
         if(a[i]==a[j])
         count++;
     }
      if(count>keycount)
     {
      keycount=count;
      key=a[i];
     }
    }
    mode=key;
    return mode;
 }
}
