import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PureFunctionTest {
    @Test
    fun `should not change input for pure function`() {
        val integers = ArrayList(listOf(1, 2, 3))
        val resultIntegers = PureFunction.pureSquare(integers)
        assertEquals(listOf(1, 4, 9), resultIntegers)
        assertEquals(listOf(1, 2, 3), integers)
    }

    @Test
    fun `should change input for impure function`() {
        val integers = ArrayList(listOf(1, 2, 3))
        val resultIntegers = PureFunction.impureSquare(integers)
        assertEquals(listOf(1, 4, 9), resultIntegers)
        assertEquals(listOf(1, 4, 9), integers)
    }

    @Test
    fun `should not memoize random value`() {
        val result1 = PureFunction.random(1)
        val result2 = PureFunction.random(1)
        assertNotEquals(result1, result2)
    }

    @Test
    fun `should memoize random value`() {
        val memoizedRandom = { integer: Int -> PureFunction.random(integer) }.memoize()
        val result1 = memoizedRandom(1)
        val result2 = memoizedRandom(1)
        assertEquals(result1, result2)
    }
}
