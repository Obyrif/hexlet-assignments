package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            int sq = (int) Math.ceil(circle.getSquare());
            System.out.println(sq);
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь круга");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
