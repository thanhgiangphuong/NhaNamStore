package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Product {
    // Create properties
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private double DonGia;
    private String ThuocDanhMuc;

    Scanner scannerPr = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();

    // No-arg Constructor
    public Product() {
    }

    // Parameterized Constructor
    public Product(String maSanPham, String tenSanPham, int soLuong, double donGia, String thuocDanhMuc) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        SoLuong = soLuong;
        DonGia = donGia;
        ThuocDanhMuc = thuocDanhMuc;
    }
    // Create input information of product method
    public void inputProduct(){
        System.out.println("Nhập mã sản phẩm: ");
        MaSanPham = scannerPr.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        TenSanPham = scannerPr.nextLine();

        // Validate "Số lượng"
       // int slSP;
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
            System.out.println("Đơn giá sách (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannerPr.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerPr.next();
            }
            DonGia = scannerPr.nextDouble();
            scannerPr.nextLine();
        } while (DonGia <= 0);

        System.out.println("Thuộc danh mục: ");
        String ThuocDanhMuc = scannerPr.nextLine();

    }

    // Create abstract methods
    public abstract void HienThiThongTin();
    public abstract void PhanTramGiamGia();


    @Override
    public String toString() {
        return "Product{" +
                "MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }
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

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }


}
