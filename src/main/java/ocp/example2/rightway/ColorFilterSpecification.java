package ocp.example2.rightway;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agup101 on 4/25/2017.
 */
 class ColorFilterSpecification extends ProductFilterSpecification {

    private ProductColor productColor;

    public ColorFilterSpecification(ProductColor productColor) {
        this.productColor = productColor;
    }

    @Override
    protected List<Product> applyFilter(List<Product> products) {
        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.getColor())) {
                productList.add(product);
            }
        }

        return productList;
    }
}
