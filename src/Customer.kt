open class Customer(customerName: String,
               customerPhone: String,
               customerAddress: String,
               squareFootage: Double){
    var customerName: String = customerName
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = customerPhone
        get() = field
        set(value) {
            field = value
        }
    var customerAddress: String = customerAddress
        get() = field
        set(value) {
            field = value
        }
    var squareFootage: Double = squareFootage
        get() = field
        set(value) {
            field = value
        }

    init {
        println("Customer $customerName Added")
    }


}