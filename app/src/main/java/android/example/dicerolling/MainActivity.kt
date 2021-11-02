package android.example.dicerolling

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_btn)
        diceImage = findViewById(R.id.dice_image)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val drawableResource =  when(java.util.Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        // get random number between 1 to 6
        // resultText.text = ('1'..'6').random().toString()
    }
}