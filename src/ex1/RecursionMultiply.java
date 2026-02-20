package ex1;

public class RecursionMultiply {

        public static int multiply(int a, int b) {

            // Base case
            if (b == 0)
                return 0;

            // Recursive case
            return a + multiply(a, b - 1);
        }

        public static void main(String[] args) {
            int result = multiply(6, 5);
            System.out.println("Product = " + result);
        }
    }
