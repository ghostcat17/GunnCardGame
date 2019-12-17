import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.applet.*;
import java.awt.event.KeyListener;
public class CharacterManager implements KeyListener {
    private ArrayList<Character> characters;
    private final int MAX_CHARACTERS = 5;
    Image[] imgs = new Images[IMAGE_FILES.length];

    private static final String[] IMAGE_FILES = {
            "bautista.jpg", "paley.jpg", "lorey.jpg", "dunbar.jpg", "gleason.jpg",
            "OC.jpg", "deggeler.jpg", "lyons.jpg", "linsdell.jpg", ""
    };


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
    public void initImages() {
        for (int i = 0; i < images.length; i++) {
            images[i] = getImage(getDocumentBase(), "resources/" + IMAGE_FILES[i]);
        }
    }
    public Image getImage(int i) {
        return Image[i];
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
