import java.text.DecimalFormat;
import java.util.Scanner;
public class Consumo
{
    public static void main (String[] args)
    {
        int D;
        float C,R;
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner leitor = new Scanner(System.in);
        D = leitor.nextInt();
        Scanner read = new Scanner(System.in);
        C = read.nextFloat();
        R = D/C;
        System.out.println(df.format(R)+" km/l");
    }
}
