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
    val num = Pembulatan()
    num.number = 22.5
    num.print()

    val a = 12.8
    print(a.toInt())
}