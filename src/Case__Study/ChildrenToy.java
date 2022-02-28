package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildrenToy extends Product {
    // Create properties
    String ThuocDanhMuc = getDanhMucDoChoi();
    private String dcXuatXu;
    private String dcThuongHieu;
    private String dcNhaCungCap;
    private String dcHuongDanSuDung;

    List<ChildrenToy> listChildrenToy = new ArrayList<ChildrenToy>();
    Scanner scannerToy = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    Category category = new Category();
    public static final String comma = ",";

    // No-arg Constructor
    public ChildrenToy() {
    }

    // Parameterized Constructor
    public ChildrenToy(String maSanPham, String tenSanPham, int soLuong, double donGia, String thuocDanhMuc,
                       String dcXuatXu, String dcThuongHieu, String dcNhaCungCap, String dcHuongDanSuDung) {
        super(maSanPham, tenSanPham, soLuong, donGia);
        ThuocDanhMuc = thuocDanhMuc;
        this.dcXuatXu = dcXuatXu;
        this.dcThuongHieu = dcThuongHieu;
        this.dcNhaCungCap = dcNhaCungCap;
        this.dcHuongDanSuDung = dcHuongDanSuDung;
    }

    public void inputChildrenToy() {
        inputProduct();
        category.inputToyCategory();

        System.out.println("Xuất xứ: ");
        dcXuatXu = scannerToy.nextLine();
        System.out.println("Thương hiệu: ");
        dcThuongHieu = scannerToy.nextLine();
        System.out.println("Nhà cung cấp: ");
        dcNhaCungCap = scannerToy.nextLine();
        System.out.println("Hướng dẫn sử dụng: ");
        dcHuongDanSuDung = scannerToy.nextLine();

        // Create object to add ChildrenToy into list ChildrenToy
        ChildrenToy childrenToy = new ChildrenToy(getMaSanPham(), getTenSanPham(), getSoLuong(), getDonGia(),
                getDanhMucDoChoi(), getDcXuatXu(), getDcThuongHieu(), getDcNhaCungCap(), getDcHuongDanSuDung());
        listChildrenToy.add(childrenToy);
    }

    // Create addBook method to add information of book to file
    public void addChildrentoy() {
        String line = null;
        for (ChildrenToy childrenToy : listChildrenToy) {
            line = childrenToy.getMaSanPham() + comma + childrenToy.getTenSanPham() + comma + childrenToy.getSoLuong()
                    + comma + getDonGia() + comma + getDanhMucDoChoi() + comma + childrenToy.getDcXuatXu()
                    + comma + childrenToy.getDcThuongHieu() + comma + childrenToy.getDcNhaCungCap()
                    + comma + childrenToy.getDcHuongDanSuDung();
            fileUtils.FileWriting("ChildrenToy.csv", line);
        }
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(fileUtils.FileReader("ChildrenToy.csv"));
    }

    @Override
    public void PhanTramGiamGia() {

    }

    // Getter
    public String getDcXuatXu() {
        return dcXuatXu;
    }

    public String getDcThuongHieu() {
        return dcThuongHieu;
    }

    public String getDcNhaCungCap() {
        return dcNhaCungCap;
    }

    public String getDcHuongDanSuDung() {
        return dcHuongDanSuDung;
    }
}
