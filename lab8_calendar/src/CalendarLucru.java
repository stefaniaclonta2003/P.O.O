public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        zile = new Zi[]{
                new Zi("Luni", true),
                new Zi("Marti", true),
                new Zi("Miercuri", true),
                new Zi("Joi", true),
                new Zi("Vineri", true),
                new Zi("Sambata", false),
                new Zi("Duminica", false)
        };
    }

    public void setZile(Zi[] zile) {
        this.zile = zile;
    }

    public Zi[] getZile() {
        return zile;
    }
    public class ExceptieZiNelucratoare extends Exception {
        public ExceptieZiNelucratoare(String message) {
            super(message);
        }
    }
}
