package movie;

import java.util.List;

public class Movie {
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Admin movieAddedBy;

    private List<Show> shows;

    /**
     * List down all shows for the movie.
     */
    public List<Show> getShows() {

    }
}
