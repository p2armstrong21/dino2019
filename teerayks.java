
/**
 * Write a description of class trex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class teerayks extends DainougheSauwuher
{
    public teerayks()
    {
        super("teerayks");
    }
    public boolean attack(DainougheSauwuher def)
    {
        if(def.getType().equals("teerayks"))
        {
            if(Math.random() < 0.55)
            {
                this.update(true, def);
                return true;
            }
            else
            {
                this.update(false, def);
                return false;
            }
        }
        else if(Math.random() < 0.35)
        {
            this.update(true, def);
            return true;
        }
        else
        {
            this.update(false, def);
            return false;
        }
    }
}
