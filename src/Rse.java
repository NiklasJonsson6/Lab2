/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class Rse
{
    public static boolean allRowSumsEqual(int [][] m) //returnerar true/false för om alla rader i matrisen har samma summa
    {
        if (m == null)  //om matrisen är null är summorna lika
            return true;

        for (int k= 1; k < m.length; k++)
        {
            if (rowSum(m[0]) != rowSum(m[k]))   //jämför samtliga rader med första raden
                return false;
        }
        return true;
    }

    public static int rowSum(int[] v)   //summera rader
    {
        int sum = 0;
        if (v == null)  //om raden är null är radens summa 0
            return 0;

        for (int k = 0; k < v.length; k++)
            sum += v[k];

        return sum;
    }
}
