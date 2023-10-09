package lotr;

import java.util.Random;

public class Knight {
    private int power;

    public Knight() {
        Random random = new Random();
        this.power = random.nextInt(11) + 2; // Random power between 2 and 12
    }

    public void kick(Character c) {
        if (c instanceof Character) {
            int damage = new Random().nextInt(power) + 1; // Random damage within the Knight's power range
            int enemyHp = c.getHp();
            if (damage >= enemyHp) {
                c.setHp(0);
            } else {
                c.setHp(enemyHp - damage);
            }
        }
    }
}
