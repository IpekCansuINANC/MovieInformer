package edu.atilim.ise308.inanc.ipekcansu.movieinformer

import android.util.Log

class MinuteToHours {

    var hour: Int = 0
    var min : Int = 0

    fun calculate(min:Int)
    {
        val hour = min/60
        val min = min%60

        Log.i(TAG, "$hour hour $min minute")
    }
    companion object{
        const val TAG="Minute To Hours"
    }
}