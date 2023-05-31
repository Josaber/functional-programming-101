package functor

class Maybe<T>(private val value: T?) : Functor<T> {
    override fun <R> map(function: (T) -> R): Functor<R> {
        return if (value == null) Nothing() else Just(function(value))
    }
}
