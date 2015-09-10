/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class Rse
{
    public static boolean allRowSumsEqual(int [][] m) //returnerar true/false om allrowsumsequal
    {
        if (m == null || m.length == 0)  //om matrisen �r null �r summorna lika
            return true;

        int sum = rowSum(m[0]);
        for (int k= 1; k < m.length; k++)
        {
            if (sum != rowSum(m[k]))   //j�mf�r samtliga rader med f�rsta raden
                return false;
        }
        return true;
    }

    public static int rowSum(int[] v)   //summera rader
    {
        int sum = 0;
        if (v == null)  //om raden �r null �r radens summa 0
            return 0;

        for (int k = 0; k < v.length; k++)
            sum += v[k];

        return sum;
    }
}
