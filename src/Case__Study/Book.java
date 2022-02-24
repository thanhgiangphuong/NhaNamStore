package Case__Study;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    // Create properties
    private String NhaXuatBan;
    private int NamXuatBan;
    private String TacGia;
    private String NgayXuatBan;
    private int LanTaiBan;

    List<Book> listBook = new ArrayList<Book>();
    Scanner scannerBook = new Scanner(System.in);
    FileUtils fileUtils = new FileUtils();
    public static final String comma = ",";

    // No-arg Constructor
    public Book() {
    }

    // Parameterized Constructor
    public Book(String maSanPham, String tenSanPham, int soLuong, double donGia, String thuocDanhMuc,
                String nhaXuatBan, int namXuatBan, String tacGia, String ngayXuatBan, int lanTaiBan) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        LanTaiBan = lanTaiBan;
    }

    public void inputBook() {
        inputProduct();
        System.out.println("Nhà xuất bản: ");
        NhaXuatBan = scannerBook.nextLine();

        //  Validate "Năm xuất bản"
        do {
            System.out.println("Năm xuất bản (Vui lòng điền số nằm trong khoảng 1000 -> 2021): ");
            while (!scannerBook.hasNextInt()) {
                System.out.println("Vui lòng nhập số");
                scannerBook.next();
            }
            NamXuatBan = scannerBook.nextInt();
            scannerBook.nextLine();
        } while (NamXuatBan < 1000 || NamXuatBan > 2021);

        System.out.println("Tác giả: ");
        TacGia = scannerBook.nextLine();

        //  Validate for Ngày Xuất Bản
        NgayXuatBan = null;
        boolean valid;
        do {
            valid = true;
            try {
                System.out.println("Nhập ngày xuất bản theo định dạng dd/MM/yyyy");
                String startDateString = scannerBook.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                NgayXuatBan = LocalDate.parse(startDateString, formatter).format(formatter2);
            } catch (Exception e) {
                System.out.println("Không hợp lệ!");
                valid = false;
            }
        } while (!valid);

        // Validate Lần tái bản
        do {
            System.out.println("Lần tái bản (Vui lòng điền số nguyên dương): ");
            while (!scannerBook.hasNextInt()) {
                System.out.println("Vui lòng nhập số");
                scannerBook.next();
            }
            LanTaiBan = scannerBook.nextInt();
        } while (LanTaiBan <= 0);
        Book book = new Book(getMaSanPham(), getTenSanPham(), getSoLuong(), getDonGia(), getThuocDanhMuc(),
                getNhaXuatBan(), getNamXuatBan(), getTacGia(), getNgayXuatBan(), getLanTaiBan());
        listBook.add(book);
    }

    // Create addBook method to add information of book to file
    public void addBook() {
        System.out.println("Thêm thông tin vào file sách");

        String line = null;
        for (Book book : listBook) {
            line = book.getMaSanPham() + comma + book.getTenSanPham() + comma + book.getSoLuong()
                    + comma + book.getDonGia() + comma + book.getThuocDanhMuc() + comma + book.getNhaXuatBan()
                    + comma + book.getNamXuatBan() + comma + book.getTacGia() + comma + book.getNgayXuatBan()
                    + comma + book.getLanTaiBan();
            fileUtils.FileWriting("Book.csv", line);
        }
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(fileUtils.FileReader("Book.csv"));
    }

    @Override
    public void PhanTramGiamGia() {

    }

    // Getter
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public String getNgayXuatBan() {
        return NgayXuatBan;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public Scanner getScannerBook() {
        return scannerBook;
    }
}