package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> titles = new ArrayList<>();
        for (Movie movie: movies) {
            if (movieContains(movie, time)) {
                titles.add(movie.getTitle());
            }
        }
        return titles;
    }

    private boolean movieContains(Movie movie, LocalDateTime time) {
        for (LocalDateTime actual: movie.getTimes()) {
            if (actual.equals(time)) {
                return true;
            }
        }
        return false;
    }
}
