
package com.Test_9;

import java.util.ArrayList;

/*Consider an ArrayList of Movie
Movie has (int movieid, String moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies.
*/
class Movie {
    public int movieid;
    public String moviename;
    public ArrayList<String> actor;

    public Movie(int movieid, String moviename, ArrayList<String> actor) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.actor = actor;
    }
}

public class Q12 {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<String> actors1 = new ArrayList<>();
        actors1.add("Amitabh Bachchan");
        actors1.add("salman Khan");
        ArrayList<String> actors2 = new ArrayList<>();
        actors2.add("Amitabh Bachchan");
        actors2.add("Hema Malini");
        ArrayList<String> actors3 = new ArrayList<>();
        actors3.add("Salman Khan");
        actors3.add("Amitabh Bachchan");
        actors3.add("Madhuri Dixit");
        movies.add(new Movie(1, "Drishyam", actors1));
        movies.add(new Movie(2, "ved", actors2));
        movies.add(new Movie(3, "hum saath saath hai", actors3));

        int count = 0;
        for (Movie movie : movies)
        {
            ArrayList<String> actors = movie.actor;
            if (actors.contains("Amitabh Bachchan")) 
            {
                count++;
                
            }
        }
        System.out.println("Amitabh Bachchan has acted in " + count + " movies.");

	}

}
