/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTester
{
    public static void main(String[] args)
    {
        System.out.print("How many words?: ");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int numWords = scan.nextInt();
        System.out.println(numWords);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println(words.size());
        words.add("FUN!");
        words.add("haHAA");
        words.add(0, "nite");
        words.remove(1);
        System.out.println(words.size());
        System.out.println(words);
    }
}
