
/**
 * Write a description of class dinoDrive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dinoDrive1
{
    public static void main(String[] args)
    {
        //DainougheSauwuher d = new DainougheSauwuher("fire");
        DainougheSauwuher d1 = new teerayks();
        DainougheSauwuher d2 = new jeholopterus();
        DainougheSauwuher d3 = new suzhousaurus();
        d1.setHealth(100);
        d2.setHealth(100);
        d3.setHealth(100);
        int winCount = 0;
        
        for(int i=0; i<150; i++)
        {
            if (d2.getIsAlive())
                if (d1.attack(d2) == true)
                    winCount++;
            System.out.println(d1.toString()+ " ----- " + d2.toString());
            if (d1.getIsAlive())
                d1.ageUp();
            if (d2.getIsAlive())
                d2.ageUp();
            if (d3.getIsAlive())
                d3.ageUp();
        }
        System.out.println(winCount +" out of 150 attacks");
    }
}