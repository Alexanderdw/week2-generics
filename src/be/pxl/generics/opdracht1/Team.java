package be.pxl.generics.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

	private String name;
	private int played, won, lost, tied;
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name){
		this.name = name;
	}
	
	public void addPlayer(T player){
		if(members.contains(player)){
			System.out.println(player.getName() + "is already on this team");
			return;
		}
		members.add(player);
		System.out.println(player.getName()+" picked for the team"+name);
	}
	
	public int numberOfPlayers(){
		return members.size();
	}
	
	public int ranking(){
		return won * 3 + tied;
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore){
		if(ourScore > theirScore){
			won++;
		}else if(ourScore == theirScore){
			tied++;
		}else{
			lost++;
		}
		played++;
		if(opponent != null){
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public int getTied() {
		return tied;
	}
	public void setTied(int tied) {
		this.tied = tied;
	}
	public ArrayList<T> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<T> members) {
		this.members = members;
	}
	
}
