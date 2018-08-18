package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        double sum = 0;

        System.out.print("Nhập vào kích thước ma trận: ");
        size = scanner.nextInt();

        double[][] array = new double[size][size];

        System.out.println("Nhập vào danh sách phẩn tử của mảng: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("a[" + row + "][" + column + "] = ");
                array[row][column] = scanner.nextDouble();
            }
        }

        System.out.println("Ma trận vừa nhập là: ");
        for (int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
            {
                System.out.print(array[row][column] + "\t\t");
                if(column == (array.length - 1))
                {
                    System.out.println("\n");
                }
            }
        }

//        Tính tổng các phần tử hàng chéo chính
        for (int row = 0; row < array.length; row++)
        {
            sum += array[row][row];
        }

        System.out.print("Tổng các phần tử hàng chiếu chính là: "+ sum);
    }
}
