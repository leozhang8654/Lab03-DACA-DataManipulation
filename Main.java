// STUDENT NAME: Leo Zhang
// DATE: 6/16/2026


public class Main
{
    public static void main(String[] args)
    {

        /***** DECLARATION SECTION *****/
        double a = (14 - 2) / 12;
        double y = 2020 + 4800 - a;
        double m = 2 + 12*a - 3;

        double JDN= (2+(153*m+2) / 5 +365*y + (y/4) -(y/100) + (y/400) -32045);

        double a1 = (14 - 26) / 12;
        double y1 = 1918 + 4800 - a1;
        double m1 = 8 + 12*a1 - 3;
        double JDN1= (26+(153*m1+2) / 5 +365*y1 + (y1/4) -(y1/100) + (y1/400) -32045);

        System.out.println("The difference in days is "+ (int)(JDN-JDN1)+", which makes you approximately "+(int)((JDN-JDN1)/365)+" years old!");
        System.out.println("Julian Day Number for today's date, 2/2/2020, is " + (int)JDN);
        System.out.println("Julian Day Number for birthday, 8/26/1918, is  "+(int)JDN1);
    }
}