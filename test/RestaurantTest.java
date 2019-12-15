import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.*;

public class RestaurantTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Restaurant restaurant = new Restaurant();

    @Before
    public void init() {
        this.restaurant.weekZero();
        this.restaurant.clearFavorite();
        this.restaurant.clearVote();
    }

    @Test
    public void ShouldNotAllowRepeatThisWeek() {
        System.setOut(new PrintStream(outContent));
        assertTrue(restaurant.favoriteChoosed("1"));
        assertTrue(restaurant.favoriteChoosed("1"));
        assertEquals("Restaurant cannot be repeated during the week.\n", outContent.toString());

    }

    @Test
    public void ShouldNotExistThisWeek() {
        restaurant.favoriteChoosed("1");
        assertFalse(restaurant.isNotExistThisWeek(1));
        for(int i=2;i<6;i++) {
            assertTrue(restaurant.isNotExistThisWeek(i));
        }
    }

    @Test
    public void ShouldListShowed() {
        String expect = "1: Espaco 32             0\n2: Panorama              0\n3: Palatus               0\n4: Ponto Onze            0\n5: Intervalo 50          0\n";
        System.setOut(new PrintStream(outContent));
        restaurant.showList();
        assertEquals(expect, outContent.toString());
    }

    @Test
    public void ShouldListWeeksShowed() {
        String expect = "Weeks:    Monday         Tuesday        Wednesday      Thursday       Friday         \n";
        System.setOut(new PrintStream(outContent));
        restaurant.showWeeks();
        assertEquals(expect, outContent.toString());
    }

    @Test
    public void ShouldListFavoritesShowedDefault() {
        String expect = "Favorite: -              -              -              -              -              \n";
        System.setOut(new PrintStream(outContent));
        restaurant.showFavorite();
        assertEquals(expect, outContent.toString());
    }

    @Test
    public void ShouldTodayDefault() {
        String expect = "Today: Monday\n";
        System.setOut(new PrintStream(outContent));
        restaurant.today();
        assertEquals(expect, outContent.toString());
    }

}
