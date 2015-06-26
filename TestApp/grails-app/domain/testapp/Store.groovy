package testapp

class Store 
{
    String storeName
    String address
    String city
    String state
    Integer zipCode
    String phoneNumber
    String itemTypes
    
    static constraints = 
    {
        storeName blank:false, nullable:false, size:3..30, matches:"[a-z A-Z 1-9_]+"
        address blank: false, nullable: false
        city blank: false, nullable: false
        state blank: false, nullable: false
        zipCode blank: false, nullable: false, size: 5..5
        phoneNumber blank: false, nullable: false, matches: '\\d{10}'
        itemTypes blank: false, nullable: false
    }
}
