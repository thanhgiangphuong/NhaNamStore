package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    // Create properties
    private String MaKhachHang;
    private String HoTen;
    private String SoDienThoai;
    private String Email;
    private String NgaySinh;
    private String LoaiKhachHang;
    private double TongTienMuaHang;

    List<Customer> listCustomer = new ArrayList<Customer>();
    Scanner scannerCtm = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    public static final String comma = ",";

    // No-arg Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String maKhachHang, String hoTen, String soDienThoai, String email,
                    String ngaySinh, String loaiKhachHang, double tongTienMuaHang) {
        MaKhachHang = maKhachHang;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKhachHang = loaiKhachHang;
        TongTienMuaHang = tongTienMuaHang;
    }

    public void inputBook() {
        System.out.println("Mã khách hàng: ");
        MaKhachHang = scannerCtm.nextLine();

        System.out.println("Họ tên: ");
        HoTen = scannerCtm.nextLine();

//        System.out.println("Số điện thoại: ");
//        SoDienThoai = scannerCtm.nextLine();
        boolean valid;
        SoDienThoai = null;
        do {
            valid = true;
            try {
                System.out.println("Số điện thoại (Vui lòng nhập đủ 12 số): ");
                SoDienThoai = scannerCtm.nextLine();
                if (SoDienThoai.matches("[0]{1}[0-9]{11}")) {
                    SoDienThoai = scannerCtm.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Không hợp lệ! Vui lòng nhập lại");
                valid = false;
            }
        } while (!valid);

        System.out.println("Email: ");
        Email = scannerCtm.nextLine();

        System.out.println("Ngày sinh: ");
        NgaySinh = scannerCtm.nextLine();

        System.out.println("Loại khách hàng: ");
        LoaiKhachHang = scannerCtm.nextLine();
    }

    public void HienThiThongTinKhachHang() {

    }

    // Getter
    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public double getTongTienMuaHang() {
        return TongTienMuaHang;
    }
}
