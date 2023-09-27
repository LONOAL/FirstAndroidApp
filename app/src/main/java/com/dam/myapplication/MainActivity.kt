package com.dam.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    val TAG = "estado"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme() {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("")
                }
            }

        }
        Log.d("Estado","Estoy en oncreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Estado","estamose en start")


    }

    override fun onResume() {
        super.onResume()

        Log.d("Estado","estamose en resume")


    }

    override fun onPause() {
        super.onPause()
        Log.d("Estado","estamose en pausa")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Estado","estamose en stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Estado", "estamose en restart")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d("Estado","estamose en destruccion")

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        modifier = modifier,
        fontSize = 100.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme() {
        Greeting("Goncho")
    }
}