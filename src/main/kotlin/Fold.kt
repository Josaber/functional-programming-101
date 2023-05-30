fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, current: T) -> R
): R {
    // this.reduce
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}
