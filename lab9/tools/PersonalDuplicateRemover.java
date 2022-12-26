package lab9.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private int amountOfDuplicates;
    private Set<String> charSet;
    
    public PersonalDuplicateRemover(){
        this.charSet=new HashSet<>();
    }

    @Override
    public void add(String characterString) {
        if(this.charSet.contains(characterString)){
            this.amountOfDuplicates++;
        }

        this.charSet.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.amountOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.charSet;
    }

    @Override
    public void empty() {
        this.amountOfDuplicates=0;
        this.charSet.clear();
    }
    
}
