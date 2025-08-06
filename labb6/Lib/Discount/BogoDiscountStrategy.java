package Lib.Discount;
import Lib.*;
public class BogoDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculatedPrice(CartItem item){
        int quantity = item.getQuantity();
        double price = item.getProduct().getPrice();
        int quantityToPay = (quantity / 2 ) + (quantity % 2);
        return price * quantityToPay;
    }

    @Override
    public double calculatePrice(CartItem item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    }
    
}
