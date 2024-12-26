import java.util.ArrayList;
public class WordChecker {
    private ArrayList<String>wordList;
    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }
    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }
  
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
