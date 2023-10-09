package kick;
import lotr.Character;
public class Cry implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character oponnent) {
        System.out.print("😭");
    }
}    
