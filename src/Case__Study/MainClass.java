package Case__Study;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Book book = new Book();
        SchoolThings schoolThings = new SchoolThings();
        ChildrenToy childrenToy = new ChildrenToy();
        Scanner scanner = new Scanner(System.in);
        MainmenuControll mainmenuControll = new MainmenuControll();

        // Task 3 - Create Files csv
//        FileCreating("Book.csv");
//        FileCreating("SchoolThings.csv");
//        FileCreating("ChildrenToy.csv");
//        FileCreating("Customer.csv");
//        FileCreating("Order.csv");

        // Task 2
        // Set main menu
        while (true) {
            System.out.println("Application Manager Book Store");
            System.out.println("------------------------------");
            System.out.println("Enter 1: Thêm sản phẩm");
            System.out.println("Enter 2: Hiển thị thông tin sản phẩm");
            System.out.println("Enter 3: Tìm kiếm sản phẩm");
            System.out.println("Enter 4: Trở về menu chính");
            System.out.println("Enter 5: Thoát khỏi chương trình");
            String line = scanner.nextLine();
            switch (line) {
                // Set sub menu - add product
                case "1": {
                    System.out.println("Enter a: Thêm sách");
                    System.out.println("Enter b: Thêm đồ dùng học tập");
                    System.out.println("Enter c: Thêm đồ chơi trẻ em");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            book.inputBook();
                            book.addBook();

                            break;
                        }
                        case "b": {
                            schoolThings.inputSchoolThings();
                            schoolThings.addSchoolThings();
                            break;
                        }
                        case "c": {
                            childrenToy.inputChildrenToy();
                            childrenToy.addChildrentoy();
                            break;
                        }
                        default:
                            System.out.println("Truy vấn thêm sản phẩm không hợp lệ");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a1: Hiển thị thông tin sách");
                    System.out.println("Enter b1: Hiển thị thông tin đồ dùng học tập");
                    System.out.println("Enter c1: Hiển thị thông tin đồ chơi trẻ em");
                    String type1 = scanner.nextLine();
                    switch (type1) {
                        case "a1": {
                            book.HienThiThongTin();
                            break;
                        }
                        case "b1": {
                            schoolThings.HienThiThongTin();
                            break;
                        }
                        case "c1": {
                            childrenToy.HienThiThongTin();
                            break;
                        }
                        default:
                            System.out.println("Truy vấn hiển thị thông tin không hợp lệ");
                            break;
                    }
                    break;
                }
                case "3": {
                    System.out.println("Nhập Mã sản phẩm để tìm kiếm: ");
                    String prdID = scanner.nextLine();
                    mainmenuControll.SearchProduct(prdID);

                    break;
                }
                case "4": {
                    System.out.println("Quay về menu chính");
                    continue;
                }
                case "5": {
                    System.out.println("Thoát khỏi chương trình");
                    return;
                }
                default:
                    System.out.println("Thông tin truy vấn menu chính không hợp lệ");
                    continue;
            }
        }
    }
}
