import java.util.Scanner;

public class Restaurant {
    final int NULL = -1;
    final int notvote = 0;
    final int spaceTab = 15;
    final int spaceTabVote = 22;
    private Data favorites;
    private Data votes;

    Tool tool = new Tool();
    Board board = new Board();

    public void weekZero() {
        board.setNumWeek(0);
    }

    public void clearFavorite() {
        this.favorites = new Data(board.getCountRestaurants());
        for(int i=0; i<board.getCountRestaurants(); i++) {
            favorites.add(this.NULL);
        }
    }

    public void clearVote() {
        this.votes = new Data(board.getCountRestaurants());
        for(int i=0; i<board.getCountRestaurants(); i++) {
            this.votes.add(this.notvote);
        }
    }

    public void showList() {
        int i=0;
        for (String name: board.getRestaurants() ) {
            this.tool.show((i+1)+": "+this.tool.tab(name,spaceTabVote)+this.votes.get(i++));
        }
    }

    public void showWeeks() {
        StringBuilder row = new StringBuilder();
        for (String week: board.getWeeks() ) {
            row.append(this.tool.tab(week, spaceTab));
        }
        this.tool.show("Weeks:    "+row);
    }

    public void showFavorite() {
        StringBuilder row = new StringBuilder();
        for (int favorite: this.favorites.getAll() ) {
            row.append(this.tool.tab(board.getIsFavorites(favorite), this.spaceTab));
        }
        this.tool.show("Favorite: "+row);
    }


    public void today() {
        this.tool.show("Today: "+ board.getWeek(board.getNumWeek()));
    }

    public String chooseFavorite() {
        Scanner input=new Scanner(System.in);
        System.out.print("Choose a favorite ( 1 to 5 or 'E'xit):");
        return input.nextLine();
    }

    public boolean favoriteChoosed(String choose) {
        if(choose.toUpperCase().equals("E"))
            return false;
        if(choose.isEmpty())
            return true;
        int restaurant=Integer.parseInt(choose);
        if( !board.isMaxWeek(restaurant)) {
            System.out.println("Only number of restaurants: 1 to " + board.getCountRestaurants());
        } else if( isNotExistThisWeek(restaurant)) {
              this.vote(restaurant);
              board.nextWeek();
              this.checkNewWeekShow();
        } else {
            System.out.println("Restaurant cannot be repeated during the week.");
        }
        return true;
    }

    public boolean isNotExistThisWeek(int restaurant) {
        int day = 0;
        while (day < board.getCountWeeks()) {
                if (day != board.getNumWeek()) {
                    if (restaurant == this.favorites.get(day)) {
                        return false;
                    }
                }
                day++;
            }
        return true;
    }

    private void checkNewWeekShow() {
        if(board.getNumWeek()== 0) {
            this.tool.show("Next Week!");
            clearFavorite();
        }
    }

    private void vote(int restaurant) {
        this.favorites.set(board.getNumWeek(),restaurant);
        this.votes.set(restaurant - 1, this.votes.get(restaurant - 1) + 1);
    }

}
