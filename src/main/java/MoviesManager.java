public class MoviesManager {
    private Movie[] movies = new Movie[0];
    private int defaultLimit;

    MoviesManager() {
        this.defaultLimit = 5;
    }

    MoviesManager(int otherLimit) {
        this.defaultLimit = otherLimit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength = 0;

        if (movies.length < defaultLimit) {
            resultLength = movies.length;
        } else {
            resultLength = defaultLimit;
        }

        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
