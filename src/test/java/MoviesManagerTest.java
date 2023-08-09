import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    Movie movie1 = new Movie("Бладшот");
    Movie movie2 = new Movie("Вперёд");
    Movie movie3 = new Movie("Отель \"Белград\"");
    Movie movie4 = new Movie("Джентельмены");
    Movie movie5 = new Movie("Человек-невидимка");
    Movie movie6 = new Movie("Тролли. Мировой тур");
    Movie movie7 = new Movie("Номер один");
    Movie movie8 = new Movie("Остров фантазий");

    @Test
    public void shouldAddMovie() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(movie1);
        Movie[] expected = new Movie[]{movie1};
        Assertions.assertArrayEquals(expected, manager.findAll());

    }

    @Test
    public void shouldReturnLastMoviesDefaultLimitIfMoviesLess() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        Movie[] expected = new Movie[]{movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesDefaultLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        Movie[] expected = new Movie[]{movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesDefaultLimitIfMoviesMore() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitLessThanDefault() {
        MoviesManager manager = new MoviesManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        Movie[] expected = new Movie[]{movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitLessThanDefaultMoviesMore() {
        MoviesManager manager = new MoviesManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        Movie[] expected = new Movie[]{movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitLessThanDefaultMoviesLess() {
        MoviesManager manager = new MoviesManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        Movie[] expected = new Movie[]{movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitMoreThanDefault() {
        MoviesManager manager = new MoviesManager(7);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        Movie[] expected = new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitMoreThanDefaultMoviesMore() {
        MoviesManager manager = new MoviesManager(7);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        Movie[] expected = new Movie[]{movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReturnLastMoviesOtherLimitMoreThanDefaultMoviesLess() {
        MoviesManager manager = new MoviesManager(7);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        Movie[] expected = new Movie[]{movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
