package CodingProblems;

public class firstnonrepeating {

    public static void main(String[] args){

      /*
      merge arrays
       */
        int[] x = {1, 2, 3, 0, 0, 0};  // Original array
        int insertIndex = 2;            // Index where you want to insert
        int newValue = 2;               // Value to insert

        // Shift elements to the right from the insertIndex
        for (int i = x.length - 1; i > insertIndex; i--) {
            x[i] = x[i - 1];
        }

        // Insert the new value at the insertIndex
        x[insertIndex] = newValue;




    }
}
