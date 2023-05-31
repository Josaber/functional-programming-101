package functor

interface Pointed<T> {
    fun of(value: T): Pointed<T>
}
