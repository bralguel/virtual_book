package com.example.ejemplo_virtual_book

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//import com.example.ejemplo_virtual_book.ui.theme.Ejemplo_virtual_bookTheme
import com.google.firebase.firestore.FirebaseFirestore
import androidx.compose.ui.unit.dp

//import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*

import com.google.firebase.FirebaseApp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FirebaseApp.initializeApp(this)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button2)                              //configuración del botón para poder
        button.setOnClickListener {                                                 // cambiar a la segunda pantalla
            val intent= Intent(this, segunda_pantalla::class.java)
            startActivity(intent)
        }

//        setContent {
//            FirebaseTestScreen()
//        }
//        // Asegurar que Firestore está en línea
//        FirebaseFirestore.getInstance().enableNetwork()
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    Log.d("FirebaseTest", "Firestore en línea")
//                } else {
//                    Log.e("FirebaseTest", "No se pudo conectar a Firestore", task.exception)
//                }
//            }

//        setContent {
//            Ejemplo_virtual_bookTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Ejemplo_virtual_bookTheme {
//        Greeting("Android")
//    }
//}

@Composable
fun FirebaseTestScreen() {
//    val db = FirebaseFirestore.getInstance()
//    var message by remember { mutableStateOf("Esperando respuesta...") }

//    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
//        Button(onClick = {
//            db.collection("test").add(mapOf("mensaje" to "¡Firebase conectado!"))
//                .addOnSuccessListener { message = "Conexión exitosa" }
//                .addOnFailureListener { message = "Error: ${it.message}" }
//        }) {
//            Text("Probar conexión")
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//        Text(text = message, style = MaterialTheme.typography.headlineMedium)
//    }
}