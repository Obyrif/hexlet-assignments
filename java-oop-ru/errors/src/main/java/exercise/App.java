package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) throws NegativeRadiusException {
        try {
            int sq = (int) Math.round(circle.getSquare());
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь круга");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
