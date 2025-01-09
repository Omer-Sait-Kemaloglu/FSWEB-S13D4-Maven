package org.example;

public class Player {
    // Instance Variables
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.min(100, Math.max(0, healthPercentage)); // Sağlık değerini sınırlandırma
        this.weapon = weapon;
    }

    // Method - Health Remaining
    public int healthRemaining() {
        return healthPercentage;
    }

    // Method - Lose Health
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0; // Sağlık negatif olamaz
            System.out.println(name + " player has been knocked out of game");
        }
    }

    // Method - Restore Health
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100; // Sağlık 100'den fazla olamaz
        }
    }
}
