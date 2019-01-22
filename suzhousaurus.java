
/**
 * Write a description of class jeholopterus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class suzhousaurus extends DainougheSauwuher
{
    public suzhousaurus()
    {
        super("suzhousaurus");
    }
    public boolean attack(DainougheSauwuher def)
    {
        if(def.getType().equals("suzhousaurus"))
        {
            if(Math.random() < 0.30)
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
        else if(Math.random() < 0.70)
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
