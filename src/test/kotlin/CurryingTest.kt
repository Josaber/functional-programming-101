import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CurryingTest {
    @Test
    fun `should curry the add function`() {
        val curriedAdd = Currying.curry { a: Int, b: Int -> a + b }
        val result = curriedAdd(1)(2)
        assertEquals(3, result)
    }

    @Test
    fun `should curry the multiply function`() {
        val curriedMultiply = Currying.curry { a: Int, b: Int, c: Int -> a * b * c }
        val result = curriedMultiply(1)(2)(3)
        assertEquals(6, result)
    }
}
