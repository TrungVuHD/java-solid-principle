package ocp.example2.wrongway;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agup101 on 4/25/2017.
 */
class ProductFilter {

    public List<Product> byColor(List<Product> products, ProductColor productColor) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.getColor())) {
                productList.add(product);
            }
        }

        return productList;
    }


    public List<Product> byColorAndSize(List<Product> products, ProductColor productColor, ProductSize productSize) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.name()) && product.getSize() == productSize.getSize()) {
                productList.add(product);
            }
        }

        return productList;
    }

    public List<Product> bySize(List<Product> products, ProductSize productSize) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getSize() == productSize.getSize()) {
                productList.add(product);
            }
        }

        return productList;
    }
}
