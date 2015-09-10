/*
Grupp 13
Niklas Jonsson
Simon Moos
 */
public class TestRse
{
    public static void main(String[] args)
    {
        int [][] a = { {1, 2, 1, 2, 1, 2},      //testmatriser...
                       {4, 0, 0, 2, 2, 1},
                       {1, 1, 1, 1, 1, 4} };

        int [][] b = { {1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {1, 1, 1, 1} };

        print(a);
        if (Rse.allRowSumsEqual(a))
            System.out.println("All sums are equal!");
        else
            System.out.println("All sums are not equal!");

        print(b);
        if (Rse.allRowSumsEqual(b))
            System.out.println("All sums are equal!");
        else
            System.out.println("All sums are not equal!");
    }

    static void print(int[][] m)    //Magnus metod f�r utskrift
    {
        if (m == null)
            System.out.print("[ null ]");

        else if (m.length == 0)
            System.out.print("[ - ]");

        else
        {
            System.out.print("[ ");
            for (int row = 0; row < m.length; row++)
            {
                if (m[row] == null)
                    System.out.print("null ");

                else
                {
                    System.out.print("{ ");
                    if (m[row].length == 0)
                        System.out.print("- ");

                    else
                    {
                        for (int col = 0; col < m[row].length; col++)
                            System.out.print(m[row][col] + " ");
                    }
                    System.out.print("} ");
                }
            }
            System.out.println("]");
        }
    }
}
