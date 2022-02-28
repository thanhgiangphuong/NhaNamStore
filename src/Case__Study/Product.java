package Case__Study;

import java.util.Scanner;

public abstract class Product extends Category {
    // Create properties
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private double DonGia;

    Scanner scannerPr = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();

    // No-arg Constructor
    public Product() {
    }

    // Parameterized Constructor
    public Product(String maSanPham, String tenSanPham, int soLuong, double donGia) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    // Create input information of product method
    public void inputProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        MaSanPham = scannerPr.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        TenSanPham = scannerPr.nextLine();

        // Validate "Số lượng"
        do {
            System.out.println("Số lượng sản phẩm (Vui lòng điền số nguyên dương): ");
            while (!scannerPr.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên dương");
                scannerPr.next();
            }
            SoLuong = scannerPr.nextInt();
            scannerPr.nextLine();
        } while (SoLuong <= 0);

        // Validate "Đơn giá"
        do {
            System.out.println("Đơn giá (Vui lòng điền số lớn hơn 10000 và nhỏ hơn 20000000): ");
            while (!scannerPr.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerPr.next();
            }
            DonGia = scannerPr.nextDouble();
            scannerPr.nextLine();
        } while (DonGia > 20000000 || DonGia < 10000);
    }

    // Create abstract methods
    public abstract void HienThiThongTin();

    public abstract void PhanTramGiamGia();

    // Getter
    public String getMaSanPham() {
        return MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }
}
