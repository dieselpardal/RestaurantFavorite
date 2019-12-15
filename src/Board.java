public class Board {

    private final String[] restaurants = {"Espaco 32", "Panorama", "Palatus", "Ponto Onze", "Intervalo 50"};
    private final String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private int numWeek = 0;

    public void setNumWeek(int num) {
        numWeek = num;
    }

    public int getNumWeek() {
        return numWeek;
    }

    public void nextWeek() {
        numWeek = numWeek < this.weeks.length - 1 ? numWeek + 1 : 0;
    }

    public boolean isMaxWeek(int restaurant) {
        return restaurant>0 && restaurant <= weeks.length;
    }

    public int getCountRestaurants() {
        return restaurants.length;
    }

    public int getCountWeeks() {
        return weeks.length;
    }

    public String[] getRestaurants() {
        return restaurants;
    }

    public String[] getWeeks() {
        return weeks;
    }

    public String getWeek(int today) {
        return weeks[today];
    }

    public String getIsFavorites(int favorite) {
        return favorite>0 ? getFavorite(favorite) : "-";
    }

    private String getFavorite(int favorite) {
        return this.restaurants[favorite - 1];
    }


}
