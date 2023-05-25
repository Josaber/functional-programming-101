import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionTypeTest {
    @Test
    fun `should plus numbers using accumulator`() {
        val accumulator = Accumulator()
        assertEquals(3, accumulator.invoke(1, 2))
    }

    @Test
    fun `should multiply numbers using multiplier`() {
        val multiplier = Multiplier()
        assertEquals(2, multiplier(1, 2))
    }

    @Test
    fun `should divide numbers using divider`() {
        val divider = Divider()
        assertEquals(0.5, divider.invoke(1, 2))
    }
}
