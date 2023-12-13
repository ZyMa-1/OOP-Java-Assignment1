package Matrix;

public class Main {
    public static void main(String[] args) {
        // Creating data for matrices
        double[][] data1 = new double[][]{
                {1, 2},
                {3, 4}
        };

        double[][] data2 = new double[][]{
                {4, 3},
                {2, 1},
        };

        // Creating matrices
        Matrix matrix1 = new Matrix(2, 2, data1);
        Matrix matrix2 = new Matrix(2, 2, data2);

        System.out.println("Initial Matrix 1:");
        matrix1.print();

        System.out.println("Initial Matrix 2:");
        matrix2.print();

        // Matrix addition
        matrix1.add(matrix2);
        System.out.println("After Adding Matrix 2 to Matrix 1:");
        matrix1.print();

        // Multiply by a number
        matrix1.multiply(2.0);
        System.out.println("After Multiplying Matrix 1 by 2.0:");
        matrix1.print();

        // Matrix multiplication
        Matrix res = matrix1.multiply(matrix2);
        System.out.println("Result of Matrix Multiplication Of Matrix 1 and Matrix 2:");
        res.print();
    }
}
