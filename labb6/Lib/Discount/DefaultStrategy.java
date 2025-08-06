package Lib.Discount;
import Lib.*;
public class DefaultStrategy implements DiscountStrategy {
    @Override
    public double calculatedPrice(CartItem item){
        return item.getProduct().getPrice()*item.getQuantity();
    }

    @Override
    public double calculatePrice(CartItem item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    }
    
}
