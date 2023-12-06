import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<String>();

        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Toyota");

     System.out.println(cars);
        for(int i = 0; i < cars.size(); i++){
           if( cars.get(i).equals("Dacia"))
               cars.set(i, "Logan");
        }
//        System.out.println(cars);
//        for(String car: cars){
//            if(car.equals("Dacia")){
//                car = "Logan";
//            }
//        }
//        System.out.println(cars);
        ListIterator <String> carsIt = cars.listIterator();
        while (carsIt.hasNext()){
            if( carsIt.next().equals("Dacia"))
                carsIt.set("logan");
        }
        System.out.println(cars);

        String[] chat = {"Buna", "Buna", "ce", "mai", "faci"};
        Map<String, Integer> myHash = new HashMap<String, Integer>();

        for(int i = 0; i < chat.length; i++){
            if(!myHash.containsKey(chat[i])){
                myHash.put(chat[i], 1);
            }
            else {
                int nr = myHash.get(chat[i]);
                nr++;
                myHash.put(chat[i], nr);
            }
        }
        for(Map.Entry<String, Integer> entry: myHash.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        }
}
