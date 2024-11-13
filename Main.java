import java.util.ArrayList;
public class Main{
 public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker (words);
        System.out.println(x.isWordChain());
     
        ArrayList<String> awords = new ArrayList<String>();
        awords.add("to");
        awords.add("too");
        awords.add("stool");
        awords.add("tools");
        System.out.println(awords);
        WordChecker z = new WordChecker (awords);
        System.out.println(z.isWordChain());
    
        ArrayList<String> bwords = new ArrayList<String>();
        bwords.add("catch");
        bwords.add("bobcat");
        bwords.add("catchacat");
        bwords.add("cat");
        bwords.add("at");
        WordChecker y = new WordChecker(bwords);
        System.out.println(y.createList("cat"));
        System.out.println(y.createList("catch"));
        System.out.println(y.createList("dog"));

    }
 }