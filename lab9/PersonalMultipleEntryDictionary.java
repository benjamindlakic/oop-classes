package lab9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        this.dictionary= new HashMap<>();
    }

    @Override
    public void add(String word, String entry) {
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new HashSet<String>());
        }
        Set<String> wordSet= this.dictionary.get(word);
        wordSet.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);        
    }
    
}
