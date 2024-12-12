package org.example

fun main() {
    print("\n")
    WelcomeScreen(to = "Layanan Paket",
        user = "Rahma Suci Wulandari",
        city = "Gresik")
    print("\n\n")
    longName("Rahma")
    longName("Rahma", "Suci")
    longName("Rahma", "Suci", "Wulandari")
    print("\n\n")
    callMe("Rahma", "Suci", "Wulandari")
    print("\n\n")
    mySelf()
    print("\n\n")
    paypay()
    print("\n\n")
    Hitung()
    print("\n\n")
    Country()
    print("\n\n")
    arrayy()
    print("\n\n")
    arrayy2()
    print("\n\n")
    tipedata()
    print("\n\n")
    Operator()
    print("\n\n")
    Operator2()
    print("\n\n")
    im()
    print("\n\n")
    myString()
    print("\n\n")
    Nama()
    print("\n\n")
    alfa()
    print("\n\n")
    campus()
}


fun WelcomeScreen(
    to: String,
    user: String,
    city: String
) {
    val coming = """
    Welcome to $to kami 
    $user, 
    di kota $city
    """.trimIndent()
    print(coming)
}

fun longName(
    firstName: String,
    midName: String = "",
    lastName: String = "") {
    println("Hello $firstName $midName $lastName")

}

fun callMe(
    firstName: String,
    midName: String,
    lastName: String)
{
    println("Hello $firstName $midName $lastName")
}


fun mySelf() {
    var bio="""
    Hello guys
    My Name is Rahma Suci Wulandari
    but, u can call me cici
    i'm studying android mobile development
    at Invinite learning
    """.trimIndent()
    println(bio)

}

fun paypay() {
    var payment: String? = null
    var status = "scroll"
    status = "buying"

    if (status.equals("buying")) {
        payment = "Product berhasil dibeli"
    }

    print (payment)
}


fun Hitung() {
    val score = 49

    if (score == 100) {
        print("You Excellent!")

    }else if (score <= 99 && score >=50) {
        print ("Please try again!" )

    } else {
        print ("You bad")

    }
}

fun Country() {
    val country = "Indonesia country"
    val uniq = "many culture"

    print("We are live in $country and we have $uniq")
}

fun arrayy() {
    val charArray = charArrayOf('S', 'U', 'C', 'I')

    charArray[0] = 'U'
    print(charArray[0])

}



fun arrayy2() {
    val x = arrayOf<String>("class 1", "class 2","class 3")

    println(x[0])
    println(x.get(1))
    println(x.get(2))
    println("-----+++-----")


    x[0] = "kelas satu"
    x.set(1, "kelas dua")

    println(x[0])
    println(x.get(1))
    println(x.get(2))
    println("-----+++-----")
}


fun tipedata() {
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004L
    val s: Short = 10
    val b: Byte = Byte.MAX_VALUE
    val c = a + d; val c2 = f + d; val c3 = l + s; val c4 = a + b

    println("Int Value is " + a)
    println("Double value is " + d)
    println("Float value is " + f)
    println("Long value is " + l)
    println("Short value is " + s)
    println("Byte value is " + b)

    println ("\nint + Double is $c ")
    println ("float + Double is $c2 ")
    println ("long + short is $c3 ")
    println ("int + byte is $c4 ")

}


fun Operator() {
    var x: Int = 60
    var y: Int = 30

    println("x > y = " + (x > y))
    println("x < y = " + (x < y))
    println("x >= y = " + (x >= y))
    println("x <= y = " + (x <= y))
    println("x == y = " + (x == y))
    println("x != y = " + (x != y))

    x=25
    println("------+++-------")
    println("x > y = " + (x > y))
    println("x < y = " + (x < y))
    println("x >= y = " + (x >= y))
    println("x <= y = " + (x <= y))
    println("x == y = " + (x == y))
    println("x != y = " + (x != y))

}

fun Operator2() {
    var x = true
    var y = false

    println("x && y =" + (x && y)) // -> false
    println("x || y =" + (x || y)) // -> true
    println("!y = " + (!y)) // -> true

    if(x && y is Boolean){
        if (x && y == true){
            print("\nbetul betul betul")
        }else if(x || y == true){
            print("\nbetuwl betuwl betuwl")
        }else{
            print("\nhumm apelah kau ni, \nitupun tak tau")
        }
    }
}


fun im() {
    val Mystatement =""" 
    I'm Suci
    I'm Studying kotlin language
    In Infinite Learning 
    With Kampus Merdeka
    """.trimIndent()


    print(Mystatement)
}


fun myString() {
    val stringText = "I'm so exited \nto learning with Kampus Merdeka \nby \"Infinite Learning\""

    println(stringText)
}

fun Nama() {
    val myName = "Rahma Suci Wulandari"
    val firstChar = myName[0]

    println("First character of $myName is $firstChar")
}

fun alfa() {
    var alfabet = 'S'

    println("alfabet " + alfabet++)
    println("alfabet " + alfabet++)
    println("alfabet " + alfabet++)
    println("\nalfabet " + alfabet--)
    println("alfabet " + alfabet--)
    println("alfabet " + alfabet--)

}

//Menghasilkan Error karena nilai val tidak bisa diubah><
// @Composable
// fun adek() {
//    val myBrother: String = "Muhammad Fachrudy Ali Fahmi"
//    myBrother = "Fahmi Omy"
//    println(myBrother)
//}


fun campus() {
    var myCampus: String = "Qomaruddin University"
    myCampus = "Qomaruddin Campus"

    println(myCampus)
}