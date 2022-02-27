package Case__Study;

public class Category {
    // Create properties
    String MaDanhMuc;
    String Loai;
    String MoTa;
    Book DanhMucBook = new Book();
    ChildrenToy DanhMucDoChoi = new ChildrenToy();
    SchoolThings DanhMucDoDung = new SchoolThings();

    // No-arg Constructor
    public Category() {
    }

    // Parameterized Constructor
    public Category(String maDanhMuc, String loai, String moTa, Book danhMucBook,
                    ChildrenToy danhMucDoChoi, SchoolThings danhMucDoDung) {
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

    public Book getDanhMucBook() {
        return DanhMucBook;
    }

    public ChildrenToy getDanhMucDoChoi() {
        return DanhMucDoChoi;
    }

    public SchoolThings getDanhMucDoDung() {
        return DanhMucDoDung;
    }

}
