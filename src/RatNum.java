/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class RatNum
{
    private int t, n;

    public RatNum()
    {
        t = 0;
        n = 1;
    }

    public RatNum(int a)
    {
        t = a;
        n = 1;
    }

    public RatNum(int a, int b)
    {
        if (b == 0)
            throw new NumberFormatException("Denominator = 0");
        if (a < 0 && b < 0)
            {
                a /= -1;
                b /= -1;
            }
        if (b < 0)
            b /= -1;

        a /= gcd(a, b);
        b /= gcd(a, b);
        t = a;
        n = b;
    }

    public RatNum(RatNum r)
    {
        t = r.t;
        n = r.n;
    }

    public int getNumerator(RatNum r)
    {
        return r.t;
    }

    public int getDenominator(RatNum r)
    {
        return r.n;
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
