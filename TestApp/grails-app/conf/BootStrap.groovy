import testapp.Customer
import testapp.Store
import testapp.Orders
import testapp.Items

class BootStrap 
{    
    def dateOne = Date.parse("yyyy-MM-dd", "1974-04-19")
    def dateTwo = Date.parse("yyyy-MM-dd", "1977-07-22")
    def dateThree = Date.parse("yyyy-MM-dd", "2014-03-19")
    def dateFour = Date.parse("yyyy-MM-dd", "2015-06-18")
    def dateFive = Date.parse("yyyy-MM-dd", "2015-06-19")
    
    def init = 
    { servletContext ->
        
        // new customers
        new Customer(name:"Johhny Doe", address:"123 Fake St", city:"FakeVille", state:"FakePlace", zipCode:"55552", phoneNumber:"1231231234", dateOfBirth:dateOne, email:"thefakest@email.com").save(failOnError: true)
        new Customer(name:"Jane Doe", address:"123 Fake St", city:"FakeVille", state:"FakePlace", zipCode:"55552", phoneNumber:"1231231234", dateOfBirth:dateTwo, email:"thefakestjane@email.com").save(failOnError: true)
        
        // new Stores
        new Store(storeName:"VtW Books", address:"321 Fake Ave", city:"FakeVille", state:"FakePlace", zipCode:"55554", phoneNumber:"3331112242", itemTypes:"Books and Accessories").save(failOnError: true)
        new Store(storeName:"Fake Party Supplies", address:"441 Fake Ave", city:"Fake Town", state:"FakePlace", zipCode:"55224", phoneNumber:"1112233345", itemTypes:"Party Supplies and Catering").save(failOnError: true)
        
        // new Orders
        new Orders(storeUsed:"VtW Books", customerName:"Jane Doe", itemPurchased:"A Guide to Grails", orderNumber:"101", datePurchased:dateThree).save(failOnError: true)
        new Orders(storeUsed:"Fake Party Supplies", customerName:"Johnny Doe", itemPurchased:"99 Red Balloons", orderNumber:"52", datePurchased:dateFour).save(failOnError: true)
        new Orders(storeUsed:"Fake Party Supplies", customerName:"Jane Doe", itemPurchased:"Helium Tank (Small)", orderNumber:"54", datePurchased:dateFive).save(failOnError: true)
        
        // new Items
        new Items(catalogNumber:"22", itemName:"99 Red Balloons", description:"99 party ready Red Balloons, the perfect amount of a great celebration.", price:"25", storeName:"Fake Party Supplies").save(failOnError: true)
        new Items(catalogNumber:"13", itemName:"Helium Tank (Small)", description:"A small tank of Helium for use on our many balloons!", price:"34", storeName:"Fake Party Supplies").save(failOnError: true)
        new Items(catalogNumber:"4412", itemName:"A Guide to Grails", description:"A great book that I could really use right now!", price:"44", storeName:"VtW Books").save(failOnError: true)
    }
    
    def destroy = {
    }
}
