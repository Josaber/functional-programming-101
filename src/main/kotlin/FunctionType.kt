typealias Operator = (Int, Int) -> Int
// typealias Divide = (Double.(Int) -> Double)?

class Accumulator : Operator {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }
}

class Multiplier : Operator {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 * p2
    }
}

class Divider : (Int, Int) -> Double {
    override fun invoke(p1: Int, p2: Int): Double {
        return p1.toDouble() / p2
    }
}
