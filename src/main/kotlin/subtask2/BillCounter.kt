package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
  //      throw NotImplementedError("Not implemented")
        return when (bill.sum() - bill[k]) {
            b*2 -> "Bon Appetit"
            else -> b.minus((bill.sum() - bill[k]) / 2).toString()
        }
    }
}
