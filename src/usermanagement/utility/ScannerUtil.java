/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ScannerUtil {

    /**
     * Hàm lọc giá trị kiểu số.
     * Sử dụng khi chọn thao tác trên menu
     * và các trường yêu cầu nhập giá trị kiểu số.
     * @return 
     */
    public static int getInt() {
        int inputInt = 0;
        while (true) {
            try {
                inputInt = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập số: ");
            }
        }
        return inputInt;
    }

    /** Hàm validate giá trị nhập vào kiểu chuỗi.
     *  Dùng trong các thao tác sửa, thêm thông tin người dùng.
     * @return 
     */
    public static String getString() {
        String inputString = "";
        while (true) {
            try {
                inputString = new Scanner(System.in).nextLine();
                if (inputString.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Vui lòng nhập định dạng chuỗi: ");
            }
        }
        return inputString;
    }
}
