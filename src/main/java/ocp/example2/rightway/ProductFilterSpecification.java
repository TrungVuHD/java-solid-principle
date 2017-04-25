package ocp.example2.rightway;

import java.util.List;

/**
 * Created by agup101 on 4/25/2017.
 */
abstract class ProductFilterSpecification {

    public List<Product> Filter(List<Product> products){
        return applyFilter(products);
    }

    protected abstract List<Product> applyFilter(List<Product> products);
}
