package functor

class Nothing<T>: Functor<T> {
    override fun <R> map(function: (T) -> R): Functor<R> {
        return Nothing()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
