package testapp

class Items 
{
    Integer catalogNumber
    String itemName
    String description
    Integer price
    String storeName
    
    static constraints = 
    {
        storeName blank: false, nullable: false
        catalogNumber blank: false, nullable: false
        itemName blank: false, nullable: false
        description blank: false
        price blank: false, nullable: false, minSize: 1
        
    }
}
