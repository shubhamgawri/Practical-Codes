import java.util.*;
class Main
{
    public static void main(String[] args) {
    Random r = new Random();

    String word = "rnotf";
    word = scramble( r, word );
}

public static String scramble( Random random, String inputString )
{
    char a[] = inputString.toCharArray();
    for( int i=0 ; i<a.length ; i++ )
    {
        int j = random.nextInt(a.length);
        char temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp;
        System.out.println(a);
    }       
    return new String( a );
}
}