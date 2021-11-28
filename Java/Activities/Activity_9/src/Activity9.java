import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Dragonfruit");
        myList.add("Apricot");
        myList.add("Watermelon");
       
        myList.add(3, "Plum");
        myList.add(1, "Guava");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Plum");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}