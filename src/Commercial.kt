import java.text.DecimalFormat

class Commercial(propertyName: String,
                 multiProperty: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double):
      Customer(customerName, customerPhone, customerAddress, squareFootage) {
    val RATE: Int = 5
        get() = field
    var propertyName: String = propertyName
        get() = field
        set(value) {
            field = value
        }
    var multiProperty: Boolean = multiProperty
        get() = field
        set(value) {
            field = value
        }

    init {
        println("New Commercial Customer: $customerName")
    }

    fun weeklyCharges(){
        val dollarAmount = DecimalFormat("#,###.##")
        var cost: Double = squareFootage/1000*RATE

        if (multiProperty == true){
            cost -= cost*.10
        }

        var formattedCost = dollarAmount.format(cost)

        //Display information
        println("$customerName\n" +
                "$propertyName\n" +
                "$customerAddress\n" +
                "(${customerPhone.substring(0,3)})-${customerPhone.substring(3,6)}-${customerPhone.substring(6)}")
        println("$squareFootage square feet cost: $$formattedCost per week\n")

    }

}