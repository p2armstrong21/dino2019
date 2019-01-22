import java.util.Scanner;
/**
 * Write a description of class DinoDrive2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDrive2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int deadCount = 0;
        int winCount = 0;   
        int battleCount = 0;
        int roundCount = 0;
        int roundDead = 0;
        System.out.println("How Many Dinos?");
        int dinoCount = scan.nextInt();
        DainougheSauwuher[] pop = new DainougheSauwuher[dinoCount];
        for(int i = 0; i<(dinoCount/3) ; i++)
            pop[i] = new teerayks();
        for(int i = (dinoCount/3); i<(dinoCount/3)*2 ; i++)
            pop[i] = new jeholopterus();
        for(int i = (dinoCount/3)*2; i<dinoCount ; i++)
            pop[i] = new suzhousaurus();
        int deadBefore = 0;
        int deadAfter = 0;
        for(DainougheSauwuher d : pop) //for each loop
            {
                for(int i = 0; i < (int)(Math.random()*36); i++)
                {   
                    d.ageUp();
                }
            }
        while(livingDinos(pop) != 1)
        {
            deadBefore = pop.length - livingDinos(pop);
            for(DainougheSauwuher d : pop) 
            {    
                if(d.getIsAlive())
                {
                    if(livingDinos(pop) >= 2)
                    {
                        DainougheSauwuher defend = DinoDrive2.getDefender(pop, d);
                        battleCount++;
                        if(d.attack(defend))
                            winCount++;
                    }
                }
            }
            for(DainougheSauwuher d : pop)
                d.ageUp();
            roundCount++;
            deadAfter = pop.length - livingDinos(pop);
            roundDead = deadAfter - deadBefore;
            deadCount = deadCount + roundDead;
            System.out.println("Died This Round: " + roundDead);
        }
        System.out.println("Total Battles: " + battleCount + "  Total Wins: " + winCount + "  Dinos Remaining: " + livingDinos(pop));
        for (DainougheSauwuher d : pop)
            if(d.getIsAlive())
                System.out.println("Last Dino: " + d);
    }
    public static int livingDinos( DainougheSauwuher[] p )
    {
        int living = 0;
        for(DainougheSauwuher d : p)
        {
            if(d.getIsAlive())
                living++;
        }
        return living;
    }
    public static DainougheSauwuher getDefender(DainougheSauwuher[] p, DainougheSauwuher atk)
    {
        DainougheSauwuher def;
        do //def is attacking dinosaur
            def = p[(int)(Math.random()*p.length)];
        while(def == atk || !def.getIsAlive());
        return def;
    }
}