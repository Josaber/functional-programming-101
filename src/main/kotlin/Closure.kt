class Closure {
    companion object {
        val adder = { a: Int, b: Int -> a + b }

        val incrementer = { a: Int -> adder(a, 1) }
    }
}
