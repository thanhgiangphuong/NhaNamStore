package Case__Study;

import java.util.Date;

public class Customer {
    // Create properties
    private String MaKhachHang;
    private String HoTen;
    private double SoDienThoai;
    private String Email;
    private Date NgaySinh;
    private String LoaiKhachHang;
    private double TongTienMuaHang;

    // No-arg Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String maKhachHang, String hoTen, double soDienThoai, String email,
                    Date ngaySinh, String loaiKhachHang, double tongTienMuaHang) {
        MaKhachHang = maKhachHang;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKhachHang = loaiKhachHang;
        TongTienMuaHang = tongTienMuaHang;
    }

    // Setter - Getter

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public double getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(double soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        LoaiKhachHang = loaiKhachHang;
    }

    public double getTongTienMuaHang() {
        return TongTienMuaHang;
    }

    public void setTongTienMuaHang(double tongTienMuaHang) {
        TongTienMuaHang = tongTienMuaHang;
    }




    public void HienThiThongTinKhachHang(){

    }
}
