import java.util.Scanner;
public class main
{
    public static void main()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj podstawe");
        int a=input.nextInt();
        System.out.println("Podaj wykładnik");
        int n=input.nextInt();
        int wynik=1;
        boolean wykladnikUjemny=false;
        if(n<0)
        {
            wykladnikUjemny=true;
            n=n*(-1);
        }
        for(int i=0;i<n;i++)        
        {
            wynik*=a;
        }  

        if(wykladnikUjemny==false)
        {
            System.out.println("wynik ="+wynik);
        }
        else 
        {
        System.out.println("wynik ="+(1.0/wynik));
    }
    }
}
