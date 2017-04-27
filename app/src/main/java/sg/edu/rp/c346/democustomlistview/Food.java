package sg.edu.rp.c346.democustomlistview;

/**
 * Created by 15035648 on 27/4/2017.
 */
public class Food {
    private String name;
    private boolean star;

    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }
}
