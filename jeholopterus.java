
/**
 * Write a description of class jeholopterus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class jeholopterus extends DainougheSauwuher
{
    public jeholopterus()
    {
        super("jeholopterus");
    }
    public boolean attack(DainougheSauwuher def)
    {
        if(def.getType().equals("jeholopterus"))
        {
            if(Math.random() < 0.50)
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
        else if(Math.random() < 0.85)
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
