

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1,Point p2){
        this.p1 = new Point(p1.getX(),p1.getY());
        this.p2 = new Point(p2.getX(),p2.getY());
    }


    public Line(Line other){
        this.p1 = new Point(other.p1.getX(), other.p1.getY());
        this.p2 = new Point(other.p2.getX(), other.p2.getY());
    }

    @Override
    public String toString(){
        return "Line Start : " + p1.toString() + " Line End : " + p2.toString();
    }
}
