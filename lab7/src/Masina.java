public class Masina implements Cloneable, Comparable {
    String marca;
    String culoare;
    int id;

    public Masina(int id, String marca, String culoare){
        this.id = id;
        this.culoare = culoare;
        this.marca = marca;
    }

    public Masina clone(){
        try {
            return (Masina) super.clone();
        } catch (Exception e) {
            System.out.println("Not clonable!");
            return null;
        }

    }

    @Override
    public String toString() {
        return  marca + " si are culoarea " + culoare + " si are id " + id;
    }

    void vopseste(String culoare){
        this.culoare = culoare;
    }

    @Override
    public int compareTo(Object o) {

        Masina temp = (Masina) o;
        if(id < temp.id)
            return -1;
        else if(id == temp.id)
            return 0;
        else
            return 1;
        //return (id-temp.id);
    }
}
