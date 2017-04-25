package dip.rightway;

/**
 * Created by agup101 on 4/25/2017.
 */
class OrderProcessor {

    private DiscountCalculator discountCalculator;
    private TaxStrategy taxStrategy;

    public OrderProcessor(DiscountCalculator discountCalculator, TaxStrategy taxStrategy) {
        this.discountCalculator = discountCalculator;
        this.taxStrategy = taxStrategy;
    }

    public double calculateTotal(Order order){
        double itemTotal = order.getItemTotal();
        double discountAmount = discountCalculator.calculateDiscount(order);
        double taxAmount = taxStrategy.findTaxAmount(order);

        return itemTotal - discountAmount + taxAmount;
    }
}
