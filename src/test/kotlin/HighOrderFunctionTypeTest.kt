import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HighOrderFunctionTypeTest {
    @Test
    fun `should multiply values`() {
        val result = CurriedMultiplier().invoke(5).invoke(6)
        assertEquals(30, result)
    }

    @Test
    fun `should multiply 2`() {
        val result = Operate2().invoke { i -> i * 10 }
        assertEquals(20, result)
    }

    @Test
    fun `should plus 2`() {
        val result = Operate2().invoke { i -> i + 10 }
        assertEquals(12, result)
    }
}
