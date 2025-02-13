public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        printTransposedArray(array);
    }

    public static void printTransposedArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Print transposed array
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
