package Case__Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    // Create properties
    String MaDanhMuc;
    String Loai;
    String MoTa;
    String DanhMucBook;
    String DanhMucDoChoi;
    String DanhMucDoDung;

    List<Category> listCategory = new ArrayList<Category>();
    Scanner scannerCategory = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    public static final String comma = ",";

    public Category() {
    }

    public Category(String maDanhMuc, String loai, String moTa, String danhMucBook,
                    String danhMucDoChoi, String danhMucDoDung) {
        MaDanhMuc = maDanhMuc;
        Loai = loai;
        MoTa = moTa;
        DanhMucBook = danhMucBook;
        DanhMucDoChoi = danhMucDoChoi;
        DanhMucDoDung = danhMucDoDung;
    }

    // Getter
    public String getMaDanhMuc() {
        return MaDanhMuc;
    }

    public String getLoai() {
        return Loai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public String getDanhMucBook() {
        return DanhMucBook;
    }

    public String getDanhMucDoChoi() {
        return DanhMucDoChoi;
    }

    public String getDanhMucDoDung() {
        return DanhMucDoDung;
    }

    // Setter
    public void setDanhMucBook(String danhMucBook) {
        DanhMucBook = danhMucBook;
    }

    public void setDanhMucDoChoi(String danhMucDoChoi) {
        DanhMucDoChoi = danhMucDoChoi;
    }

    public void setDanhMucDoDung(String danhMucDoDung) {
        DanhMucDoDung = danhMucDoDung;
    }

    // Create inputDanhMucBook method
    public void inputBookCategory() {
        System.out.println("Nhập danh mục sách (Văn Học, Khoa học, Chính trị, Tôn Giáo, Thiếu nhi): ");
        DanhMucBook = scannerCategory.nextLine();
        boolean validCategoryBook;
        do {
            validCategoryBook = true;
            switch (DanhMucBook) {
                case "Văn Học":
                    break;
                case "Khoa học":
                    break;
                case "Chính trị":
                    break;
                case "Tôn Giáo":
                    break;
                case "Thiếu nhi":
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    DanhMucBook = scannerCategory.nextLine();
                    validCategoryBook = false;
                    break;
            }
        } while (!validCategoryBook);
    }

    // Create inputThingsCategory method
    public void inputThingsCategory() {
        System.out.println("Nhập danh mục Đồ dùng học tập (Tiểu học, Trung học, Phổ thông): ");
        DanhMucDoDung = scannerCategory.nextLine();
        boolean validCategoryThings;
        do {
            validCategoryThings = true;
            switch (DanhMucDoDung) {
                case "Tiểu học":
                    break;
                case "Trung học":
                    break;
                case "Phổ thông":
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    DanhMucDoDung = scannerCategory.nextLine();
                    validCategoryThings = false;
                    break;
            }
        } while (!validCategoryThings);
    }

    // Create inputToyCategory method
    public void inputToyCategory() {
        System.out.println("Nhập danh mục Đồ dùng học tập (Tiểu học, Trung học, Phổ thông): ");
        DanhMucDoChoi = scannerCategory.nextLine();
        boolean validCategoryToy;
        do {
            validCategoryToy = true;
            switch (DanhMucDoChoi) {
                case "Nhóm 0-3 tuổi":
                    break;
                case "Nhóm 4-8 tuổi":
                    break;
                case "Nhóm trên 8 tuổi":
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    DanhMucDoChoi = scannerCategory.nextLine();
                    validCategoryToy = false;
                    break;
            }
        } while (!validCategoryToy);
    }
}
