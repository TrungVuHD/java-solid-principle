package ocp.example2.rightway;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by agup101 on 4/25/2017.
 */
 class ProductFilter {

    public List<Product> filterBy(List<Product> products, ProductFilterSpecification productFilterSpecification){
        return productFilterSpecification.applyFilter(products);
    }

    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();
        filter.filterBy(asList(new Product("red", 2)), new SizeFilterSpecification(ProductSize.MEDIUM));
        filter.filterBy(asList(new Product("red", 2)), new ColorFilterSpecification(ProductColor.RED));
    }
}
