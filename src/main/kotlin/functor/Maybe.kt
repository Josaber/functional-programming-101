package functor

class Maybe<T>(private val value: T?) : Monad<T> {
    override fun <R> map(function: (T) -> R): Functor<R> {
        return if (value == null) Nothing() else Just(function(value))
    }

    override fun <R> flatMap(function: (T) -> R): R? {
        return if (value == null) null else function(value)
    }
}
