package testapp
import testapp.Customer
import testapp.Orders

class DashboardController 
{
    def index = 
    {
        def customers = Customer.listOrderByName(order: "asc")
        def order = Orders.list()
                
        [customers:customers, order:order]
    }
}
