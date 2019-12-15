public class Board {

    private final String[] restaurants = {"Espaco 32", "Panorama", "Palatus", "Ponto Onze", "Intervalo 50"};
    private final String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private int numWeek = 0;

    public void setNumWeek(int num) {
        this.numWeek = num;
    }

    public int getNumWeek() {
        return this.numWeek;
    }

    public void nextWeek() {
        this.numWeek = this.numWeek < this.weeks.length - 1 ? this.numWeek + 1 : 0;
    }

    public boolean isMaxWeek(int restaurant) {
        return restaurant>0 && restaurant <= this.weeks.length;
    }

    public int getCountRestaurants() {
        return this.restaurants.length;
    }

    public int getCountWeeks() {
        return this.weeks.length;
    }

    public String[] getRestaurants() {
        return this.restaurants;
    }

    public String[] getWeeks() {
        return this.weeks;
    }

    public String getWeek(int today) {
        return this.weeks[today];
    }

    public String getIsFavorites(int favorite) {
        return favorite>0 ? getFavorite(favorite) : "-";
    }

    private String getFavorite(int favorite) {
        return this.restaurants[favorite - 1];
    }


}
