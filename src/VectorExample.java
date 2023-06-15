import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Displaying the initial Vector
        System.out.println("Initial Vector: " + vector);

        // Inserting an element at a specific index
        vector.add(2, 50);
        System.out.println("Vector after inserting '50' at index 2: " + vector);

        // Removing an element at a specific index
        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);

        // Removing an element by value
        vector.remove(Integer.valueOf(30));
        System.out.println("Vector after removing element '30' by value: " + vector);

        // Displaying all elements in the Vector
        System.out.println("Elements in the Vector:");
        for (Integer element : vector) {
            System.out.println(element);
        }
    }
}
