package Case__Study;

import java.util.ArrayList;
import java.util.List;

public class MainmenuControll {

    private List<Product> Books;
    private List<Product> Things;
    private List<Product> Toys;

    public MainmenuControll() {
        this.Books = new ArrayList<>();
        this.Things = new ArrayList<>();
        this.Toys = new ArrayList<>();
    }
    // anh không chéc, nhưng mà có thể khi gọi lại mainmenu ni, nó reset về array rỗng rồi
    // cục ở trên đó,
// anhohir push em vs dự án mới, em hỏi mấy đứa thử có làm đc đoạn nớ khôngdaj
    // Add products methods
    public void addBooks(Product bookk){
        this.Books.add(bookk);
    }
    public void addThings (Product thingg){
        this.Things.add(thingg);
    }
    public void addDToys (Product toyy){
        this.Toys.add(toyy);
    }
    // Show products methods
    public void showListBook() {
        for (Product showList1 : this.Books) {
            System.out.println("book =========== ");
            System.out.println(showList1.toString());
        }
    }
    public void showListThings() {
        for (Product showList2 : this.Things) {
            System.out.println(showList2);
        }
    }
    public void showListToy(){
        for (Product showList3 : this.Toys) {
            System.out.println(showList3);
        }
    }
    // search products by productsID
    public List<Product> searchProductbyID(String productID) {
        List ProductbyID = new ArrayList<>();
        for (Product product : this.Books) {
            if (product.getMaSanPham().contains(productID)) {
                ProductbyID.add(product);
            }
        }
        for (Product product1 : this.Things) {
            if (product1.getMaSanPham().contains(productID)) {
                ProductbyID.add(product1);
            }
        }
        for (Product product2 : this.Toys) {
            if (product2.getMaSanPham().contains(productID)) {
                ProductbyID.add(product2);
            }
        }
        if (ProductbyID.isEmpty()) {
            System.out.println("Sản phẩm này không tồn tại");
            return new ArrayList<>();
        } else {
            return ProductbyID;
        }
    }
}

