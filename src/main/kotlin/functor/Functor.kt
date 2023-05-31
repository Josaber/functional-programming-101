package functor

interface Functor<T> {
    fun <R> map(function: (T) -> R): Functor<R>
}
