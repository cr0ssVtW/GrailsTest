package testapp

class Customer 
{
    String name
    String address
    String city
    String state
    Integer zipCode
    String phoneNumber
    Date dateOfBirth
    String email
    
    static constraints = 
    {
        name blank:false, nullable:false, size:3..30, matches:"[a-z A-Z 1-9_]+"
        phoneNumber blank: false, nullable: false, matches: '\\d{10}'
        address blank: false, nullable: false
        city blank: false, nullable: false
        state blank: false, nullable: false
        zipCode blank: false, nullable: false, size: 5..5
        email blank: false, nullable: false, email: true
        dateOfBirth blank: false, nullable: false, format: 'yyyy-MM-dd'
    }
    
    
}
