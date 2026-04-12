package org.example.froend;

import org.example.backend.controller.ManufacturerController;
import org.example.backend.controller.ProductController;
import org.example.entity.Category;
import org.example.entity.Manufacturer;
import org.example.entity.Product;
import org.example.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

public class Funcion {


    public void findManufacturerById() throws SQLException {
        ManufacturerController controller =new ManufacturerController();
        System.out.println("Nhập Id nhà sản xuất: ");
        int id= ScannerUtils.nextInt();
        Manufacturer manufacturer=controller.getById(id);
        if(manufacturer !=null){
            System.out.println("\n+----------------------+");
            System.out.printf("| %-5s | %-12s |\n", "ID", "NAME");
            System.out.println("+----------------------+");
            System.out.printf("| %-5d | %-12s |\n",
                    manufacturer.getId(),
                    manufacturer.getManufacturerName());
            System.out.println("+----------------------+");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    public void showAllProduct(){
        ProductController productController=new ProductController();
        List<Product> list=productController.getAll();
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-5s | %-30s | %-12s | %-30s | %-6s | %-20s |\n",
                "ID", "NAME", "PRICE", "DESCRIPTION", "RATE", "MANUFACTURER");
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");

        for (Product p : list) {
            System.out.printf("| %-5d | %-30.30s | %-12.0f | %-30.30s | %-6.1f | %-20.20s |\n",
                    p.getId(),
                    p.getProductName(),
                    p.getPrice(),
                    p.getDescription(),
                    p.getRate(),
                    p.getManufacturer().getManufacturerName());
        }

        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
    }

    public void deleteById(){
        ProductController productController=new ProductController();
        System.out.println("Nhập Id cần xóa: ");
        int id=ScannerUtils.nextNonNegativeInt();
        boolean result= productController.deleteById(id);
        if (!result){
            System.out.println("Xóa Thất bại");
        }else {
            System.out.println("Xóa Thành Công");
        }

    }

    public void addProduct(){
        ProductController productController=new ProductController();
        System.out.println("Tên Sản Phẩm: ");
        String name=ScannerUtils.nextString();
        System.out.println("Giá: ");
        double price=ScannerUtils.nextDouble();
        System.out.println("Mô tả: ");
        String desc=ScannerUtils.nextString();
        System.out.println("Rate: ");
        double rate=ScannerUtils.nextDouble();
        System.out.println("Category ID: ");
        int cateID=ScannerUtils.nextInt();
        System.out.println("Manufacturer ID:");
        int manuID=ScannerUtils.nextInt();

        Category category=new Category();
        category.setId(cateID);
        Manufacturer manufacturer=new Manufacturer();
        manufacturer.setId(manuID);
        Product product=new Product();
        product.setProductName(name);
        product.setPrice(price);
        product.setDescription(desc);
        product.setRate(rate);
        product.setCategory(category);
        product.setManufacturer(manufacturer);
        productController.addProduct(product);
    }

    public void checkmail(){
        System.out.println("Nhập Mail: ");
        String mail=ScannerUtils.nextEmail();
        System.out.println("Email hợp lệ: "+mail);
    }
}

