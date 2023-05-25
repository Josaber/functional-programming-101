import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionCompositionTest {
    private val functions = listOf(
        { a: Int -> a - 2 },
        { a: Int -> a * 2 },
        { a: Int -> a + 5 },
        { a: Int -> a / 2 },
        { a: Int -> a * a },
    )

    @Test
    fun `should pipe functions`() {
        val function = FunctionComposition.pipe(functions)
        assertEquals(25, function(5))
    }

    @Test
    fun `should compose functions`() {
        val function = FunctionComposition.compose(functions)
        assertEquals(32, function(5))
    }
}
