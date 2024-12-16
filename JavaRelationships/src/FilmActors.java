public class FilmActors {

    public static void main(String[] args) {

        Actors actor1=new Actors("Rajinikanth");
        Actors actor2=new Actors("Shivarajkumar");

        Movies movie = new Movies("Jailer");
        Movies movie1=new Movies("Coolie");


        movie.addActor(actor1);
        movie.addActor(actor2);

        actor1.addMovie(movie);
        actor1.addMovie(movie1);

        System.out.println("The actors of "+movie.getMovie_name()+" are");
        for(Actors a1: movie.getActors())
        {
            System.out.println(a1.getActor_name());
        }
        System.out.println();
    }
}
