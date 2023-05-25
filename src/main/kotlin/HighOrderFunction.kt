class HighOrderFunction {
    companion object {
        fun operate(operator: Operator, a: Int, b: Int) = operator(a, b)

        fun getOperator(isAddOperation: Boolean) = if (isAddOperation) Accumulator() else Multiplier()
    }
}
