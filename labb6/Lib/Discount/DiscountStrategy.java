package Lib.Discount;
import Lib.*;
public interface DiscountStrategy {
    double calculatedPrice(CartItem item);

    double calculatePrice(CartItem item);
    
}
