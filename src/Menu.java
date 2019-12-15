

public class Menu {

    private Restaurant restaurant = new Restaurant();

    public void init() {
        this.restaurant.weekZero();
        this.restaurant.clearFavorite();
        this.restaurant.clearVote();

    }

    public void screen() {
        Tool tool = new Tool();
        tool.show("ARE WE GOING TO THE RESTAURANT?");
        String choose;
        do {
            tool.show(tool.subline(40));
            tool.show("Restaurant List:        Vote:");
            this.restaurant.showList();
            tool.show(tool.subline(78));
            this.restaurant.showWeeks();
            this.restaurant.showFavorite();
            tool.show(tool.subline(78));
            this.restaurant.today();
            choose = this.restaurant.chooseFavorite();
        } while(this.restaurant.favoriteChoosed(choose));
        tool.show("Thank you!");
    }

}
