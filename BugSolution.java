public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        int index = 2;
        if (index >= 0 && index < array.length) {
            array[index] = 10; // Accessing within bounds
            System.out.println(array[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}