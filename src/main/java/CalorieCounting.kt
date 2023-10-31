import java.io.*
import java.util.*

class CalorieCounting {

    val elfCalorieTotals = arrayListOf<Int>()
    var currentElfTotal: Int = 0

    @Throws(FileNotFoundException::class)
    fun calculateMaxElfTotals(fileName: String): Int {
        val fileInput = Scanner(File(fileName))
        var maxCal = 0

        while (fileInput.hasNext()) {
            val line = fileInput.nextLine()

            if (!line.equals("")) {
                currentElfTotal += line.toInt()
                if (maxCal < line.toInt()) {
                    maxCal = line.toInt()
                }
            } else {
                currentElfTotal += 0
                elfCalorieTotals.add(currentElfTotal)
                resetCurrentElfTotal(0)
            }
        }

        fileInput.close()
        return maxCal
    }

    private fun resetCurrentElfTotal(resetTo: Int) {
        currentElfTotal = resetTo
    }

    fun findMaxIndex(fileName: String): Int {
        val maxIndex: Int
        val maxCal = calculateMaxElfTotals(fileName)

        maxIndex = elfCalorieTotals.indexOf(maxCal)

        return maxIndex
    }
}
