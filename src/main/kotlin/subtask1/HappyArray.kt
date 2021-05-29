package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()) {
            return sadArray
        }
        var isChanged = true
        var happyArray = sadArray.toMutableList()
        var sum: Int
        while (isChanged) {
            for (i in 1 until happyArray.size) {
                isChanged = false
                if (i < happyArray.size - 1) {
                    sum = happyArray[i + 1] + happyArray[i - 1]
                    if (happyArray[i] > sum) {
                        isChanged = true
                        happyArray.removeAt(i)
                        break
                    }
                }

            }
        }
        return happyArray.toIntArray()
    }
    }
