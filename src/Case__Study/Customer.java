package Case__Study;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
    // private double TongTienMuaHang;

    List<Customer> listCustomer = new ArrayList<Customer>();
    Scanner scannerCtm = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    public static final String comma = ",";

    // No-arg Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String maKhachHang, String hoTen, String soDienThoai, String email,
                    String ngaySinh, String loaiKhachHang) {
        MaKhachHang = maKhachHang;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKhachHang = loaiKhachHang;
        //TongTienMuaHang = tongTienMuaHang;
    }

    //Create input customer from keyboard method
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
            if (!validSDT) {
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
            try {
                System.out.println("Nhập ngày sinh theo đúng định dang dd/mm/yyyy và lớn hơn 16 tuổi: ");
                String ngaysinh = scannerCtm.nextLine();
                // Get current year
                Date currentDate = new Date();
                ZoneId timeZone = ZoneId.systemDefault();
                LocalDate getLocalDate = currentDate.toInstant().atZone(timeZone).toLocalDate();
                int currentYear = getLocalDate.getYear();

                // Validate age greater than 16
                int year = 0;
                try {
                    String[] split = ngaysinh.split("/");
                    year = Integer.parseInt(split[2]);
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
                int age = currentYear - year;
                if (age < 16) {
                    throw new Exception("Nhỏ hơn 16 tuổi, không được phép mua hàng");
                }
                // Validate format of date "dd/mm/yyyy
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                NgaySinh = LocalDate.parse(ngaysinh, formatter).format(formatter);
            } catch (Exception e) {
                System.out.println("Ngày sinh không hợp lệ, vui lòng nhập lại");
                validBD = false;
            }
        } while (!validBD);

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
                System.out.println(LoaiKhachHang);
                break;
        }
        Customer customer = new Customer(getMaKhachHang(), getHoTen(), getSoDienThoai(),
                getEmail(), getNgaySinh(), getLoaiKhachHang());
        listCustomer.add(customer);
    }

    // Create Add customer into file csv method
    public void addCustomer() {
        String line = null;
        for (Customer customer : listCustomer) {
            line = customer.getMaKhachHang() + comma + getHoTen() + comma + getSoDienThoai()
                    + comma + getEmail() + comma + getNgaySinh() + comma + getLoaiKhachHang();
            fileUtils.FileWriting("Customer.csv", line);
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

//    public double getTongTienMuaHang() {
//        return TongTienMuaHang;
//    }
}
