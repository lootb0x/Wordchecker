import java.util.ArrayList;
public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String>wordList;
    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }
    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }
    /** 
    * Returns true if each element of wordList (except the first) contains the
    * previous
    * element as a substring and returns false otherwise, as described in part (a)
    * Precondition: wordList contains at least two elements.
    * Postcondition: wordList is unchanged.
    */
   public boolean isWordChain() 
   {
    String before;
    String after;
    for(int i = 1; i<wordList.size(); i++)
    {
        after = wordList.get(i);
        before = wordList.get(i-1);
        if(after.indexOf(before) == -1) 
        {
            return false;
        }
    }
    return true;
   }
   public ArrayList<String> createList(String target) 
   {
    ArrayList<String> list = new ArrayList<String>();
    for(String s : wordList)
    {
    if(s.indexOf(target) == 0)
    list.add(s.substring(target.length())); 
    }   
    return list;
}
}