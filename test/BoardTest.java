import org.junit.Test;

import static junit.framework.TestCase.*;

public class BoardTest {

    @Test
    public void ShouldGetNumWeekIsZeroDefault() {
        Board board = new Board();
        int expect = board.getNumWeek();
        assertEquals(expect,0);
    }

    @Test
    public void ShouldGetNumWeekIsFive() {
        Board board = new Board();
        board.setNumWeek(5);
        int expect = board.getNumWeek();
        assertEquals(expect,5);
    }

    @Test
    public void ShouldMaxWeek() {
        Board board = new Board();
        assertFalse(board.isMaxWeek(-1));
        assertFalse(board.isMaxWeek(0));
        assertTrue(board.isMaxWeek(1));
        assertTrue(board.isMaxWeek(5));
        assertFalse(board.isMaxWeek(6));
    }

    @Test
    public void ShouldCountRestaurant() {
        Board board = new Board();
        assertEquals(board.getCountRestaurants(),5);
    }

    @Test
    public void ShouldCountWeeks() {
        Board board = new Board();
        assertEquals(board.getCountWeeks(),5);
    }

    @Test
    public void ShouldGetRestaurantsExists() {
        Board board = new Board();
        String[] restaurants = board.getRestaurants();
        String[] expect = {"Espaco 32", "Panorama", "Palatus", "Ponto Onze", "Intervalo 50"};
        int i=0;
        for(String restaurant: restaurants ) {
            assertEquals(restaurant,expect[i++]);
        }
    }

    @Test
    public void ShouldGetWeeksExists() {
        Board board = new Board();
        String[] weeks = board.getWeeks();
        String[] expect = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int i=0;
        for(String week: weeks ) {
            assertEquals(week,expect[i++]);
        }
    }

    @Test
    public void ShouldGetWeekisMonday() {
        Board board = new Board();
        assertEquals(board.getWeek(0), "Monday");
    }

    @Test
    public void ShouldGetIsFavorites() {
        Board board = new Board();
        assertEquals(board.getIsFavorites(0) , "-");
        assertEquals(board.getIsFavorites(1) , "Espaco 32");
    }

}
