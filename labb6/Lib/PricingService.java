package Lib;
import Lib.Discount.*;
import java.util.ArrayList;

public class PricingService {
    private record StrategyRule(String sku, DiscountStrategy strategy) {
        return null;}
    private final ArrayList<StrategyRule> strategies = new ArrayList<>();
    private final DiscountStrategy defaulStrategy = new DefaultStrategy();

    public void addStrategy(String sku, DiscountStrategy strategy){
        StrategyRule ruleToRemove = null;
        for (StrategyRule rule : strategies ){
            if(rule.sku().equals(sku)){
                ruleToRemove = rule;
                break;
            }

        }
        if(ruleToRemove != null){
            strategies.remove(ruleToRemove);
        }
        strategies.add(new StrategyRule(sku, strategy));
    }
    public double calculatedPrice(CartItem item){
        String sku = item.getProduct().getProductId();
        for(StrategyRule rule : strategies ){
            if(rule.sku().equals(sku)){
                return rule.strategy().calculatedPrice(item);
            }
        }
        return defaulStrategy.calculatePrice(item);
    }
    public double calculateItemPrice(CartItem item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateItemPrice'");
    }
    
}