package edu.atilim.ise308.inanc.ipekcansu.movieinformer

import android.util.Log

class Avengers(typeOfMovie: String, minutes: Int, leadRole: String): Movies(typeOfMovie,minutes,leadRole) { //child class

    override fun isShowing() {
        isPlaying = false
        Log.i(TAG, "isShowing: Avengers Movie is not showing right now:( ")
    }

    fun timeToShowing(dayToShow: Int)
    {
        Log.i(TAG, "timeToShowing: $dayToShow days left to show!!!")
    }
    companion object {
        const val TAG = "AVENGERS"
    }

}