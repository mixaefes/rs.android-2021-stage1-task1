package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
   //     throw NotImplementedError("Not implemented")
        val resultArray = arrayListOf<String>()
        for (i in inputString.indices) {
            when (inputString[i]) {
                '(' -> resultArray.add(
                    getSubString(
                        inputString.substring(
                            i + 1,
                            inputString.length
                        ), ')', '('
                    )
                )
                '[' -> resultArray.add(
                    getSubString(
                        inputString.substring(
                            i + 1,
                            inputString.length
                        ), ']', '['
                    )
                )
                '<' -> resultArray.add(
                    getSubString(
                        inputString.substring(
                            i + 1,
                            inputString.length
                        ), '>', '<'
                    )
                )
            }
        }
        return resultArray.toTypedArray()
    }

    private fun getSubString(str: String, charClose: Char, charOpen: Char): String {
        var myString: String = ""
        var isOpenChar: Boolean = false
        for (j in str.indices) {
            if (str[j] == charOpen) {
                isOpenChar = true
            }
            if (str[j] != charClose) {
                myString += str[j]
            } else if (isOpenChar && str.substring(j).contains(charClose)){
                myString += str[j]
                isOpenChar = false
            }else {
                return myString
            }

        }
        return myString
    }

}

