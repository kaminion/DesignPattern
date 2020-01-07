package Chapter01.quiz;

import Chapter01.quiz.weaponChain.Axe;
import Chapter01.quiz.weaponChain.Bow;

public class Main {
    public static void main(String[] args) {

        new Character().setWeapon(new Bow()).fight();
    }
}
