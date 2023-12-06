public class Lucrator {
    String nume;
    CalendarLucru calendarLucru;

    public Lucrator(String nume, CalendarLucru calendarLucru) {
        this.nume = nume;
        this.calendarLucru = calendarLucru;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        Zi ziua = calendarLucru.getZi(zi);
        if (ziua == null) {
            System.out.println(zi + " nu este o zi a saptamanii");
        } else {
            if (ziua.esteLucratoare()) {
                System.out.println("Lucratorul " + nume + " lucreaza " + zi);
            } else {
                throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }
    }
}

