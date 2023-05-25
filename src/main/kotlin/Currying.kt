class Currying {
    companion object {
        fun <A, B, C> curry(function: (A, B) -> C): (A) -> (B) -> C {
            return fun(a: A): (B) -> C {
                return fun(b: B): C {
                    return function(a, b)
                }
            }
        }

        fun <A, B, C, D> curry(function: (A, B, C) -> D): (A) -> (B) -> (C) -> D {
            return fun(a: A): (B) -> (C) -> D {
                return fun(b: B): (C) -> D {
                    return fun(c: C): D {
                        return function(a, b, c)
                    }
                }
            }
        }
    }
}
