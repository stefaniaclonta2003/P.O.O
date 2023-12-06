public class Main {
        public static void main(String[] args) {
            CalendarLucru calendar = new CalendarLucru();
            Lucrator gigel = new Lucrator("Gigel", calendar);

            try {
                gigel.lucreaza("Luni");
            } catch (ExceptieZiNelucratoare e) {
                throw new RuntimeException(e);
            }
            try {
                gigel.lucreaza("Marti");
            } catch (ExceptieZiNelucratoare e) {
                throw new RuntimeException(e);
            }
            try {
                gigel.lucreaza("Duminica");
            } catch (ExceptieZiNelucratoare e) {
                throw new RuntimeException(e);
            }
        }
}