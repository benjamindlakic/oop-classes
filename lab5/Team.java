package lab5;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String initialName){
        this.name=initialName;
        this.players= new ArrayList<>();
        this.maxSize=16;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.size() < this.maxSize){
            this.players.add(player);
        }
    }
    public void printPlayer(){
        for(Player player: this.players){
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public int size(){
        return this.players.size();
    }
    public int getGoals(){
        int totalGoals=0;
        for (Player player : this.players) {
            totalGoals+= player.getGoals();
        }
        return totalGoals;
    }
}
