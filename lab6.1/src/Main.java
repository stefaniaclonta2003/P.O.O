
public class Main {
    public static void main(String[] args) {
        Manual manual1 = new Manual("POO");
        Manual manual2 = new Manual("AF");
        Manual manual3 = new Manual("MSI");
        Caiet caiet1 = new Caiet("mate");
        Caiet caiet2 = new Caiet("romana");
        Ghiozdan ghiozdan = new Ghiozdan();

        ghiozdan.addC(caiet1);
        ghiozdan.addC(caiet2);

        ghiozdan.addM(manual1);
        ghiozdan.addM(manual2);
        ghiozdan.addM(manual3);

        ghiozdan.listItems();

        ghiozdan.getNrCaiete();
        ghiozdan.getNrManuale();

        }
    }
