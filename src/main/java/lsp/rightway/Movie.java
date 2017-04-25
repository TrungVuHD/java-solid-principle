package lsp.rightway;

/**
 * Created by agup101 on 4/25/2017.
 */
 class Movie extends Product {
    public Movie(String name, String author) {
        super(name, author);
    }

    public String getAuthor() {
        return "No author but an actor somewhere";
    }
}
