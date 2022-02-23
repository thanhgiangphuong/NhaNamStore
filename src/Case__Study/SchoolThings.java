package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Case__Study.Book.comma;

public class SchoolThings extends Product{
    // Create properties
    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private Double KichThuoc;

    // No-arg Constructor
    public SchoolThings() {
    }

    // Parameterized Constructor
    public SchoolThings(String maSanPham, String tenSanPham, int soLuong, double donGia,
                        String thuocDanhMuc,String xuatXu, String thuongHieu, String nhaCungCap,
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

    // Setter - Getter
    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        NhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        HuongDanSuDung = huongDanSuDung;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public Double getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(Double kichThuoc) {
        KichThuoc = kichThuoc;
    }

    @Override
    public void HienThiThongTin() {

    }

    @Override
    public void PhanTramGiamGia() {

    }
    List<SchoolThings> SchoolThingslist = new ArrayList<>();
    // Create WritetoSchoolThingsfile method
    public void WritetoSchoolThingsfile(){
        String lineSchoolThings = null;
        for(SchoolThings schoolThings : SchoolThingslist){
            lineSchoolThings = schoolThings.getMaSanPham() + comma + schoolThings.getTenSanPham()
                    + comma + schoolThings.getSoLuong() + comma + schoolThings.getDonGia()
                    + comma + schoolThings.getXuatXu() + comma + schoolThings.getThuongHieu()
                    + comma + schoolThings.getNhaCungCap() + comma + schoolThings.getHuongDanSuDung()
                    + comma + schoolThings.getMauSac() + comma + schoolThings.getChatLieu()
                    + comma + schoolThings.getKichThuoc();
            FileUtils.FileWriting("SchoolThings.csv", lineSchoolThings);
        }
    }
    // Create addSchoolThings method
    public void addSchoolThings(SchoolThings schoolThings) {
        this.SchoolThingslist.add(schoolThings);
    }
    // Enter data for SchoolThings
    public static void EnterSchoolThings (){
        Scanner scannerthings = new Scanner(System.in);
        System.out.println("Nhập mã đồ dùng: ");
        String thingsID = scannerthings.nextLine();
        System.out.println("Nhập tên đồ dùng: ");
        String thingsName = scannerthings.nextLine();
        // Validate things quantity
        int thingsQuantity;
        do {
            System.out.println("Số lượng đồ dùng (Vui lòng điền số nguyên dương): ");
            while (!scannerthings.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên dương");
                scannerthings.next();
            }
            thingsQuantity = scannerthings.nextInt();
            scannerthings.nextLine();
        } while (thingsQuantity <= 0);
        // Validate things price
        double thingsPrice;
        do {
            System.out.println("Đơn giá đồ dùng (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannerthings.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerthings.next();
            }
            thingsPrice = scannerthings.nextDouble();
            scannerthings.nextLine();
        } while (thingsPrice <= 0);

        System.out.println("Thuộc danh mục: ");
        String thingsCategory = scannerthings.nextLine();
        System.out.println("Xuất xứ: ");
        String thingsOrigin = scannerthings.nextLine();
        System.out.println("Thương hiệu: ");
        String thingsBranch = scannerthings.nextLine();
        System.out.println("Nhà cung cấp: ");
        String thingsProvider = scannerthings.nextLine();
        System.out.println("Hướng dẫn sử dụng: ");
        String thingsUsingGuide = scannerthings.nextLine();
        System.out.println("Màu sắc: ");
        String thingsColor = scannerthings.nextLine();
        boolean validColor;
        do {
            validColor = true;

            switch (thingsColor) {
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
                    thingsColor = scannerthings.nextLine();
                    validColor = false;
                    break;
            }
        } while (!validColor);

        System.out.println("Chất liệu: ");
        String thingsMaterial = scannerthings.nextLine();

        Double thingsSize;
        do {
            System.out.println("Kích thước đồ dùng (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannerthings.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerthings.next();
            }
            thingsSize = scannerthings.nextDouble();
        } while (thingsSize <= 0);

        Product thing = new SchoolThings(thingsID, thingsName, thingsQuantity, thingsPrice,
                thingsCategory, thingsOrigin, thingsBranch, thingsProvider, thingsUsingGuide,
                thingsColor, thingsMaterial, thingsSize);
        MainmenuControll mainmenuControll = new MainmenuControll();
        mainmenuControll.addThings(thing);
        FileUtils.FileWriting("SchoolThings.csv", thing.toString());
    }
}
