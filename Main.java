
// STUDENT NAME: Leo Zhang
// DATE: 6/16/2026
 
 
public class Main
{
    public static void main(String[] args)
    {
 
        /***** DECLARATION SECTION *****/
        // Today's date: 2/2/2020  (month = 2, day = 2, year = 2020)
        int a = (14 - 2) / 12;
        int y = 2020 + 4800 - a;
        int m = 2 + 12 * a - 3;
        int JDN = 2 + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
 
        // Birthday: 8/26/1918  (month = 8, day = 26, year = 1918)
        int a1 = (14 - 8) / 12;        // use the MONTH (8), not the day (26)
        int y1 = 1918 + 4800 - a1;
        int m1 = 8 + 12 * a1 - 3;
        int JDN1 = 26 + (153 * m1 + 2) / 5 + 365 * y1 + y1 / 4 - y1 / 100 + y1 / 400 - 32045;
 
        /***** OUTPUT SECTION *****/
        System.out.println("Julian Day Number for today's date, 2/2/2020, is " + JDN);
        System.out.println();
        System.out.println("Julian Day Number for birthday, 8/26/1918, is " + JDN1);
        System.out.println();
        System.out.println("The difference in days is " + (JDN - JDN1)
                + ", which makes you approximately " + ((JDN - JDN1) / 365) + " years old!");
    }
}