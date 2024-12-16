import java.util.ArrayList;
import java.util.List;

public class Movies {

    private String movie_name;
    private List<Actors> actors;

    public Movies(String movie_name) {
        this.movie_name = movie_name;
        this.actors = new ArrayList<>();
    }

    //adding actor to the movie
    public void addActor(Actors actor)
    {
        actors.add(actor);
        actor.getMovies().add(this);
    }

    public String getMovie_name() {
        return movie_name;
    }

    public List<Actors> getActors() {
        return actors;
    }
}
