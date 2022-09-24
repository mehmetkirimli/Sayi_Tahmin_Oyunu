import java.util.Arrays;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int gizli = (int)(Math.random()*100);
        System.out.println("gizli sayi = " + gizli);

        int hak = 0;
        int deneme = 10 ;
        int [] dizi = new int [5];
        boolean hata = true;
        int wrong = 0 ;

        while (hak < 5 )
        {
            System.out.println(" Gizli sayiyi bulmak icin  #" + (5-hak)+ " hakkiniz var.");
            System.out.print(" Gizli sayiyi bulmak icin sayi tahmininizi yazin : ");
            deneme = input.nextInt();


            if (deneme<0 || deneme >100)
            {  if (wrong ==0 )
                {
                    System.out.println("Tahmin araligi 0-100 . Farkli sayi girerseniz tekradan hakkiniz azalir !!! ");
                    wrong++;

                }
                else
                {
                    System.out.println(" Cok fazla yanlis deger girdiginiz icin hakkiniz azalacaktir. ");
                    hak++;
                }
                continue;
            }


            if (deneme == gizli)
            {
                System.out.println("Tebrikler gizli sayiyi buldunuz :) ");
                break;

            } else if (deneme>gizli)
            {
                System.out.println("Girilen sayi , gizli sayidan buyuk , daha ufak sayi tahmin et :) ");

            }else
            {
                System.out.println("Girilen sayi , gizli sayidan kucuk , daha buyuk sayi tahmin et :) ");
            }


            dizi[hak++]=deneme;

        }






        System.out.println(Arrays.toString(dizi));
    }






}
