import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvenNumberTest {
    @Test
    fun `should sum all the even numbers via imperative way`() {
        assertEquals(6, EvenNumber.imperativeSum(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `should sum all the even numbers via declarative way`() {
        assertEquals(6, EvenNumber.declarativeSum(listOf(1, 2, 3, 4, 5)))
    }
}
