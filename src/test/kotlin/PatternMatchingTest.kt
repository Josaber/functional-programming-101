import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PatternMatchingTest {
    @ParameterizedTest
    @CsvSource(
        "LEFT, Left",
        "RIGHT, Right",
        "UP, Other",
        "DOWN, Other",
        "FRONT, Other",
        "BACK, Other"
    )
    fun `should match direction`(direction: Direction, expected: String) {
        val result = PatternMatching.matchDirection(direction)
        assertEquals(expected, result)
    }

    @Test
    fun `should return double`() {
        val type = PatternMatching.matchType(1.23)
        assertEquals("Double", type)
    }

    @Test
    fun `should return string`() {
        val type = PatternMatching.matchType("1.23")
        assertEquals("String", type)
    }

    @Test
    fun `should return unknown`() {
        val type = PatternMatching.matchType(1L)
        assertEquals("Unknown", type)
    }

    @ParameterizedTest
    @CsvSource("1", "2")
    fun `should return 1 or 2`(value: Int) {
        val result = PatternMatching.matchType(value)
        assertEquals("1 or 2", result)
    }

    @ParameterizedTest
    @CsvSource("3", "4", "5")
    fun `should return 3, 4, 5`(value: Int) {
        val result = PatternMatching.matchType(value)
        assertEquals("3, 4, 5", result)
    }

    @ParameterizedTest
    @CsvSource("6")
    fun `should return 6`(value: Int) {
        val result = PatternMatching.matchType(value)
        assertEquals("6", result)
    }

    @ParameterizedTest
    @CsvSource("0", "7", "8")
    fun `should return larger or equal 7 or less or equal 0`(value: Int) {
        val result = PatternMatching.matchType(value)
        assertEquals(">= 7 or <= 0", result)
    }
}
