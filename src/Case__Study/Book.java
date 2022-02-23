package Case__Study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    // Create properties
    private String NhaXuatBan;
    private int NamXuatBan;
    private String TacGia;
    private Date NgayXuatBan;
    private int LanTaiBan;

    // No-arg Constructor
    public Book() {
    }

    // Parameterized Constructor
    public Book(String maSanPham, String tenSanPham, int soLuong, double donGia, String thuocDanhMuc,
                String nhaXuatBan, int namXuatBan, String tacGia, Date ngayXuatBan, int lanTaiBan) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        LanTaiBan = lanTaiBan;
    }

    // Setter - Getter
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        NamXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public Date getNgayXuatBan() {
        return NgayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        NgayXuatBan = ngayXuatBan;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        LanTaiBan = lanTaiBan;
    }

    @Override
    public void HienThiThongTin() {

    }

    @Override
    public void PhanTramGiamGia() {

    }

    public static final String comma = ",";
    List<Book> Booklist = new ArrayList<>();

    // Create WritetoBookfile method
    public void WritetoBookfile() {
        String lineBook = null;
        for (Book book : Booklist) {
            lineBook = book.getMaSanPham() + comma + book.getTenSanPham() + comma + book.getSoLuong() + comma
                    + book.getDonGia() + comma + book.getNhaXuatBan() + comma + book.getNamXuatBan() + comma
                    + book.getTacGia() + comma + book.getNgayXuatBan() + comma + book.getLanTaiBan();
            FileUtils.FileWriting("Book.csv", lineBook);
        }
    }


    // Enter data for Book
    public static void Enterbook() {
        Scanner scannerbook = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        String bookID = scannerbook.nextLine();
        System.out.println("Nhập tên sách: ");
        String bookName = scannerbook.nextLine();

        // Validate book's quantity
        int bookQuantity;
        do {
            System.out.println("Số lượng sách (Vui lòng điền số nguyên dương): ");
            while (!scannerbook.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên dương");
                scannerbook.next();
            }
            bookQuantity = scannerbook.nextInt();
            scannerbook.nextLine();
        } while (bookQuantity <= 0);

        // Validate Book price
        double bookPrice;
        do {
            System.out.println("Đơn giá sách (Vui lòng điền số thực và lớn hơn 0): ");
            while (!scannerbook.hasNextDouble()) {
                System.out.println("Vui lòng nhập số thực");
                scannerbook.next();
            }
            bookPrice = scannerbook.nextDouble();
            scannerbook.nextLine();
        } while (bookPrice <= 0);

        System.out.println("Thuộc danh mục: ");
        String bookCategory = scannerbook.nextLine();
        System.out.println("Nhà xuất bản: ");
        String publishingCompany = scannerbook.nextLine();

        //  Validate Publishing Year
        int publishingYear;
        do {
            System.out.println("Năm xuất bản (Vui lòng điền số nằm trong khoảng 1000 -> 2021): ");
            while (!scannerbook.hasNextInt()) {
                System.out.println("Vui lòng nhập số");
                scannerbook.next();
            }
            publishingYear = scannerbook.nextInt();
            scannerbook.nextLine();
        } while (publishingYear < 1000 || publishingYear > 2021);

        System.out.println("Tác giả: ");
        String bookAuthor = scannerbook.nextLine();

        //  Validate for Publishing Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf);
        sdf.setLenient(false);
        Date publishingDate = null;
        boolean valid;
        do {
            valid = true;
            try {
                System.out.println("Nhập ngày xuất bản theo định dạng dd/MM/yyyy");
                publishingDate = sdf.parse(scannerbook.nextLine());
            } catch (ParseException e) {
                System.out.println("Không hợp lệ!");
                valid = false;
            }
        } while (!valid);

        // Validate Reprint Time
        int reprintTime;
        do {
            System.out.println("Lần tái bản (Vui lòng điền số nguyên dương): ");
            while (!scannerbook.hasNextInt()) {
                System.out.println("Vui lòng nhập số");
                scannerbook.next();
            }
            reprintTime = scannerbook.nextInt();
        } while (reprintTime <= 0);

        Product book = new Book(bookID, bookName, bookQuantity, bookPrice, bookCategory, publishingCompany,
                publishingYear, bookAuthor, publishingDate, reprintTime);
        MainmenuControll mainmenuControll = new MainmenuControll();
        mainmenuControll.addBooks(book);
        FileUtils.FileWriting("Book.csv", book.toString());
    }
}