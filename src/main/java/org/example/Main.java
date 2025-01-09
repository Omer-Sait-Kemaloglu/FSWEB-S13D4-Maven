package org.example;

public class Main {
    public static void main(String[] args) {
        // Testler
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());
        Player player = new Player("Archer", 120, Weapon.BOW);

        System.out.println("Health Remaining: " + player.healthRemaining()); // Sağlık 100 olacak
        player.loseHealth(30);
        System.out.println("Health After Damage: " + player.healthRemaining()); // Sağlık 70 olacak

        player.restoreHealth(50);
        System.out.println("Health After Potion: " + player.healthRemaining()); // Sağlık 100 olacak

        player.loseHealth(110);
        System.out.println("Health After Fatal Damage: " + player.healthRemaining()); // Sağlık 0 olacak
    }
    }



