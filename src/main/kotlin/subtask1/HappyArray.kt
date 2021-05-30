package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        /*throw NotImplementedError("Not implemented")*/
        var newArray = sadArray.toMutableList()
        var chek = false

        for (i in 1 until newArray.lastIndex){
            if ((newArray[i -1] + newArray[i+1]) < newArray[i]) {
                chek = true
                newArray.removeAt(i)
                break
            }
        }

        if (chek) return convertToHappy(newArray.toIntArray()) else return newArray.toIntArray()

    }
}
