/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class RatNum
{
    public RatNum()
    {
        int a = 0;
        int b = 1;
    }

    public RatNum(int t)
    {
        int a = t;
        int b = 1;
    }



    public static int gcd(int m, int n)
    {
        if (m < 0)
            m /= -1;
        if (n < 0)
            n/= -1;

        if (m == 0 && n == 0)
            throw new IllegalArgumentException();

        else if (m == 0 || m == n)
            return n;

        else if (n == 0)
            return m;


        int r;
        while (true)
        {
            r = m % n;
            if (r == 0)
                return n;

            m = n;
            n = r;
        }
    }
}
