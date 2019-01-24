import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class DinoDrive3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDrive3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<DainougheSauwuher> myPop = new ArrayList<DainougheSauwuher>();
        System.out.println("How many dinosaurs in the population?");
        int popSize = scan.nextInt();
        for(int i = 0;i<popSize;i++)
        {
            double rand = Math.random();
            if (rand < 0.33)
                myPop.add(new teerayks());
            if (rand > 0.33 && rand < 0.66)
                myPop.add(new suzhousaurus());
            if (rand > 0.66)
                myPop.add(new jeholopterus());
        }
        
        System.out.println(myPop.size() + " dinosaur(s) created.");
        System.out.println(myPop);
        //while (1>0)
        for (DainougheSauwuher d : myPop)
        {
            for(int i = 0 ; i < Math.random()*36 ; i++)
                d.ageUp();
        }
        System.out.println("How many rounds?");
        int roundCount = scan.nextInt();
        for(int i = 0; i < roundCount; i++)
        {
            for (DainougheSauwuher d : myPop)
                System.out.println(d);
            for (DainougheSauwuher d : myPop)
                d.attack(myPop.get(getDefender(myPop, d)));
            for (DainougheSauwuher d : myPop)
                d.ageUp();
            for (DainougheSauwuher d : myPop)
                if (weddingBells(danceCard(myPop), d))
                {    
                    if(d.getType().equals("jeholopterus"))
                        myPop.add(new jeholopterus());
                    if(d.getType().equals("suzhousaurus"))
                        myPop.add(new suzhousaurus());
                    if(d.getType().equals("teerayks"))
                        myPop.add(new teerayks());    
                }
        }
        
        
        
        // for(int i = 0; i < myPop.size(); i++)
            // if(livingDinos(myPop) >= 2)
                // for(DainougheSauwuher d : myPop)
                // {
                    // d.attack(myPop.get(getDefender(myPop, d)));
                    // d.checkHealth();
                // }                        
                
                
        System.out.println(livingDinos(myPop));
        
        //dinoMate(myPop);
        //System.out.println(livingDinos(myPop));
    }
    public static int livingDinos( ArrayList<DainougheSauwuher> p )
    {
        int living = 0;
        for(DainougheSauwuher d : p)
        {
            if(d.getIsAlive())
                living++;
        }
        return living;
    }
    public static int getDefender(ArrayList<DainougheSauwuher> p, DainougheSauwuher atk)
    {
        DainougheSauwuher def;
        int rand = -1;
        do //def is attacking dinosaur
        {
            rand = (int)(Math.random() * p.size());
            def = p.get(rand);
        }while(def == atk || !def.getIsAlive());
        return rand;
    }
    public static void dinoMate(ArrayList<DainougheSauwuher> p)
    {
        double rand = -1;
        for(int i = 0; i < (p.size()/4); i++)
        {
            rand = Math.random();
            if (rand < 0.33)
                p.add(new teerayks());
            if (rand > 0.33 && rand < 0.66)
                p.add(new suzhousaurus());
            if (rand > 0.66)
                p.add(new jeholopterus());
        }
    }
    public static boolean mateable(DainougheSauwuher d)
    {
        if(d.getHealth() > 20 && d.getAge() > 7 && d.getAge() < 32)
            return true;
        else
            return false;
    }
    public static ArrayList danceCard(ArrayList<DainougheSauwuher> p)
    {
        ArrayList<DainougheSauwuher> danceCard = new ArrayList<DainougheSauwuher>();
        int random = (int)(p.size()*0.1);
        for(int i = 0; i < random; i++)
        {
            int rand = (int)(Math.random() * p.size());
            danceCard.add(p.get(rand));
        }
        return danceCard;
    }
    public static boolean weddingBells(ArrayList<DainougheSauwuher> p, DainougheSauwuher d)
    {
        boolean val = false;
        for(DainougheSauwuher a : p)
        {
            if (d.getType().equals(a.getType()))
            {
                if(mateable(a) && mateable(d))
                    if(d.getGender() != a.getGender())
                        val = true;
            }
            else
                val = false;
        }
        return val;
    }
}