package ocp.example2.rightway;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agup101 on 4/25/2017.
 */
 class SizeFilterSpecification extends ProductFilterSpecification {

    private ProductSize productSize;

    public SizeFilterSpecification(ProductSize productSize) {
        this.productSize = productSize;
    }

    @Override
    protected List<Product> applyFilter(List<Product> products) {
        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getSize() == productSize.getSize()) {
                productList.add(product);
            }
        }

        return productList;
    }
}
