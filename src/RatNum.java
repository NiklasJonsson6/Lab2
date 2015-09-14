/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class RatNum
{
    private int t, n;

    //constructors:

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

    public RatNum(String s)
    {
        this(parse(s));
    }   //value from string

    //instance methods:

    public int getNumerator()
    {
        return t;
    }

    public int getDenominator()
    {
        return n;
    }

    public String toString()
    {
        return t + "/" + n;
    }

    public double toDouble()
    {
        return (double)t/n;
    }

    public boolean equals(RatNum r)
    {
        return t == r.t && n == r.n;
    }

    public boolean lessThan(RatNum r)
    {
        double ta = t, tb = r.t, na = n, nb = r.n;
        return ta / na < tb / nb;
    }

    public RatNum add(RatNum r)
    {
        return new RatNum((t*r.n + n*r.t), (n*r.n));
    }

    public RatNum sub(RatNum r)
    {
        return new RatNum((t*r.n - n*r.t), (n*r.n));
    }

    public RatNum mul(RatNum r)
    {
        return new RatNum(t*r.t, n*r.n);
    }

    public RatNum div(RatNum r)
    {
        return new RatNum(t/r.t, n/r.n);
    }

    //class methods:

    public static RatNum parse(String s)
    {
        if (s == null)
            throw new NumberFormatException("null");

        int d = s.length(); //will later hold '/'-s place in the string s

        if (s.charAt(0) == '/') //if '/' is the first char in s
            throw new NumberFormatException();

        for (int k = 0; k < s.length(); k++) //create integers t, n
        {
            if (s.charAt(k) == '/')
                d = k;
        }
        if (d == s.length())    //if no '/' was found
            s += "/1";

        int t = Integer.parseInt(s.substring(0, d));
        int n = Integer.parseInt(s.substring(d+1, s.length()));

        return new RatNum(t, n);
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
