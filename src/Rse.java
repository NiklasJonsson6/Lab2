/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class Rse
{
    public static boolean allRowSumsEqual(int [][] m)
    {
        if (m == null)
            return true;

        for (int k= 1; k < m.length; k++)
        {
            if (rowSum(m[0]) != rowSum(m[k]))
                return false;
        }
        return true;
    }

    public static int rowSum(int[] v)
    {
        int sum = 0;
        if (v == null)
            return 0;

        for (int k = 0; k < v.length; k++)
            sum += v[k];

        return sum;
    }
}
