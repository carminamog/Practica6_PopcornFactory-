package moreno.carmina.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var botonGetMeIn : Button = findViewById(R.id.botonP)
        botonGetMeIn.setOnClickListener {
            val intent = Intent(this, Catalogo::class.java)
            startActivity(intent)

        }
    }
}