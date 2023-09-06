package id.pratama.deepdiveweek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import id.pratama.deepdiveweek4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val myVar2 = "variable ku"

    lateinit var btnNotification: ImageView
    lateinit var btnScanQR: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVariable = "hello"

        // inisisasi view dari xml, paling dasar,
        btnNotification = findViewById(R.id.btnNotification)
        btnScanQR = findViewById(R.id.btnScanQR)

    }

    fun myFunction() {}

    fun myFunctionKedua() {

    }
}