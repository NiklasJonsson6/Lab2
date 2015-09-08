/*

 */
public class Rse
{
    public static boolean allRowSumsEqual(int [][] m)
    {
        /*
        compare all row sums
         */
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
