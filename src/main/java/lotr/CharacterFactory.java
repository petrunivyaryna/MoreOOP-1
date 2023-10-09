package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character creaCharacter() {
        List<Class<? extends Character>> characters = Arrays.asList(Hobbit.class);
        Class<? extends Character> characterClass = characters.get(new Random().nextInt(characters.size()));
        return characterClass.getDeclaredConstructor().newInstance();
    }
}
