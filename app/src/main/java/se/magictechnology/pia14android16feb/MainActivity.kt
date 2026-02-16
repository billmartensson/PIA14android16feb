package se.magictechnology.pia14android16feb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.magictechnology.pia14android16feb.ui.theme.PIA14android16febTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PIA14android16febTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Fancyscreen()
                }
            }
        }
    }
}

@Composable
fun Fancyscreen() {

    var mytext by remember { mutableStateOf("Hello") }
    var mynumber by remember { mutableStateOf(0) }

    fun dobigcalc() {
        mynumber = mynumber * 2
    }


    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier
            .background(Color.Red)
            .padding(20.dp)
            .fillMaxWidth()
            .height(100.dp)
        ) {
            Text("AA")
            Text("BB")
        }
        Text("CCC")

        Text(mytext)

        Button(onClick = {
            mytext = "BANANA"
        }) {
            Text("CLICK TO CHANGE TEXT!!!")
        }

        Column(modifier = Modifier) {
            if (mynumber > 5) {
                Text("STOR SIFFRA!!", fontSize = 40.sp)
            } else {
                Text(" ", fontSize = 40.sp)
            }
        }
        Text("$mynumber", fontSize = 40.sp)

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Green)
        ) {
            Button(onClick = {
                if (mynumber > 0) {
                    mynumber--
                }
            }) {
                Text("MINUS")
            }

            Button(onClick = {
                mynumber++
            }) {
                Text("PLUS")
            }

            Button(onClick = {
                dobigcalc()
            }) {
                Text("CALC")
            }
        }

        Row(modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .background(Color.Blue)
        ) {
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Yellow)
            ) { }

            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Gray)
            ) { }
        }

        FancyBox(modifier = Modifier.padding(20.dp))
        FancyBox()

    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!!!!!!!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PIA14android16febTheme {
        Fancyscreen()
    }
}
