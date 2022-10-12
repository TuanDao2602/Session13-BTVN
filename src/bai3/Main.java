package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        List<String> listStr= new ArrayList<>();
        String strChild ="";
        //duyệt chuỗi vừa nhập
        for (int i = 0; i < str.length(); i++) {
            if (strChild.length()==0){
                strChild +=String.valueOf(str.charAt(i));// valuof chuyển thành chuỗi
            }else {
                if (strChild.charAt(strChild.length()-1)<str.charAt(i)){
                    strChild+= String.valueOf(str.charAt(i));
                }else {
                    listStr.add(strChild);
                    strChild+=str.charAt(i);
                }
            }

        }
        int max = listStr.get(0).length();
        for (int i = 0; i < listStr.size(); i++) {
            if (max<listStr.get(i).length()){
                max=listStr.get(i).length();
            }

        }
        for (String strout:listStr) {
            if (strout.length()==max){
                System.out.println(strout);
            }

        }
    }
}
