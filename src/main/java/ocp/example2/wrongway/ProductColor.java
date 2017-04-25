package ocp.example2.wrongway;

/**
 * Created by agup101 on 4/25/2017.
 */
enum ProductColor {
    RED("red"), BLUE("blue"), GREEN("green"), BLACK("black");

    private String value;

    private ProductColor(String value) {
        this.value = value;
    }

    public String getColor(){
        return value;
    }
}
