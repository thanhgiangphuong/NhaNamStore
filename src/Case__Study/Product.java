package Case__Study;

public abstract class Product {
    // Create properties
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private double DonGia;
    private String ThuocDanhMuc;

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

    // Setter - Getter
    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    public void setThuocDanhMuc(String thuocDanhMuc) {
        ThuocDanhMuc = thuocDanhMuc;
    }

    // Create abstract methods
    public abstract void HienThiThongTin();
    public abstract void PhanTramGiamGia();
}
