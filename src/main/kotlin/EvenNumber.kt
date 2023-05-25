class EvenNumber {
    companion object {
        fun imperativeSum(numbers: List<Int>): Int {
            var sum = 0
            for (i in 0..numbers.size - 1) {
                val value = numbers[i]
                if (value % 2 == 0) {
                    sum += value
                }
            }
            return sum
        }

        fun declarativeSum(numbers: List<Int>) = numbers
            .filter { value -> value % 2 == 0 }
            .sum()

    }
}
