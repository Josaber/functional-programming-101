class Memoize<in T, out R>(val function: (T) -> R) : (T) -> R {
    private val values = mutableMapOf<T, R>()
    override fun invoke(x: T): R {
        return values.getOrPut(x) { function(x) }
    }
}

fun <T, R> ((T) -> R).memoize(): (T) -> R = Memoize(this)
