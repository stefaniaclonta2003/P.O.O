public class Student implements Cloneable {
     String nume;
     int id;
     Masina masina;
    public Student(String nume, int id, Masina masina){
        this.id = id;
        this.masina = masina;
        this.nume = nume;
    }

    public Student clone(){
        Student copieStudent;
        try {
           copieStudent= (Student)super.clone();
        } catch (Exception e) {
            System.out.println("Not clonable!");
            return null;
        }
       // copieStudent.masina = masina.clone();

        copieStudent.masina = new Masina(id, masina.marca, masina.culoare);
        return copieStudent;

    }

    @Override
    public String toString() {
        return "Elevul are id-ul " + id + " se numeste " + nume + " si are o masina marca " + masina;
    }
}
