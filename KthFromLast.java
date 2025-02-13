import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KthFromLast {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java KthFromLast <k>");
            return;
        }

        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of strings (press Ctrl+D or Ctrl+Z to end input):");

        while (scanner.hasNext()) {
            queue.add(scanner.next());
            if (queue.size() > k) {
                queue.poll(); // Maintain only last k elements in the queue
            }
        }
        scanner.close();

        if (queue.size() < k) {
            System.out.println("Error: Input has fewer than " + k + " strings.");
        } else {
            System.out.println("The " + k + "th from last string is: " + queue.poll());
        }
    }
}
