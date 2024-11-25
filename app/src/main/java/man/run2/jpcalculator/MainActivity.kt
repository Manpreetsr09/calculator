package man.run2.jpcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import man.run2.jpcalculator.ui.theme.JPCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel :: class.java]
        enableEdgeToEdge()

        setContent {
            JPCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                    calculator(modifier = Modifier.padding(innerPadding),calculatorViewModel)

                }

            }
        }
    }
}
