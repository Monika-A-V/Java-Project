package com.CollectionMapDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Player
{
    public int id;
    public String name;
    public String countryName;
    public int totalRuns;

    public Player(int id, String name, String countryName, int totalRuns)
    {
        this.id = id;
        this.name = name;
        this.countryName = countryName;
        this.totalRuns = totalRuns;
    }
    
@Override
	public String toString() 
{
		return "Player [id=" + id + ", name=" + name + ", countryName=" +
	            countryName + ", totalRuns=" + totalRuns+ "]";
	}
}
public class SetOfPlayers {

	public static void main(String[] args) {

		Set<Player> p = new HashSet<>();
        p.add(new Player(1, "Virat Kohli", "India", 12000));
        p.add(new Player(2, "Steve Smith", "Australia", 7000));
        p.add(new Player(3, "Kane Williamson", "New Zealand", 6000));
        p.add(new Player(4, "Joe Root", "England", 8000));
        p.add(new Player(5, "Rohit Sharma", "India", 9000));

        System.out.println("All players:");
        Iterator<Player> it = p.iterator();
        while (it.hasNext())
        {
            Player player = it.next();
            System.out.println(player.id + "\t" + player.name + "\t" + player.countryName + "\t" + player.totalRuns);
        }

        System.out.println("\nPlayers from India:");
        for (Player player : p)
        {
            if (player.countryName.equals("India")) 
            {
                System.out.println(player.id + "\t" + player.name + "\t" + player.countryName + "\t" + player.totalRuns);
            }
        }
    }
}