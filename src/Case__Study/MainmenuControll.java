package Case__Study;

import java.util.List;
import java.util.Scanner;

public class MainmenuControll {

    public static final String comma = ",";

    public static void SearchingandShow() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập Mã sản phẩm để tìm kiếm: ");
        String ProductID = scn.nextLine();
        // Create a list to get the book information from file
        try {
            List<String> listBook = FileUtils.FileReader("Book.csv");
            // Use for loop to iterate over the elements
            for (int i = 0; i < listBook.size(); i++) {
                // split() method: Use to break a string with the regular expression
                String[] splLine = listBook.get(i).split(",");
                // Create a new object and separate the elements to compare
                Book book = new Book(splLine[0], splLine[1], Integer.parseInt(splLine[2]),
                        Double.parseDouble(splLine[3]), splLine[4], splLine[5],
                        Integer.parseInt(splLine[6]), splLine[7],splLine[8], Integer.parseInt(splLine[9]));
                // Compare by ID and show the record has the same ID
                if (book.getMaSanPham().equals(ProductID)) {
                    System.out.println("Đây là sản phẩm sách: ");
                    System.out.println(book.getMaSanPham() + comma + book.getTenSanPham() + comma
                            + book.getSoLuong() + comma + book.getDonGia() + comma + book.getThuocDanhMuc() + comma
                            + book.getNhaXuatBan() + comma + book.getNamXuatBan() + comma
                            + book.getNgayXuatBan() + comma + book.getLanTaiBan());
                }
            }
            List<String> listThings = FileUtils.FileReader("SchoolThings.csv");
            for (int j = 0; j < listThings.size(); j++) {
                String[] splLine1 = listBook.get(j).split(",");

                SchoolThings schoolThings = new SchoolThings(splLine1[0], splLine1[1], Integer.parseInt(splLine1[2]),
                        Double.parseDouble(splLine1[3]), splLine1[4], splLine1[5], splLine1[6], splLine1[7],
                        splLine1[8], splLine1[9], splLine1[10], Double.parseDouble(splLine1[11]));

                if (schoolThings.getMaSanPham().equals(ProductID)) {
                    System.out.println("Đây là sản phẩm đồ dùng học tập: ");
                    System.out.println(schoolThings.getMaSanPham() + comma + schoolThings.getTenSanPham()
                            + comma + schoolThings.getSoLuong() + comma + schoolThings.getDonGia()
                            + comma + schoolThings.getThuocDanhMuc() + comma + schoolThings.getXuatXu()
                            + comma + schoolThings.getThuongHieu() + comma + schoolThings.getNhaCungCap()
                            + comma + schoolThings.getHuongDanSuDung() + comma + schoolThings.getMauSac()
                            + comma + schoolThings.getChatLieu() + comma + schoolThings.getKichThuoc());
                }
            }
            List<String> listToy = FileUtils.FileReader("SchoolThings.csv");
            for (int f = 0; f < listThings.size(); f++) {
                String[] splLine1 = listBook.get(f).split(",");

                ChildrenToy childrenToy = new ChildrenToy(splLine1[0], splLine1[1],
                        Integer.parseInt(splLine1[2]), Double.parseDouble(splLine1[3]),
                        splLine1[4], splLine1[5], splLine1[6], splLine1[7], splLine1[8]);

                if (childrenToy.getMaSanPham().equals(ProductID)) {
                    System.out.println("Đây là sản phẩm đồ chơi trẻ em");
                    System.out.println(childrenToy.getMaSanPham() + comma + childrenToy.getTenSanPham()
                            + comma + childrenToy.getSoLuong() + comma + childrenToy.getDonGia()
                            + comma + childrenToy.getThuocDanhMuc() + comma + childrenToy.getDcXuatXu()
                            + comma + childrenToy.getDcThuongHieu() + comma + childrenToy.getDcNhaCungCap()
                            + comma + childrenToy.getDcHuongDanSuDung());
                }
            }

        } catch (Exception e) {
            System.out.println("Sản phẩm này không tồn tại");
        }
    }
}



