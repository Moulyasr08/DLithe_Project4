import java.util.Scanner;
public class SnakeandLadder {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int player1 = 0;
	        int player2 = 0;
	        int player3 = 0;
	        while (true) {
	            System.out.print("Enter the player number ");
	            int playerNumber = sc.nextInt();
	            int diceRoll;
	            while (true) {
	                diceRoll = (int) (Math.random() * 10);
	                if (diceRoll >= 1 && diceRoll <= 6) {
	                    break;
	                }
	            }
	            System.out.println("Player " + playerNumber + " rolled: " + diceRoll);

	            if (playerNumber == 1) {
	                if (player1 + diceRoll <= 100) {
	                    player1 =player1+ diceRoll;
	                }
	                if (player1 == 1) 
	                	player1 = 38;
	                else if (player1 == 4)
	                	player1 = 14;
	                else if (player1 == 9) 
	                	player1 = 31;
	                else if (player1 == 21) 
	                	player1 = 42;
	                else if (player1 == 28)
	                	player1 = 84;
	                else if (player1 == 36)
	                	player1 = 44;
	                else if (player1 == 51) 
	                	player1 = 67;
	                else if (player1 == 71)
	                	player1 = 91;
	                else if (player1 == 80)
	                	player1 = 100;
	                else if (player1 == 16) 
	                	player1 = 6;
	                else if (player1 == 47)
	                	player1 = 26;
	                else if (player1 == 49) 
	                	player1 = 11;
	                else if (player1 == 56) 
	                	player1 = 53;
	                else if (player1 == 62) 
	                	player1 = 19;
	                else if (player1 == 64) 
	                	player1 = 60;
	                else if (player1 == 87) 
	                	player1 = 24;
	                else if (player1 == 93)
	                	player1 = 73;
	                else if (player1== 95)
	                	player1= 75;
	                else if (player1 == 98) 
	                	player1 = 78;
	                System.out.println("Player 1 is now at position: " + player1);
	                if (player1 == 100) {
	                    System.out.println("Player 1 wins!");
	                    break;
	                }
	            } else if (playerNumber == 2) {
	                if (player2 + diceRoll <= 100) {
	                    player2 += diceRoll;
	                }
	                if (player2 == 1) player2 = 38;
	                else if (player2 == 4)
	                	player2= 14;
	                else if (player2 == 9)
	                	player2 = 31;
	                else if (player2 == 21) 
	                	player2 = 42;
	                else if (player2 == 28)
	                	player2 = 84;
	                else if (player2 == 36) player2 = 44;
	                else if (player2== 51) 
	                	player2 = 67;
	                else if (player2== 71) 
	                	player2= 91;
	                else if (player2 == 80)
	                	player2 = 100;
	                else if (player2 == 16)
	                	player2 = 6;
	                else if (player2== 47) 
	                	
	                	player2 = 26;
	                else if (player2 == 49)
	                	player2 = 11;
	                else if (player2 == 56)
	                	player2= 53;
	                else if (player2 == 62)
	                	player2 = 19;
	                else if (player2== 64)
	                	player2= 60;
	                else if (player2 == 87)
	                	player2 = 24;
	                else if (player2 == 93)
	                	player2 = 73;
	                else if (player2 == 95)
	                	player2 = 75;
	                else if (player2 == 98)
	                	player2 = 78;

	                System.out.println("Player 2 is now at position: " + player2);
	                if (player2 == 100) {
	                    System.out.println("Player 2 wins!");
	                    break;
	                }
	            } else if (playerNumber == 3) {
	                if (player3 + diceRoll <= 100) {
	                    player3 += diceRoll;
	                }
	                if (player3== 1) player3 = 38;
	                else if (player3 == 4) 
	                	player3 = 14;
	                else if (player3 == 9)
	                	player3 = 31;
	                else if (player3 == 21)
	                	player3 = 42;
	                else if (player3 == 28)
	                	player3 = 84;
	                else if (player3 == 36) 
	                	player3 = 44;
	                else if (player3 == 51)
	                	player3 = 67;
	                else if (player3== 71) 
	                	player3 = 91;
	                else if (player3 == 80)
	                	player3 = 100;
	                else if (player3== 16)
	                	player3 = 6;
	                else if (player3== 47)
	                	player3= 26;
	                else if (player3== 49)
	                	player3 = 11;
	                else if (player3 == 56) 
	                	player3= 53;
	                else if (player3== 62)
	                	player3 = 19;
	                else if (player3 == 64)
	                	player3= 60;
	                else if (player3 == 87) 
	                	player3 = 24;
	                else if (player3 == 93) 
	                	player3 = 73;
	                else if (player3 == 95)
	                	player3 = 75;
	                else if (player3== 98) 
	                	player3 = 78;

	                System.out.println("Player 3 is now at position: " + player3);
	                if (player3 == 100) {
	                    System.out.println("Player 3 wins!");
	                    break;
	                }
	            } else {
	                System.out.println("Invalid player number. Please enter 1, 2, or 3.");
	            }
	        }

	        sc.close();
	    }
	}
