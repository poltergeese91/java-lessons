
class ScoreBoard
{
    int playerXP = 0;
    int playerLevel = 0;
    int playerHealth = 0;
    static final String GAME_NAME = "chess";
    void gainXP(int amount)
    {
        playerXP += amount;
    }

    void heal()
    {
        playerHealth += 10;
    }
    void damage()
    {
        playerHealth -= 10;

    }

    void levelUp()
    {
        playerLevel++;

    }
    void levelDown()
    {
        playerLevel--;

    }
    static void name()
    {
        System.out.println("The name of your game is: " + GAME_NAME);
    }
    public player(int playerXP, int playerLevel, int playerHealth)
    {
        this.playerXP = playerXP;
        this.playerLevel = playerLevel;
        this.playerHealth = playerHealth;
    }

}



public class math2 
{
    public static void main(String[] args)
    {
    ScoreBoard player1 = new ScoreBoard();
    ScoreBoard player2 = new ScoreBoard();

    player1.gainXP(1);
    player1.gainXP(2);
    player1.heal();
    player1.damage();
    player1.levelUp();
    player1.levelUp();
    player1.levelDown();
    System.out.println("Player1 XP: " + player1.playerXP);
    System.out.println("Player1 level: " + player1.playerLevel);
    
    player2.gainXP(5);
    player2.gainXP(10);
    player2.heal();
    player2.heal();
    player2.heal();
    player2.heal();
    player2.heal();
    player2.damage();
    player2.levelUp();
    player2.levelUp();
    player2.levelDown();
    player2.levelDown();
    player2.levelDown();
    player2.levelDown();

    System.out.println("Player2 XP: " + player2.playerXP);
    System.out.println("Player2 level: " + player2.playerLevel);

    player1.name();
    System.out.println("player attributes: " + player1.playerXP + "XP, Level "+ player1.playerLevel +", and " + player1.playerHealth + " health");
    }

}
    
