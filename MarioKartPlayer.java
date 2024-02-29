/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/** Programmers:  [Cheick]
 * Course:  CS 212
 * Due Date: 02/08/2024
 * INclass assignment: MarioCart
 * Problem Statement:creating a simple Java program for a Mario Kart game. The game involves players with specific characters, each having a starting speed. Players can boost, which increases their speed.
* Data In: None (Data for players' attributes is provided within the code)
 * Data Out: Information about players' names, characters, and speeds before and after boosting.
 * Credits: Notes from class
 */

public class MarioKartPlayer {
    // Attributes
    private String playerName;
    private String character;
    private int speed;

    // Constructor
    public MarioKartPlayer(String playerName, String character, int startingSpeed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = startingSpeed;
    }

    // Boost method
    public void boost() {
        // Simulate boosting by increasing speed
        this.speed += 50;
    }

    // Display player's information
    public void displayInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }
}
