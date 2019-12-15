

public class Menu {

    private Restaurant restaurant = new Restaurant();

    final int sizeSubline = 78;
    
    public void init() {
        this.restaurant.weekZero();
        this.restaurant.clearFavorite();
        this.restaurant.clearVote();
    }

    public void screen() {
        Tool tool = new Tool();
        tool.show("\nARE WE GOING TO THE RESTAURANT?");
        String choose;
        do {
            tool.show(tool.subline(sizeSubline));
            tool.show("Restaurant List:        Vote:");
            this.restaurant.showList();
            tool.show(tool.subline(sizeSubline));
            this.restaurant.showWeeks();
            this.restaurant.showFavorite();
            tool.show(tool.subline(sizeSubline));
            this.restaurant.today();
            choose = this.restaurant.chooseFavorite();
        } while(this.restaurant.favoriteChoosed(choose));
        tool.show("Thank you!");
    }
}
