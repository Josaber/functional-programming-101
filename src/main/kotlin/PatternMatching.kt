class PatternMatching {
    companion object {
        fun matchDirection(direction: Direction): String {
            return when (direction) {
                Direction.LEFT -> "Left"
                Direction.RIGHT -> "Right"
                else -> "Other"
            }
        }

        fun matchType(obj: Any): String {
            return when (obj) {
                is Int -> matchInteger(obj)
                is Double -> "Double"
                is String -> "String"
                else -> "Unknown"
            }
        }

        private fun matchInteger(integer: Int): String {
            return when (integer) {
                1, 2 -> "1 or 2"
                in 3..5 -> "3, 4, 5"
                in 6 until 7 -> "6"
                else -> ">= 7 or <= 0"
            }
        }
    }
}
