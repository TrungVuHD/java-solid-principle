package dip.rightway;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by agup101 on 4/25/2017.
 */
@Getter
@AllArgsConstructor
class Order {
    private double itemTotal;
    private String country;
}
