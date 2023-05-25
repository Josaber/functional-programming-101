typealias Operator2 = (Int) -> (Int) -> Int
typealias Operator3 = ((Int) -> (Int)) -> Int

class CurriedMultiplier : Operator2 {
    override fun invoke(p1: Int): (Int) -> Int {
        return { i -> p1 * i }
    }

}

class Operate2 : Operator3 {
    override fun invoke(p1: (Int) -> Int): Int {
        return p1(2)
    }
}
