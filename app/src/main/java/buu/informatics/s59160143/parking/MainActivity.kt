package buu.informatics.s59160143.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val park: ArrayList<Parking> = ArrayList<Parking>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button_one: Button = findViewById(R.id.button)
        val Button_two: Button = findViewById(R.id.button2)
        val Button_three: Button = findViewById(R.id.button3)


    }
}
