/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.sql.SQLException;

/**
 *
 * @author NgocPLH
 */
public class UserManagementMenu {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // Call method to print out the menu
        printMenu();
    }

    static void printBeauty() {
        System.out.printf("%-30s %f\n", "Hello", 10.2);
        System.out.printf("%-30s %f\n", "Hello World World", 10.2);
    }

    static void printMenu() throws SQLException {
        int choice;
        while (true) {
            System.out.println("==== Phần mềm quản lý sinh viên ====");
            System.out.println("|     1. Danh Sách                 |");
            System.out.println("|     2. Thêm mới SV               |");
            System.out.println("|     3. Sửa thông tin SV          |");
            System.out.println("|     4. Xóa thông tin SV          |");
            System.out.println("|     5. Tìm kiếm                  |");
            System.out.println("|     6. Thoát                     |");
            System.out.println("====================================");
            System.out.println("Nhấn từ 1 đến 6 để lựa chọn thao tác!");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = ScannerUtil.getInt();

            switch (choice) {
                case 1:
                    UserController.processGetList();
                    break;
                case 2:
                    UserController.processInsert();
                    break;
                case 3:
                    UserController.processUpdate();
                    break;
                case 4:
                    UserController.processDelete();
                    break;
                case 5:
                    UserController.processSearch();
                    break;
                case 6:
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    break;
                default:
                    System.out.println("Chỉ chọn từ 1 đến 6.");
                    break;
            }

            if (choice == 6) {
                break;
            }
        }

    }

}
