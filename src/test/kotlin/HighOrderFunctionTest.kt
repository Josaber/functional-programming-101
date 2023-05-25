import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HighOrderFunctionTest {
    @Test
    fun `should pass function as the parameter`() {
        val accumulator = Accumulator()
        val result = HighOrderFunction.operate(accumulator, 1, 2)
        assertEquals(3, result)
    }

    @Test
    fun `should pass code block as the parameter`() {
        val result = HighOrderFunction.operate({ a, b -> a + b }, 1, 2)
        assertEquals(3, result)
    }

    @Test
    fun `should get accumulator`() {
        val operator = HighOrderFunction.getOperator(true)
        val result = operator(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun `should get multiplier`() {
        val operator = HighOrderFunction.getOperator(false)
        val result = operator(1, 2)
        assertEquals(2, result)
    }
}
