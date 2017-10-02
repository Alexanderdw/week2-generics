package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {
	
	private ArrayList<Team<T>> teams = new ArrayList<>();
	
	public void addTeam(Team<T>team){
		if(teams.contains(team)){
			System.out.println(team.getName() +" had already been added");
			return;
		}
		teams.add(team);
		System.out.println();
	}
	public void printTeams(){
		for(Team<?> team : teams){
			System.out.println(team.getName() + " "+team.ranking());
		}
	}

}
