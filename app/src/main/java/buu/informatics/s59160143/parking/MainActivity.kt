package buu.informatics.s59160143.parking

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160143.parking.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val park: ArrayList<Parking> = ArrayList<Parking>()
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val Button_one: Button = binding.buttonOne
        val Button_two: Button = binding.buttonTwo
        val Button_three: Button = binding.buttonThree

        for (i in 0..2) {
            park.add(i, Parking("", "", ""))
        }

        binding.buttonOne.setOnClickListener {
            clickParkOne()
            clickDeleteOne()
        }

        binding.buttonTwo.setOnClickListener {
            clickParkTwo()
            clickDeleteTwo()
        }

        binding.buttonThree.setOnClickListener {
            clickParkThree()
            clickDeleteThree()
        }
    }

    fun clickDeleteOne() {
        val parkOne = binding.buttonOne
        binding.buttonDelete.setOnClickListener {
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
        val parkTwo = binding.buttonTwo
        binding.buttonDelete.setOnClickListener {
            parkTwo.setText("ว่าง").toString()
            var register = binding.registerEdit
            var brand = binding.brandEdit
            var name = binding.nameEdit
            register.text = null
            brand.text = null
            name.text = null
        }
    }
    fun clickDeleteThree() {
        val parkThree = findViewById<Button>(R.id.button_three)
        binding.buttonDelete.setOnClickListener {
            parkThree.setText("ว่าง").toString()
            var register = binding.registerEdit
            var brand = binding.brandEdit
            var name = binding.nameEdit
            register.text = null
            brand.text = null
            name.text = null
        }
    }
    fun clickParkOne() {
        binding.buttonOne.setBackgroundColor(Color.GREEN)
        binding.buttonTwo.setBackgroundResource(android.R.drawable.btn_default)
        binding.buttonThree.setBackgroundResource(android.R.drawable.btn_default)
        val parkOne = binding.buttonOne

        var register = binding.registerEdit
        var brand = binding.brandEdit
        var name = binding.nameEdit
        register.text = null
        brand.text = null
        name.text = null

        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text

        binding.buttonUpdate.setOnClickListener {
            park.add(0, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkOne.setText("เต็ม \n" + park.get(0).register+ "\n"+park.get(0).brand+"\n"+park.get(0).name).toString()

        }
    }

    fun clickParkTwo() {
        binding.buttonTwo.setBackgroundColor(Color.GREEN)
        binding.buttonOne.setBackgroundResource(android.R.drawable.btn_default)
        binding.buttonThree.setBackgroundResource(android.R.drawable.btn_default)
        val parkTwo = binding.buttonTwo

        var register = binding.registerEdit
        var brand = binding.brandEdit
        var name = binding.nameEdit

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
        binding.buttonThree.setBackgroundColor(Color.GREEN)
        binding.buttonOne.setBackgroundResource(android.R.drawable.btn_default)
        binding.buttonTwo.setBackgroundResource(android.R.drawable.btn_default)
        val parkThree = binding.buttonThree

        var register = binding.registerEdit
        var brand = binding.brandEdit
        var name = binding.nameEdit

        register.text = null
        brand.text = null
        name.text = null

        var showRegister = register.text
        var showBrand = brand.text
        var showName = name.text
        binding.buttonUpdate.setOnClickListener {
            park.add(2, Parking(showRegister.toString(), showBrand.toString(), showName.toString()))
            parkThree.setText("เต็ม \n" + park.get(2).register+ "\n"+park.get(2).brand+ " \n "+park.get(2).name).toString()
        }
    }
}