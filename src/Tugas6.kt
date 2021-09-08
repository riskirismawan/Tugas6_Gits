class Pembulatan {
    var number = 12.3

    get() = field

    set(value) {
        field = if (value - value.toInt() < 0.5) {
            value
        } else {
            value+1
        }
    }

    fun print() {
        println(number.toInt())
    }
}

fun main() {
    val num1 = Pembulatan()
    num1.number = 22.5
    num1.print()

    val num2 = Pembulatan()
    num2.number = 42.3
    num2.print()

    val a = 12.8
    print(a.toInt())
}