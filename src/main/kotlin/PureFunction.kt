class PureFunction {
    companion object {
        fun pureSquare(integers: ArrayList<Int>) = integers.map { integer -> integer * integer }

        fun impureSquare(integers: ArrayList<Int>): List<Int> {
            for (i in integers.indices) {
                integers[i] = integers[i] * integers[i]
            }
            return integers
        }

        fun random(integer: Int) = Math.random() * integer
    }
}
