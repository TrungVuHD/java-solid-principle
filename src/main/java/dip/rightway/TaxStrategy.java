package dip.rightway;

/**
 * Created by agup101 on 4/25/2017.
 */
interface TaxStrategy {
    double findTaxAmount(Order order);
}
