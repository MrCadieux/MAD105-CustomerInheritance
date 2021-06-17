import java.text.DecimalFormat
/**
 * @author Jeff Cadieux
 * date: 6/17/21
 * @param
 * senior - senior Residential customers get 10% off
 * RATE - residential customers pay $6 per 1000 sq ft
 * customerName - Name of customer
 * customerPhone - Phone number of customer
 * customerAddress - Address of customer
 * squareFootage - Square footage of customer's building
 *
 * Mods
 *
 */
class Residential(senior: Boolean,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage){

        var senior: Boolean = senior
            get() = field
            set(value) {
                field = value
            }
        val RATE: Int = 6
            get() = field

    init {
        println("New Residential Customer: $customerName")
    }

    fun weeklyCharges(){
        val dollarAmount = DecimalFormat("#,###.00")
        var cost: Double = squareFootage/1000*RATE

        if (senior == true){
            cost -= cost*.15
        }

        var formattedCost = dollarAmount.format(cost)

        //Display information
        println("$customerName\n" +
                "$customerAddress\n" +
                "(${customerPhone.substring(0,3)})-${customerPhone.substring(3,6)}-${customerPhone.substring(6)}")
        println("$squareFootage square feet cost: $$formattedCost per week\n")

    }
}