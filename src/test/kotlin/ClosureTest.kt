import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ClosureTest {
    @Test
    fun `should plus 1 when call accumulator`() {
        val result = Closure.incrementer(1)
        assertEquals(2, result)
    }
}
