package functor

class Nothing<T>: Monad<T> {
    override fun <R> map(function: (T) -> R): Functor<R> {
        return Nothing()
    }

    override fun <R> flatMap(function: (T) -> R): R? {
        return null
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
