/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class UserController {

    public static void processInsert() throws SQLException {
        System.out.println("Thực hiện thêm mới sinh viên.");
        System.out.println("Nhập tên sinh viên.");
        String name = ScannerUtil.getString();
        System.out.println("Nhập id sinh viên.");
        String id = ScannerUtil.getString();
        
        User user = new User();
        user.setStudent_id(id);
        user.setStuden_name(name);
        UserModel.insert(user);
    }

    public static void processGetList() throws SQLException {
        System.out.println("-----DANH SÁCH SINH VIÊN -----");

        User user = new User();
        UserModel.getList(user);
    }

    public static void processUpdate() throws SQLException {
        System.out.println("Sửa thông tin sinh viên.");
        System.out.println("Nhập id sinh viên.");
        String id = ScannerUtil.getString();
        String name = ScannerUtil.getString();
        
        User user = new User();
        user.setStudent_id(id);
        user.setStuden_name(name);
        UserModel.update(user);
    }

    /**
     *
     * @throws SQLException
     */
    public static void processDelete() throws SQLException {
        System.out.println("Xóa thông tin sinh viên.");
        System.out.println("Nhập id sinh viên.");
        String id = ScannerUtil.getString();
        User user = new User();
        user.setStudent_id(id);
        UserModel.delete(user);
    }

    public static void processSearch() throws SQLException {
        System.out.println("Tìm kiếm thông tin sinh viên.");
        System.out.println("Nhập id sinh viên.");
        String id = ScannerUtil.getString();
        User user = new User();
        user.setStudent_id(id);
        UserModel.search(user);
    }

}
