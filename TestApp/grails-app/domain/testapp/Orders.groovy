package testapp

class Orders 
{
    Date datePurchased
    String storeUsed
    String customerName
    String itemPurchased
    Integer orderNumber

    
    static constraints = 
    {
        storeUsed blank: false, nullable: false
        customerName blank: false, nullable: false
        itemPurchased blank: false, nullable: false
        orderNumber blank: false, nullable: false
        datePurchased blank: false, nullable: false, format: 'yyyy-MM-dd'
    }
}
