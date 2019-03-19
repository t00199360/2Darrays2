import javax.swing.*;
import java.util.Random;

public class TerrainAnalysis
{

    String sizeOfGrid = JOptionPane.showInputDialog(null,"Please enter how big you want the grid to be: ");
    int sizeOfGridAsInt = Integer.parseInt(sizeOfGrid);

    private final int FIRSTN = sizeOfGridAsInt;
    private final int SECONDN = sizeOfGridAsInt;


    private int[] nfirst =
            {

            };

    private int[] nsecond =
            {

            };
    private TerrainMain[][] grid;

    public TerrainAnalysis()
    {
        grid = new TerrainMain[FIRSTN][SECONDN];
        // the grid will have null values
    }

    public void set(int nfirst, int nsecond, TerrainMain details)
    {
        grid[nfirst][nsecond] = details;
        //store details at the specified position in the grid
    }

    public static int randomFill()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public void display()
    {
        System.out.printf("%15s", "");
        for(int i=0; i < nsecond.length; i++)
        {
            System.out.printf("%-20s",nsecond[i]);
        }
        System.out.println();

        for(int i = 0; i < FIRSTN; i++)
        {
            System.out.printf("%-15s", nfirst[i]);

            for (int j = 0; j < FIRSTN; j++)
            {
                System.out.printf("%-20s",grid[i][j]);
            }
            System.out.println("\n");
        }

    }
}
