package edu.atilim.ise308.inanc.ipekcansu.movieinformer

import android.util.Log
import kotlin.math.min

abstract class Movies(val typeOfMovie: String, val minutes: Int, val leadRole: String) { //PRIMARY CONS

    var isPlaying: Boolean = false


    constructor(typeOfMovie: String, minutes: Int, leadRole: String, isPlaying: Boolean): this(typeOfMovie, minutes, leadRole) //SECONDARY CONS
    {
        this.isPlaying = isPlaying
    }

    init {
        Log.i(TAG, "Welcome! Your choosen movie information: ")
    }

    companion object{
        const val TAG = "Movie"
    }
    
    fun getMovieInfo(){
        Log.i(TAG, "getMovieInfo: Type of movie: $typeOfMovie | Lead Roles: $leadRole")
    }

    fun getMinInfo()
    {
        val minuteToHours : MinuteToHours = MinuteToHours()
        val movieMinute = minuteToHours.calculate(minutes)

    }

    abstract fun isShowing() //overriding function
}