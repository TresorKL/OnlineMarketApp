 
package za.ac.tut.item;
 
public class Item implements ItemDataInterface {
    
    String productName;
    int quantity;
    
    public Item() { }

    public Item(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public int amountDue(){
        
        int amountDue=0;
        
        if(getProductName().compareTo("AIRNIKE")==0){
        
            amountDue = getQuantity() * AIRNIKE_PRICE;
        }else if(getProductName().compareTo("JORDAIN")==0){
        
            amountDue = getQuantity() * JORDAIN_PRICE;
            
        }else if(getProductName().compareTo("VERSACE")==0){
        
            amountDue = getQuantity() * VERSACE_PRICE;
        }else if(getProductName().compareTo("BALANCIAGA")==0){
        
            amountDue = getQuantity() * BALANCIAGA_PRICE;
        }
        
        return amountDue;
    }
    
    
}
