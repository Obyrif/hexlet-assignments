package exercise;

// BEGIN
public class Flat implements Home{
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if(getArea() > another.getArea()) {
            return 1;
        } else if (getArea() == another.getArea()){
            return 0;
        } else {
            return -1;
        }
    }

    public String toString() {
        return String.format("Квартира площадью " + getArea() + " метров на " + floor + " этаже");
    }
}
// END
