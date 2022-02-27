package Case__Study;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void inputCustomer() {
        System.out.println("Mã khách hàng: ");
        MaKhachHang = scannerCtm.nextLine();

        System.out.println("Họ tên: ");
        HoTen = scannerCtm.nextLine();

        // Validate phone number
        boolean validSDT;
        System.out.println("Số điện thoại (Vui lòng nhập đủ 12 số): ");
        do {
                SoDienThoai = scannerCtm.nextLine();
                validSDT = SoDienThoai.matches("^\\d{12}$");
                if(!validSDT){
                    System.out.println("Không hợp lệ, vui lòng nhập lại");
                }
        } while (!validSDT);

        // Validate Email
        boolean validEmail;
        System.out.println("Nhập Email đúng định dạng: ");
        do {
            Email = scannerCtm.nextLine();
            validEmail = Email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
                if (!validEmail) {
                    System.out.println("Nhập sai Email, vui lòng nhập lại");
                }
        } while (!validEmail);

        // Validate Date of Birth
        boolean validBD;
        NgaySinh = null;
        do {
            validBD = true;
         //   try {
                System.out.println("Nhập ngày sinh theo đúng định dang dd/mm/yyyy và lớn hơn 16 tuổi: ");
                String ngaysinh = scannerCtm.nextLine();
                String[] split = ngaysinh.split("/");
                Date currentDate = new Date();
                int currentYear = currentDate.getYear();
                try {
                    int year = Integer.parseInt(split[2]);
                    int age = currentYear - year;
                    if (age < 16) {
                        System.out.println("Nhỏ hơn 16 tuổi, không được phép mua hàng");
                    }
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                NgaySinh = LocalDate.parse(ngaysinh, formatter).format(formatter2);
//            } catch (Exception e) {
//                System.out.println("Ngày sinh không hợp lệ, vui lòng nhập lại");
//                validBD = false;
//            }
        } while (validBD);

        // Validate Customer type
        System.out.println("Loại khách hàng (Thường, VIP1, VIP2): ");
        LoaiKhachHang = scannerCtm.nextLine();
        switch (LoaiKhachHang) {
            case "Thường":
            case "VIP1":
            case "VIP2": {
                break;
            }
            default:
                LoaiKhachHang = "Thường";
                break;
        }
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
