class FunctionComposition {
    companion object {
        fun <T> pipe(functions: List<(T) -> T>): (T) -> T {
            return { p: T ->
                functions.fold(
                    p
                ) { a, f -> f(a) }
            }
        }

        fun <T> compose(functions: List<(T) -> T>): (T) -> T {
            return pipe(functions.reversed())
        }
    }
}
