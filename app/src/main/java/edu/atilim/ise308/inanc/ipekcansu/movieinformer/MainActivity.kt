package edu.atilim.ise308.inanc.ipekcansu.movieinformer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.ln

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieInformer()
    }

    private fun movieInformer()
    {
        val movie1 = SherlockHolmes("Detective, Mystery",124," Robert Downey Jr.",50.0)
        movie1.empName = "Cansu"
        println("The employee who helps you ${movie1.empName}")
        movie1.getMovieInfo()
        movie1.getMinInfo()
        movie1.isShowing()
        movie1.saloonNum(4,3)

        val movie2= Avengers("Science fiction",120," Robert Downey Jr., Scarlett Johansson, Chris Evans")
        movie2.isShowing()
        movie2.getMovieInfo()
        movie2.timeToShowing(5)

    }
}