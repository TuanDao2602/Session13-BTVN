package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào độ dài của mảng");
        int number = Integer.parseInt(scanner.nextLine());
        int[] numberArr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhap phan tu thu"+(i+1));
            numberArr[i] =Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(numberArr);
        System.out.println("mảng sau khi sắp xếp là: ");
        for (Integer index : numberArr) {
            System.out.println(index+"\t");
        }
        System.out.println("Nhap phan tu can tim kiem vao");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (binarySearch(numberArr,inputNumber)!=-1){
            System.out.printf("%d nằm ở vị trí index %d\n",inputNumber,binarySearch(numberArr,inputNumber));
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value < arr[mid]) {
                right = mid - 1;
            } else if (value == arr[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
