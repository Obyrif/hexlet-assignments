package exercise;

// BEGIN
public class App {
    public static int printSquare(Circle circle) throws NegativeRadiusException {
        int sq = 0;
        try {
            sq = (int) Math.round(circle.getSquare());
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь круга");
        } finally {
            System.out.println("Вычисление окончено");
        }
        return sq;
    }
}
// END
