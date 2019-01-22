
/**
 * Abstract class DainougheSauwuher - it's a dino just read the name
 *
 * @author the creator
 * @version THE ULTIMATE IN N OUT ORDER: 3x3 Animal style no pickles or tomato with peppers and extra grilled onion, animal fries and a neopolitan shake
 */
public abstract class DainougheSauwuher
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int wins;
    private int battleCount;
    private double health;
    private boolean isAlive; 
    
    /**
     * Dino constructor
     * No default constructor because it varies per dino with all different types.
     */
    public DainougheSauwuher(String t)
    {
        this.type = t;
        this.age = 0;
        this.wins = 0;
        this.health = 10;
        this.battleCount = 0;
        this.isAlive = true;
        if (Math.random() > 0.5)
            this.gender = "m";
        else
            this.gender = "f";
        
    }
    /**
     * attack is abstact because every different dino will have a different way to attack, functionality with new future dinosaurs will work
     */
    public abstract boolean attack(DainougheSauwuher def);
    public void ageUp()
    {
        //increase age + health as a result, dying once past age 100
        this.age++;
        if(this.age <= 100 && this.isAlive == true)
            this.health = this.health + 90 * (this.age * 0.01);
        else
            this.health-=2;
        this.checkHealth();
    }
    public void checkHealth()
    {
        if (this.health <= 0)
        {
            if(this.isAlive == true) //health is 0 but isAlive is true (just died)
                System.out.println("\t" + this.toString() + " | NOW DEAD");
            this.isAlive = false;
            this.health = 0;
        }
        else if (this.health > 100)
            this.health=100;
    }
    public String toString()
    {
        String temp = "";
        //temp = this.type + " " + this.age + " " + this.health + " " + this.gender + " " + this.wins;
        temp = this.gender + " " + this.type + " " + this.health;
        return temp;
    }
    public void update(boolean winner, DainougheSauwuher otherD)
    {
        this.battleCount++;
        otherD.setBattleCount(otherD.getBattleCount() + 1);
        if (winner)
        {
            this.wins++;
            otherD.setHealth(otherD.getHealth() - 20.0);
            otherD.checkHealth();
        }
        if (!winner)
        {
            otherD.setWins(otherD.getWins()+1);
            this.health = this.health - 20.0;
            this.checkHealth();
        }
    }
    /**
     * Setters******************************************************************************************************************************
     */
    public void setAge(int a)
    {
        this.age = a;
    }
    public void setType(String t)
    {
        this.type = t;
    }
    public void setGender(String g)
    {
        this.gender = g;
    }
    public void setWins(int w)
    {
        this.wins = w;
    }
    public void setBattleCount(int sbc)
    {
        this.battleCount = sbc;
    }
    public void setHealth(double h)
    {
        this.health = h;
    }
    public void setIsAlive(boolean a)
    {
        this.isAlive = a;
    }
    /**
     * Getters******************************************************************************************************************************
     */
    public int getAge()
    {
        return this.age;
    }
    public int getWins()
    {
        return this.wins;
    }
    public String getType()
    {
        return this.type;
    }
    public String getGender()
    {
        return this.gender;
    }
    public int getBattleCount()
    {
        return this.battleCount;
    }
    public double getHealth()
    {
        return this.health;
    }
    public boolean getIsAlive()
    {
        return this.isAlive;
    }
}