public class MarioKartGame {
    public static void main(String[] args) {
        // Instantiate two MarioKartPlayer objects with different attributes
        MarioKartPlayer player1 = new MarioKartPlayer("Player1", "Mario", 90);
        MarioKartPlayer player2 = new MarioKartPlayer("Player2", "Luigi", 45);

        // Display information of both players
        System.out.println("Player 1 Information:");
        player1.displayInfo();
        System.out.println("\nPlayer 2 Information:");
        player2.displayInfo();

        // Simulate boost action for each player
        player1.boost();
        player2.boost();

        // Display updated information of both players after boost
        System.out.println("\nPlayer 1 Information After Boost:");
        player1.displayInfo();
        System.out.println("\nPlayer 2 Information After Boost:");
        player2.displayInfo();
    }
}
