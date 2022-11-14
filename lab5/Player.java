package lab5;

public class Player {
    private String name;
    private int goals;

    public Player(String initialName, int initialGoal){
        this.name=initialName;
        this.goals=initialGoal;
    }
    public Player(String name){
        this(name,0);
    }
    public String getName(){
        return this.name;
    }
    public int getGoals(){
        return this.goals;
    }
    public String toString() {
        return "Player: " + this.name + ", goals " + this.goals + ".";
    }
  
}
