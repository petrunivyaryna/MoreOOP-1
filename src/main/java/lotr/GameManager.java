package lotr;

public class GameManager {
    public void fight(Character character1, Character character2) {
        System.out.println("Fight begins!");

        while (character1.isAlive() && character2.isAlive()) {
            character1.kick(character2);
            character2.kick(character1);

            printCharacterStatus(character1, character2);
        }

        announceWinner(character1, character2);
    }

    private void printCharacterStatus(Character character1, Character character2) {
        System.out.println("Character 1 HP: " + character1.getHp());
        System.out.println("Character 2 HP: " + character2.getHp());
        System.out.println();
    }

    private void announceWinner(Character character1, Character character2) {
        if (!character1.isAlive()) {
            System.out.println("Character 1 has been defeated. Character 2 wins!");
        } else {
            System.out.println("Character 2 has been defeated. Character 1 wins!");
        }
    }
}
