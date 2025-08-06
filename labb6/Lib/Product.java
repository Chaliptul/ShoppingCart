package Lib;
public final class Product {
    private final String productId;
    private final String productName;
    private final double price;
    private void checkRep(){
        if (productId == null || productId.isEmpty()){
            throw new RuntimeException("RI violated : product");
        }
        if (productName == null || productName.isEmpty()) {
            throw new RuntimeException("RI violated : product");
            
        }
        if (price < 0){
            throw new RuntimeException("RI violated : price");
        }
    }
    public Product(String productId,String productName, Double price ){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        checkRep();
    }
    public String getProductId(){ return productId;}
    public String getProductName(){return productName;}
    public double getPrice(){ return price;}
    
    /**
     * เปรียบเทียบ ญพนกีแะ สองชิ้นโดยใช้ ยพนกีแะณฺ
     * @param obj
     * @return             
     */

    @Override
    public boolean equals (Object obj){
        if(this == obj ) return true;
        if(obj == null || getClass() != obj.getClass());
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
    
    
}
