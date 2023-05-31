package functor

class Just<T>(private val value: T) : Monad<T> {
    override fun <R> map(function: (T) -> R): Functor<R> {
        return Just(function(value))
    }

    override fun <R> flatMap(function: (T) -> R): R {
        return function(value)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Just<*>

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value?.hashCode() ?: 0
    }
}
