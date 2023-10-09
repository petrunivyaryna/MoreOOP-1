package lotr;

import java.util.Random;

import kick.KickStrategy;

class King extends Character {
    private static KickStrategy kickStrategy;

    King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5, kickStrategy);
    }


    @Override
    public void kick(Character oponent) {
        int damage = new Random().nextInt(getPower()) + 1;
        System.out.println("King kicks, causing " + damage + " damage.");
        oponent.setHp(oponent.getHp() - damage);
    }
}

