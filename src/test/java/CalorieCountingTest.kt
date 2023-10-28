import org.junit.Before
import org.junit.Test
import java.util.Scanner
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CalorieCountingTest {

    private lateinit var calorieCounting: CalorieCounting

    @Before
    fun setUp() {
        calorieCounting = CalorieCounting()
    }

    @Test
    fun `should return maximum calories carried by single elf`() {
        //Arrange
        val expected = 22450
        //Act
        val actual = calorieCounting.calculateMaxElfTotals("SumDummyCalories")
        //Assert
        assertEquals(expected, actual)
    }
}
