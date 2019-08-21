package buu.informatics.s59160143.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val park: ArrayList<Parking> = ArrayList<Parking>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button_one: Button = findViewById(R.id.button_one)
        val Button_two: Button = findViewById(R.id.button_two)
        val Button_three: Button = findViewById(R.id.button_three)

        for (i in 0..2) {
            park.add(i, Parking("", "", ""))
        }

        findViewById<Button>(R.id.button_one).setOnClickListener {
            clickParkOne()
        }

        findViewById<Button>(R.id.button_two).setOnClickListener {
            //click2()
        }

        findViewById<Button>(R.id.button_three).setOnClickListener {
            //click3()

        }
    }
    fun clickParkOne() {
        val parkOne = findViewById<Button>(R.id.button_one)

        val register = findViewById<EditText>(R.id.register_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val name = findViewById<EditText>(R.id.name_edit)


        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            park.add(0, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkOne.setText("เต็ม").toString()

        }
    }


    }