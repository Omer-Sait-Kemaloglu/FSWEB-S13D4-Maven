package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    BOW(30, 2.0),
    DAGGER(20, 3.0);

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter Methods
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
