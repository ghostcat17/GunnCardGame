import java.util.ArrayList;

public class CharacterManager {
    private ArrayList<Character> characters;
    private final int MAX_CHARACTERS = 5;
    public CharacterManager(){

    }
    public boolean full(){
        return characters.length>=MAX_CHARACTERS;
    }
    public void add(Character character){
        if(full()) {
            characters.add(character);
        }
    }

}
