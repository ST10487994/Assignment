package vcmsa.ci.assignment

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputTimeofDay = findViewById<EditText>(R.id.inputTimeofDay)
        val btngetMeal = findViewById<Button>(R.id.btngetMeal)
        val txtResult = findViewById<TextView>(R.id.txtResults)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btngetMeal.setOnClickListener {
            val timeOfDay = inputTimeofDay.text.toString().trim().lowercase()

            var mealSuggestion = ""

            if (timeOfDay == "morning") {
                mealSuggestion = "Bacon and eggs"
            } else if (timeOfDay == "mid-morning") {
                mealSuggestion = "Fruit Salad"
            } else if (timeOfDay == "afternoon") {
                mealSuggestion = "Peanutbutter and Jam Sandwich"
            } else if (timeOfDay == "mid-afternoon") {
                mealSuggestion = "Wholewheat Crackers with Cheese"
            } else if (timeOfDay == "dinner") {
                mealSuggestion = "Mac and Cheese"
            } else if (timeOfDay == "after dinner") {
                mealSuggestion = "Cake or Ice cream"
            } else {
                mealSuggestion =
                    " Input Invalid. Please enter Morning, Mid-morning,Afternoon,Mid-afternoon,Dinner,or After dinner"
            }

            txtResult.text = mealSuggestion
        }

        btnClear.setOnClickListener {
            inputTimeofDay.text.clear()
            txtResult.text = "Your meal suggestion will emerge here"
            Toast.makeText(this, "Reset to default", Toast.LENGTH_SHORT).show()

        }
    }
}