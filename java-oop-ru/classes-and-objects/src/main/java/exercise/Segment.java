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

    public Point getEndPoint(int y) {
        return end;
    }

    public int getMidPoint() {
        return getEndPoint(start.getX()).getX() /getEndPoint(end.getY()).getY();
    }
// END
