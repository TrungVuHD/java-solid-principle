package srp.example2.rightway;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;

/**
 * Created by agup101 on 4/25/2017.
 */
class Customer {

    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public BigDecimal getAvailableFunds(){
        return account.getAvailableFunds();
    }

    public void deductFromBalanceBy(BigDecimal amountToDeduct){
        account.deductFromBalanceBy(amountToDeduct);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}