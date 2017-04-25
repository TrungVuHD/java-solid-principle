package ocp.example2.rightway;

/**
 * Created by agup101 on 4/25/2017.
 */
 enum ProductSize {

    SMALL(1), MEDIUM(2), LARGE(3), EXTRA(4);

    private int value;

    private ProductSize(int value) {
        this.value = value;
    }

    public int getSize(){
        return value;
    }
}
