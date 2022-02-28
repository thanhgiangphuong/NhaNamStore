package Case__Study;

import java.util.Scanner;

public class MainMenuControll {
    public static void main(String[] args) {
        Book book = new Book();
        SchoolThings schoolThings = new SchoolThings();
        ChildrenToy childrenToy = new ChildrenToy();
        Customer customer = new Customer();
        Category category = new Category();
        Scanner scanner = new Scanner(System.in);
        GeneralMethod generalMethod = new GeneralMethod();
        FileUtils fileUtils = new FileUtils();

        // Task 3 - Create Files csv
//        FileCreating("Book.csv");
//        FileCreating("SchoolThings.csv");
//        FileCreating("ChildrenToy.csv");
//        FileCreating("Customer.csv");
//        FileCreating("Order.csv");

        // Task 2 - 3
        // Set main menu
        while (true) {
            System.out.println("Application Manager Book Store");
            System.out.println("------------------------------");
            System.out.println("Enter 1: Thêm sản phẩm");
            System.out.println("Enter 2: Thêm đơn hàng");
            System.out.println("Enter 3: Hiển thị thông tin sản phẩm");
            System.out.println("Enter 4: Hiển thị đơn hàng");
            System.out.println("Enter 5: Tìm kiếm sản phẩm");
            System.out.println("Enter 6: Trở về menu chính");
            System.out.println("Enter 7: Thoát khỏi chương trình");
            String line = scanner.nextLine();
            switch (line) {
                // Set sub menu - add product
                case "1": {
                    System.out.println("Enter 1.1: Thêm sách");
                    System.out.println("Enter 1.2: Thêm đồ dùng học tập");
                    System.out.println("Enter 1.3: Thêm đồ chơi trẻ em");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1.1": {
                            book.inputBook();
                            book.addBook();
                            break;
                        }
                        case "1.2": {
                            schoolThings.inputSchoolThings();
                            schoolThings.addSchoolThings();
                            break;
                        }
                        case "1.3": {
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
                // Set sub menu - add customer/order
                case "2": {
                    System.out.println("Enter 2.1: Thêm thông tin khách hàng");
                    System.out.println("Enter 2.2: Thêm thông tin đơn hàng");

                    String type1 = scanner.nextLine();
                    switch (type1) {
                        case "2.1": {
                            customer.inputCustomer();
                            customer.addCustomer();
                            break;
                        }
                        case "2.2": {
                            break;
                        }
                        default:
                            System.out.println("Truy vấn thêm khách hàng và đơn hàng không hợp lệ");
                            break;
                    }
                    break;
                }
                // Set sub menu - show product
                case "3": {
                    System.out.println("Enter 3.1: Hiển thị tất cả sản phẩm sách");
                    System.out.println("Enter 3.2: Hiển thị tất cả sản phẩm đồ dùng học tập");
                    System.out.println("Enter 3.3: Hiển thị tất cả sản phẩm đồ chơi trẻ em");
                    System.out.println("Enter 3.4: Hiển thị tất cả tất cả sản phẩm trong nhà sách");

                    String type2 = scanner.nextLine();
                    switch (type2) {
                        case "3.1": {
                            book.HienThiThongTin();
                            break;
                        }
                        case "3.2": {
                            schoolThings.HienThiThongTin();
                            break;
                        }
                        case "3.3": {
                            childrenToy.HienThiThongTin();
                            break;
                        }
                        case "3.4": {
                            book.HienThiThongTin();
                            schoolThings.HienThiThongTin();
                            childrenToy.HienThiThongTin();
                            break;
                        }
                        default:
                            System.out.println("Truy vấn hiển thị thông tin không hợp lệ");
                            break;
                    }
                    break;
                }
                case "4": {
                    break;
                }
                // Set sub menu - Searching
                case "5": {
                    System.out.println("Enter 5.1: Tìm kiếm thông tin sản phẩm theo mã sản phẩm");
                    System.out.println("Enter 5.2: Tìm kiếm thông tin đơn hàng theo mã khách hàng");
                    String type2 = scanner.nextLine();
                    switch (type2) {
                        case "5.1": {
                            generalMethod.SearchingandShow();
                            break;
                        }
                        case "5.2": {
                            break;
                        }
                        default:
                            System.out.println("Truy vấn tìm kiếm không hợp lệ");
                            continue;
                    }
                    break;
                }
                case "6": {
                    System.out.println("Quay về menu chính");
                    continue;

                }
                case "7": {
                    System.out.println("Tạm biệt!");
                    return;
                }
                default:
                    System.out.println("Thông tin truy vấn menu chính không hợp lệ");
                    continue;
            }
        }
    }
}
