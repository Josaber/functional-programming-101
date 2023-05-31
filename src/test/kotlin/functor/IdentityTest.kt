package functor

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IdentityTest {
    @Test
    fun `should map value when use identity`() {
        val result = Identity(1)
            .map { x -> x * 2 }
            .map { x -> x - 5 }
        assertEquals(Identity(-3), result)
    }

    @Test
    fun `should flat map value when use identity`() {
        val result = Identity(1)
            .flatMap { x -> Identity(x * 2) }
            .flatMap { x -> Identity(x - 5) }
        assertEquals(Identity(-3), result)
    }
}
