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

    // Setter - Getter
    public String getMaDanhMuc() {
        return MaDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        MaDanhMuc = maDanhMuc;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Book getDanhMucBook() {
        return DanhMucBook;
    }

    public void setDanhMucBook(Book danhMucBook) {
        DanhMucBook = danhMucBook;
    }

    public ChildrenToy getDanhMucDoChoi() {
        return DanhMucDoChoi;
    }

    public void setDanhMucDoChoi(ChildrenToy danhMucDoChoi) {
        DanhMucDoChoi = danhMucDoChoi;
    }

    public SchoolThings getDanhMucDoDung() {
        return DanhMucDoDung;
    }

    public void setDanhMucDoDung(SchoolThings danhMucDoDung) {
        DanhMucDoDung = danhMucDoDung;
    }
}
