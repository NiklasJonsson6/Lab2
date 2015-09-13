/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class RatNum
{
    private int t, n;

    public RatNum() //t = 0, n = 1, default values
    {
        t = 0;
        n = 1;
    }

    public RatNum(int a) //custom t value
    {
        t = a;
        n = 1;
    }

    public RatNum(int a, int b) //both values custom
    {
        if (b == 0)
            throw new NumberFormatException("Denominator = 0");
        else if (a < 0 && b < 0)
            {
                a /= -1;
                b /= -1;
            }
        else if (b < 0)
        {
            b /= -1;
            a /= -1;
        }


        int c_gcd = gcd(a, b);  //current gcd, calculated before changing a and b
        a /= c_gcd;
        b /= c_gcd;
        t = a;
        n = b;
    }

    public RatNum(RatNum r) //copy existing RatNum
    {
        t = r.t;
        n = r.n;
    }

    public int getNumerator()
    {
        return t;
    }

    public int getDenominator()
    {
        return n;
    }

    public static int gcd(int m, int n) //return greatest common divisor
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
