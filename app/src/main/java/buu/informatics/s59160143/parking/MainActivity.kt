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
            clickDeleteOne()
        }

        findViewById<Button>(R.id.button_two).setOnClickListener {
            clickParkTwo()
            clickDeleteTwo()
        }

        findViewById<Button>(R.id.button_three).setOnClickListener {
            clickParkThree()
            clickDeleteThree()
        }
    }

    fun clickDeleteOne() {
        val parkOne = findViewById<Button>(R.id.button_one)
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            parkOne.setText("ว่าง").toString()
            var register = findViewById<EditText>(R.id.register_edit)
            var brand = findViewById<EditText>(R.id.brand_edit)
            var name = findViewById<EditText>(R.id.name_edit)
            register.text = null
            brand.text = null
            name.text = null
        }
    }

    fun clickDeleteTwo() {
        val parkTwo = findViewById<Button>(R.id.button_two)
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            parkTwo.setText("ว่าง").toString()
            var register = findViewById<EditText>(R.id.register_edit)
            var brand = findViewById<EditText>(R.id.brand_edit)
            var name = findViewById<EditText>(R.id.name_edit)
            register.text = null
            brand.text = null
            name.text = null
        }
    }
    fun clickDeleteThree() {
        val parkThree = findViewById<Button>(R.id.button_three)
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            parkThree.setText("ว่าง").toString()
            var register = findViewById<EditText>(R.id.register_edit)
            var brand = findViewById<EditText>(R.id.brand_edit)
            var name = findViewById<EditText>(R.id.name_edit)
            register.text = null
            brand.text = null
            name.text = null
        }
    }
    fun clickParkOne() {

        val parkOne = findViewById<Button>(R.id.button_one)

        var register = findViewById<EditText>(R.id.register_edit)
        var brand = findViewById<EditText>(R.id.brand_edit)
        var name = findViewById<EditText>(R.id.name_edit)
        register.text = null
        brand.text = null
        name.text = null

        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text

        findViewById<Button>(R.id.button_update).setOnClickListener {
            park.add(0, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkOne.setText("เต็ม \n" + park.get(0).register+ "\n"+park.get(0).brand+"\n"+park.get(0).name).toString()

        }
    }

    fun clickParkTwo() {
        val parkTwo = findViewById<Button>(R.id.button_two)

        val register = findViewById<EditText>(R.id.register_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val name = findViewById<EditText>(R.id.name_edit)

        register.text = null
        brand.text = null
        name.text = null

        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            park.add(1, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkTwo.setText("เต็ม \n" + park.get(1).register+ "\n"+park.get(1).brand+"\n"+park.get(1).name).toString()

        }
    }

    fun clickParkThree() {
        val parkThree = findViewById<Button>(R.id.button_three)

        val register = findViewById<EditText>(R.id.register_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val name = findViewById<EditText>(R.id.name_edit)

        register.text = null
        brand.text = null
        name.text = null

        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            park.add(2, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkThree.setText("เต็ม \n" + park.get(2).register+ "\n"+park.get(2).brand+"\n"+park.get(2).name).toString()
        }
    }
}