import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionApplyTest {
    @Test
    fun `should curry the add function`() {
        val curriedAdd = FunctionApply.curry { a: Int, b: Int -> a + b }
        val result = curriedAdd(1)(2)
        assertEquals(3, result)
    }

    @Test
    fun `should curry the multiply function`() {
        val curriedMultiply = FunctionApply.curry { a: Int, b: Int, c: Int -> a * b * c }
        val result = curriedMultiply(1)(2)(3)
        assertEquals(6, result)
    }

    @Test
    fun `should partial apply the multiply function`() {
        val appliedMultiply = FunctionApply.partialApply { a: Int, b: Int, c: Int -> a * b * c }
        val result = appliedMultiply(1, 2)(3)
        assertEquals(6, result)
    }
}
