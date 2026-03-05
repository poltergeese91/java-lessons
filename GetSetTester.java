import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("poltergeese91"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();

        player3.setUsername(userInput);

        System.out.println(player3.getUsername()); //displays new username 
        
        player3.setRank("Bronze");
        System.out.println(player3.getRank());
        System.out.print("enter rank:");
        player2.setRank(input.nextLine());

        System.out.println(player2.getRank());

        System.out.print("enter your name");
        player2.setUsername(input.nextLine());
        System.out.println(player2.getUsername());

        System.out.print("enter your ID");
        player2.setUsername(input.nextLine());
        System.out.println(player2.getId());
        String pRank = player2.getRank();
        if (pRank.equals("Bronze"))
            System.out.println("youre bronze");
    }
}

class GetSet{
    //instance variables; attributes
    private String username;
    private int id;
    private String rank;
    //accesor methods aka GETTERS:
    
    public int getId(){
        return id;
    }

    public void setId(int newId){
        this.id = newId;
    }
    
    public String getRank(){
        return rank;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}