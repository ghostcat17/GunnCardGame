import java.util.HashMap;

public class Character {
    private String name;
    private HashMap<String, Integer> attacks;
    private int health;
    public Character(String name, HashMap<String, Integer> attacks, int health){
        this.name = name;
        this.attacks = attacks;
        this.health = health;
    }

}
