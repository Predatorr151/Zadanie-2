
import java.util.Scanner;
public class potegowanie_while
{
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj podstawe");
        int a=input.nextInt();
        System.out.println("Podaj wykładnik");
        int n=input.nextInt();
        int wynik=1;
        int i=0;
        while(i<n)
        {
            wynik*=a;
            i++;
        }

        System.out.println("wynik ="+wynik);

    }
}
