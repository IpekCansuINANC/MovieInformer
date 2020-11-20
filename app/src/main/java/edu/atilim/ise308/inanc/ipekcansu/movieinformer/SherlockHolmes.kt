package edu.atilim.ise308.inanc.ipekcansu.movieinformer

import android.util.Log

class SherlockHolmes(typeOfMovie: String, minutes: Int, leadRole: String, ticketPrice: Double): Movies(typeOfMovie,minutes,leadRole) {

    var empName: String ="Ipek"  //overriding to setter property
        set(value) {
            if(value.length < 4)
                field=value
        }

    //overriding
    override fun isShowing() {
        isPlaying = true
        Log.i(TAG, "isShowing: Sherlock Holmes on showing !! You can watch now on cinema")
    }

    //Overload a function : saloonNum below
     fun saloonNum(sal3: Int) {
        Log.i(TAG, "saloonNum: Sherlock Holmes movie is showing Saloon $sal3")
    }
     fun saloonNum(sal1: Int, sal2: Int) {
        Log.i(TAG, "saloonNum: Sherlock Holmes movie is showing on two saloons!! Saloon $sal1 and Saloon $sal2")
    }




}