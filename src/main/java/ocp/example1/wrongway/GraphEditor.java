package ocp.example1.wrongway;

/**
 * Created by agup101 on 4/25/2017.
 */
 class GraphEditor {

    public void drawShape(Shape shape){
        if(shape.type == 1) {
            drawRectangle((Rectangle) shape);
        } else if(shape.type == 2){
            drawCircle((Circle) shape);
        }
    }

    public void  drawRectangle(Rectangle rectangle){

    }

    public void drawCircle(Circle circle){

    }
}
