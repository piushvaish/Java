package com.company;

public class Main
{
    public static void main(String[ ] args)
    {
        String[ ] names = {"joe", "slim", "ed", "george"};
        sortStringBubble (names);
        for ( int k = 0;  k < 4;  k++ )
            System.out.println( names [ k ] );
    }

    public static String[] sortStringBubble(String  x [ ] )
    {
        int j;
        boolean flag = true;  // will determine when the sort is finished
        String []temp = x;

        while ( flag )
        {
            flag = false;
            for ( j = 0;  j < x.length - 1;  j++ )
            {
                if ( x [ j ].compareTo( x [ j+1 ] ) > 0 )
                {                                             // ascending sort
                    temp[j] = x[j];
                    x[j + 1] = x[j];     // swapping
                    x[j+1] = temp[j];
                    flag = true;
                }
            }
        }
        return temp;
    }
}

