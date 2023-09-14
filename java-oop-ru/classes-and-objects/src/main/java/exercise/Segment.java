package exercise;

// BEGIN
public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getBeginPoint() {
        return start;
    }

    public Point getEndPoint() {

        return end;
    }

    public Point getMidPoint() {
        double midX = (start.getX() + end.getX()) / 2.0;
        double midY = (start.getY() + end.getY()) / 2.0;

        Point mid = new Point((int) midX, (int) midY);
        return mid;
    }
}
// END
