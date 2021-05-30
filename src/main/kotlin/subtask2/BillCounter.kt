package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var newArray = bill.toMutableList()
        var resultat = ""

        for (i in 0..newArray.lastIndex) {
            if (i == k) newArray.removeAt(i)
        }
        var womanCounter = newArray.sum() / 2
        if (b == womanCounter) {
            resultat = "Bon Appetit"
            return resultat
        } else {resultat = (b-womanCounter).toString()
            return resultat}
    }
}
