public class BooleanArrayPrinter {
    public static void main(String[] args) {
        boolean[][] array = {
                {true, false, true, false},
                {false, true, true, false},
                {true, true, false, true}
        };

        printBooleanArray(array);
    }

    public static void printBooleanArray(boolean[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Print column numbers
        System.out.print("   ");
        for (int c = 0; c < cols; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Print row numbers and contents
        for (int r = 0; r < rows; r++) {
            System.out.print(r + "  "); // Row number
            for (int c = 0; c < cols; c++) {
                System.out.print(arr[r][c] ? "* " : "  ");
            }
            System.out.println();
        }
    }
}
