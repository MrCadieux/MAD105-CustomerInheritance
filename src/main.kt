fun main() {

    var choice: Int

    // Loop for Menu Options
    do{
        println("Please choose from the following")
        println("1: Residential Customer")
        println("2: Commercial Customer")
        println("3: Done")
        print("Your Choice ------> ")
        choice = readLine()!!.toInt()

        when(choice){
            1 -> residential()
            2 -> commercial()
            !in 1..3 -> println("Please enter a number between 1-3")
        }

    }while(choice!=3)

}

//Asks all questions to create the residential customer
fun residential(){
    var name: String
    var phoneNum: String
    var address: String
    var squareFootage: Double
    var senior: String
    var discount: Boolean

    println("Hello Residential Customer! Please enter the following information:")
    print("What is your name: ")
    name = readLine()!!.toString()
    print("What is your phone number: ")
    phoneNum = readLine()!!.toString()
    print("What is your address: ")
    address = readLine()!!.toString()
    print("What is the square footage of your building: ")
    squareFootage = readLine()!!.toDouble()
    print("Are you eligible for a senior discount (Y/N): ")
    senior = readLine()!!.first().toString()
    if (senior.equals("Y", ignoreCase = true)){
        discount = true
    }
    else{
        discount = false
    }

    var customer1 = Residential(discount, name, phoneNum, address, squareFootage)
    customer1.weeklyCharges()

}

//Asks all questions to create the commercial customer
fun commercial(){
    var name: String
    var phoneNum: String
    var address: String
    var squareFootage: Double
    var propertyName: String
    var multi: String
    var discount: Boolean

    println("Hello Commercial Customer! Please enter the following information:")
    print("What is your name: ")
    name = readLine()!!.toString()
    print("What is your phone number: ")
    phoneNum = readLine()!!.toString()
    print("What is your address: ")
    address = readLine()!!.toString()
    print("What is the property name: ")
    propertyName = readLine()!!.toString()
    print("What is the square footage of your building: ")
    squareFootage = readLine()!!.toDouble()
    print("Are you eligible for a multiple property discount (Y/N): ")
    multi = readLine()!!.first().toString()
    if (multi.equals("Y", ignoreCase = true)){
        discount = true
    }
    else{
        discount = false
    }

    var customer2 = Commercial(propertyName, discount, name, phoneNum, address, squareFootage)
    customer2.weeklyCharges()

}