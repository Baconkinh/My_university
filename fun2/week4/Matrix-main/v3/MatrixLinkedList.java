import java.util.Scanner;

class Node {
    int data;
    Node nextRow;
    Node nextCol;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.nextRow = null;
        this.nextCol = null;
    }
}

class MatrixLinkedList {
    Node head;

    // สร้างเมทริกซ์จากค่าที่รับเข้ามา
    public void createMatrix(int rows, int cols, Scanner scanner) {
        Node[][] matrix = new Node[rows][cols];

        // รับค่าทีละตำแหน่งและสร้างโหนด
        System.out.println("Enter values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Value at [" + i + "][" + j + "]: ");
                int value = scanner.nextInt();
                matrix[i][j] = new Node(value);
            }
        }

        // เชื่อมโยงโหนดในแถวและคอลัมน์
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + 1 < rows) {
                    matrix[i][j].nextRow = matrix[i + 1][j]; // เชื่อมโยงแถวถัดไป
                }
                if (j + 1 < cols) {
                    matrix[i][j].nextCol = matrix[i][j + 1]; // เชื่อมโยงคอลัมน์ถัดไป
                }
            }
        }

        // ตั้งค่า head ให้เป็นโหนดเริ่มต้น
        head = matrix[0][0];
    }

    // แสดงค่าเมทริกซ์
    public void displayMatrix() {
        Node row = head;

        while (row != null) {
            Node col = row;
            while (col != null) {
                System.out.print(col.data + " ");
                col = col.nextCol;
            }
            System.out.println();
            row = row.nextRow;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixLinkedList matrix = new MatrixLinkedList();

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        matrix.createMatrix(rows, cols, scanner);
        System.out.println("The matrix is:");
        matrix.displayMatrix();
    }
}
