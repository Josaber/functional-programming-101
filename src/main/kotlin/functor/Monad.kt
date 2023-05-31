package functor

interface Monad<T> : Functor<T> {
    fun <R> flatMap(function: (T) -> R): R?
}
