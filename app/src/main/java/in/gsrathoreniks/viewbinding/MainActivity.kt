package `in`.gsrathoreniks.viewbinding

import `in`.gsrathoreniks.viewbinding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

/*
    Declaring binding variable of type ActivityMainBinding which
    contain reference to all the fields of activity_main.xml
*/
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Creates an instance of binding class for the activity to use
        binding = ActivityMainBinding.inflate(layoutInflater)

//        Get reference to the root of the view
        val view = binding.root

//        passing the root to setContentView()
        setContentView(view)
    }
}