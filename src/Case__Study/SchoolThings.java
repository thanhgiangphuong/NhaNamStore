package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolThings extends Product {
    // Create properties
    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private Double KichThuoc;

    List<SchoolThings> listSchoolThings = new ArrayList<SchoolThings>();
    Scanner scannerThings = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    public static final String comma = ",";

    // No-arg Constructor
    public SchoolThings() {
    }

    // Parameterized Constructor
    public SchoolThings(String maSanPham, String tenSanPham, int soLuong, double donGia,
                        String thuocDanhMuc, String xuatXu, String thuongHieu, String nhaCungCap,
                        String huongDanSuDung, String mauSac, String chatLieu, Double kichThuoc) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
        MauSac = mauSac;
        ChatLieu = chatLieu;
        KichThuoc = kichThuoc;
    }
    public void inputSchoolThings() {
        inputProduct();
        System.out.println("Xuất xứ: ");
        XuatXu = scannerThings.nextLine();
        System.out.println("Thương hiệu: ");
        ThuongHieu = scannerThings.nextLine();
        System.out.println("Nhà cung cấp: ");
        NhaCungCap = scannerThings.nextLine();
        System.out.println("Hướng dẫn sử dụng: ");
        HuongDanSuDung = scannerThings.nextLine();
        // Validate "Màu sắc"
        System.out.println("Màu sắc: ");
        MauSac = scannerThings.nextLine();
        boolean validColor;
        do {
            validColor = true;

            switch (MauSac) {
                case "Xanh":
                    System.out.println("Màu sắc: Xanh");
                    break;
                case "Đỏ":
                    System.out.println("Màu sắc: Đỏ");
                    break;
                case "Vàng":
                    System.out.println("Màu sắc: Vàng");
                    break;
                case "Đen":
                    System.out.println("Màu sắc: Đen");
                    break;
                case "Trắng":
                    System.out.println("Màu sắc: Trắng");
                    break;
                default:
                    System.out.println("Vui lòng nhập lại, chỉ được nhập trong phạm vi (Xanh, Đỏ, Vàng, Đen, Trắng)");
                    MauSac = scannerThings.nextLine();
                    validColor = false;
                    break;
            }
        } while (!validColor);

        System.out.println("Chất liệu: ");
        ChatLieu = scannerThings.nextLine();

        // Validate "Kích thước"
        do {
            System.out.println("Kích thước đồ dùng (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannerThings.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerThings.next();
            }
            KichThuoc = scannerThings.nextDouble();
        } while (KichThuoc <= 0);

        SchoolThings schoolThings = new SchoolThings(getMaSanPham(), getTenSanPham(), getSoLuong(),
                getDonGia(), getThuocDanhMuc(), getXuatXu(), getThuongHieu(), getNhaCungCap(),
                getHuongDanSuDung(), getMauSac(), getChatLieu(), getKichThuoc());
        listSchoolThings.add(schoolThings);
    }
    // Create addBook method to add information of book to file
    public void addSchoolThings() {
        System.out.println("Thêm thông tin vào file đồ dùng học tập");

        String line = null;
        for (SchoolThings schoolThings : listSchoolThings) {
            line = schoolThings.getMaSanPham() + comma + schoolThings.getTenSanPham()
                    + comma+ schoolThings.getSoLuong() + comma + schoolThings.getDonGia()
                    + comma + schoolThings.getThuocDanhMuc() + comma + schoolThings.getXuatXu()
                    + comma + schoolThings.getThuongHieu() + comma + schoolThings.getNhaCungCap()
                    + comma + schoolThings.getHuongDanSuDung() + comma + getMauSac()
                    + comma + getChatLieu() + comma +getKichThuoc();

            fileUtils.FileWriting("SchoolThings.csv", line);
        }
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(fileUtils.FileReader("SchoolThings.csv"));
    }

    @Override
    public void PhanTramGiamGia() {

    }
    // Getter
    public String getXuatXu() {
        return XuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public String getMauSac() {
        return MauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public Double getKichThuoc() {
        return KichThuoc;
    }
}
