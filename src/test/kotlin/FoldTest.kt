import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FoldTest {
    @Test
    fun `should sum the values array`() {
        val items = listOf(1, 2, 3, 4, 5)
        val sum = items.fold(0) { acc: Int, i: Int -> acc + i }
        assertEquals(15, sum)
    }

    @Test
    fun `should multiply the values array`() {
        val items = listOf(1, 2, 3, 4, 5)
        val result = items.fold(1, Int::times)
        assertEquals(120, result)
    }

    @Test
    fun `should reduce the values array`() {
        val items = listOf(1, 2, 3, 4, 5)
        val result = items.fold("Items:") { acc: String, i: Int -> "$acc $i" }
        assertEquals("Items: 1 2 3 4 5", result)
    }
}
