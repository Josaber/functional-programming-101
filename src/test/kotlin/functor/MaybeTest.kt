package functor

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaybeTest {
    @Test
    fun `should contain value when value is not null`() {
        val result = Maybe(2)
            .map { x -> x * 2 }
            .map { x -> x - 5 }
        assertEquals(Just(-1), result)
    }

    @Test
    fun `should not contain value when value is null`() {
        val result = Maybe(null).map { x: Int -> x * 2 }
        assertEquals(Nothing<Int>(), result)
    }

    @Test
    fun `should not flat map value when value is null`() {
        val result = Maybe(null).flatMap { x: Int -> Maybe(x * 2) }
        assertEquals(null, result)
    }
}
