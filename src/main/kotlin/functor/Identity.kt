package functor

class Identity<T>(private val value: T) : Functor<T> {

    override fun <R> map(function: (T) -> R): Functor<R> {
        return Identity(function(value))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Identity<*>

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value?.hashCode() ?: 0
    }
}
