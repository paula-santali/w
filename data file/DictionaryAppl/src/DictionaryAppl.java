
import java.util.*;
import java.io.*;
public class DictionaryAppl {
static private TreeMap<Character,Set<String>> words=
   new TreeMap<Character,Set<String>>();
    public static void main(String[] args) throws Exception {
         
        BufferedReader input = new BufferedReader(new FileReader("WarPeace.txt"));
        String line;
        while((line=input.readLine())!=null){
            String[] wordParts=line.split("[^a-zA-Z]");
            for(int i=0; i<wordParts.length; i++)
                addWord(wordParts[i]);
        }
        String [] wordsLeter=getWordsByLetter('a');
        for(int i=0; i<wordsLeter.length; i++)
        
            System.out.println(wordsLeter[i]+" ");
    
        	
        }

    private static String[] getWordsByLetter(char let) {
        String[] res=new String[0];
        Set<String> set=words.get(let);
        if(set != null){
            res=new String[set.size()];
            int i=0;
            for(String str: set){
                res[i++]=str;
            }
                 
        }
        return res;
    }
    private static void addWord(String word) {
        if (word != null && word.length()>0) {
            word=word.toLowerCase();
            char firstLet = word.charAt(0);
            Set<String> set = words.get(firstLet);
            if (set == null) {
                set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                words.put(firstLet, set);
            }
            set.add(word);
        }
         
   
    } 
 
}

 

