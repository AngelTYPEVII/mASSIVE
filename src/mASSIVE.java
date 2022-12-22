public class Massive {

    public static void main(String[] args) {
        double[] myList = {99, 2, 4, 5, 33, 127, 33, 899, 63};


        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольшее: " + max);
    }
}