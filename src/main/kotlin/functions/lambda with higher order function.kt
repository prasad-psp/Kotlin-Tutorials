fun main() {
    highOrder(20, 30, 40, { num1: Int, num2: Int, num3: Int -> (num1 + num2 + num3) / 3 })
}

fun highOrder(num1: Int, num2: Int, num3: Int, passFun: (Int, Int, Int) -> Int) {
    print(passFun(num1, num2, num3))
}