import java.util.ArrayList;
import java.util.List;

public class Actors {

    private String actor_name;
    private List<Movies> movies;

    public Actors(String actor_name) {
        this.actor_name = actor_name;
        this.movies = new ArrayList<>();
    }

    public String getActor_name() {
        return actor_name;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    //adding movies to the actors
    public void addMovie(Movies movie){
        movies.add(movie);
        movie.getActors().add(this);

    }

}
