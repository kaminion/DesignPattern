package Chapter01.quiz;

import Chapter01.quiz.weaponChain.Weapon;

public class Character {
    private Weapon weapon;

    public void fight()
    {
        weapon.useWeapon();
    }

    public Character setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }
}
