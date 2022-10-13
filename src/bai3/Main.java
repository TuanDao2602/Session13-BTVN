package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        String str = scanner.nextLine();// chuỗi abcabcdgabcxy
        List<String> listStr= new ArrayList<>();
        String strChild ="";//
        //duyệt chuỗi vừa nhập
        for (int i = 0; i < str.length(); i++) {
            if (strChild.length()==0){
                strChild +=String.valueOf(str.charAt(i));// valuof chuyển thành chuỗi
                // strChild sẽ + a
            }else {
                if (strChild.charAt(strChild.length()-1)<str.charAt(i)){// tính theo mã scii
                    strChild+= String.valueOf(str.charAt(i));//vì sắp theo phần tử tăng dần của mã scii nên khi phần tử lúc này phần tử cuối cùng là a . duyệt chuỗi str nhập vao
                    // nếu mà phần tử sau a mà >a thì sẽ + với a . lúc này chuỗi sẽ thành a+b;

                }else {
                    listStr.add(strChild);// nếu mà a> phần tử tiếp theo của chuỗi str thì list str sẽ + luôn chuỗi vừa nhaanj dc là phần tử đầu tiên ;
                    strChild="";
                    strChild+=str.charAt(i); // chuỗi lúc này sẽ bắt đầu từ phần tử nhỏ hơn phần tử cuối cùng của chuỗi dc strChild khi chưa gán bằng rỗng
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
