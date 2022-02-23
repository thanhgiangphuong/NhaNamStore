package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Case__Study.Book.comma;

public class ChildrenToy extends Product {
    // Create properties
    private String dcXuatXu;
    private String dcThuongHieu;
    private String dcNhaCungCap;
    private String dcHuongDanSuDung;

    // No-arg Constructor
    public ChildrenToy() {
    }
    // Parameterized Constructor
    public ChildrenToy(String maSanPham, String tenSanPham, int soLuong, double donGia,String thuocDanhMuc,
                       String dcXuatXu, String dcThuongHieu, String dcNhaCungCap, String dcHuongDanSuDung) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        this.dcXuatXu = dcXuatXu;
        this.dcThuongHieu = dcThuongHieu;
        this.dcNhaCungCap = dcNhaCungCap;
        this.dcHuongDanSuDung = dcHuongDanSuDung;
    }

    // Setter - Getter
    public String getDcXuatXu() {
        return dcXuatXu;
    }

    public void setDcXuatXu(String dcXuatXu) {
        this.dcXuatXu = dcXuatXu;
    }

    public String getDcThuongHieu() {
        return dcThuongHieu;
    }

    public void setDcThuongHieu(String dcThuongHieu) {
        this.dcThuongHieu = dcThuongHieu;
    }

    public String getDcNhaCungCap() {
        return dcNhaCungCap;
    }

    public void setDcNhaCungCap(String dcNhaCungCap) {
        this.dcNhaCungCap = dcNhaCungCap;
    }

    public String getDcHuongDanSuDung() {
        return dcHuongDanSuDung;
    }

    public void setDcHuongDanSuDung(String dcHuongDanSuDung) {
        this.dcHuongDanSuDung = dcHuongDanSuDung;
    }

    @Override
    public void HienThiThongTin() {

    }

    @Override
    public void PhanTramGiamGia() {

    }
    List<ChildrenToy> ChildrenToylist = new ArrayList<>();
        // Create WritetoChildrenToyfile method
        public void WritetoChildrenToyfile(){
        String lineChildrenToy = null;
        for(ChildrenToy childrenToy : ChildrenToylist){
            lineChildrenToy = childrenToy.getMaSanPham() + comma + childrenToy.getTenSanPham()
                    + comma + childrenToy.getSoLuong() + comma + childrenToy.getDonGia()
                    + comma + childrenToy.getDcXuatXu() + comma + childrenToy.getDcThuongHieu()
                    + comma + childrenToy.getDcNhaCungCap() + comma + childrenToy.getDcHuongDanSuDung();
            FileUtils.FileWriting("ChildrenToy.csv", lineChildrenToy);
        }
    }
    // Create addChildrenToy method
    public void addChildrenToy(ChildrenToy childrenToy) {
        this.ChildrenToylist.add(childrenToy);
    }
    // Enter data for Children Toy
    public static void enterChildrenToy (){
        Scanner scannertoy = new Scanner(System.in);
        System.out.println("Nhập mã đồ chơi: ");
        String toyID = scannertoy.nextLine();
        System.out.println("Nhập tên đồ chơi: ");
        String toyName = scannertoy.nextLine();
        // Validate toy quantity
        int toyQuantity;
        do {
            System.out.println("Số lượng đồ chơi (Vui lòng điền số nguyên dương): ");
            while (!scannertoy.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên dương");
                scannertoy.next();
            }
            toyQuantity = scannertoy.nextInt();
            scannertoy.nextLine();
        } while (toyQuantity <= 0);
        // Validate Toy Price
        double toyPrice;
        do {
            System.out.println("Đơn giá đồ chơi (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannertoy.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannertoy.next();
            }
            toyPrice = scannertoy.nextDouble();
            scannertoy.nextLine();
        } while (toyPrice <= 0);

        System.out.println("Thuộc danh mục: ");
        String toyCategory = scannertoy.nextLine();
        System.out.println("Xuất xứ: ");
        String toyOrigin = scannertoy.nextLine();
        System.out.println("Thương hiệu: ");
        String toyBranch = scannertoy.nextLine();
        System.out.println("Nhà cung cấp: ");
        String toyProvider = scannertoy.nextLine();
        System.out.println("Hướng dẫn sử dụng: ");
        String toyUsingGuide = scannertoy.nextLine();

        Product toy = new ChildrenToy(toyID, toyName, toyQuantity, toyPrice, toyCategory,
                toyOrigin, toyBranch, toyProvider, toyUsingGuide);
        MainmenuControll mainmenuControll = new MainmenuControll();
        mainmenuControll.addDToys(toy);
        FileUtils.FileWriting("ChildrenToy.csv", toy.toString());
    }
}
