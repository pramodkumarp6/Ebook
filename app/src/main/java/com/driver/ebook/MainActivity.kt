package com.driver.ebook

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.driver.ebook.ui.theme.EbookTheme
import com.driver.ebook.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val mainViewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EbookTheme {

                    LoginScreen()
                }
            }
        }



    private fun logged(username:String, passwword:String) {
        if (username == "pramod" && passwword == "pramod") {
            Toast.makeText(this, "logged !!", Toast.LENGTH_LONG).show()

        } else {
            Toast.makeText(this, "wrong credential", Toast.LENGTH_SHORT).show()
        }
    }




        @Composable
  private  fun LoginScreen(){
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
            Log.e(TAG, "LoginScreen: ${username}")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Text(
                text = "Hello Again!", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
            Text(
                text = "Welcome", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
            Text(
                text = "Back", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold

            )

          OutlinedTextField(value =username.value , onValueChange ={
              username.value = it
          },
              label = {
                  Text(text = "UserName")
              },
              singleLine = true,
              leadingIcon = {
                  Icon(Icons.Default.Info, contentDescription = "persion")
              },
              placeholder = {
                  Text(text = "Enter UserName Please")
              },
              modifier = Modifier.fillMaxWidth()

          )

            OutlinedTextField(value = password.value, onValueChange ={
                password.value = it

            },
            leadingIcon = {
                Icon(Icons.Default.Info, contentDescription = "persion")
            },
                label = {
                    Text(text = "Password")
                },


                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,

                placeholder = {
                    Text(text = "Enter Pasword")

                },
                modifier = Modifier.fillMaxWidth()
                )

            OutlinedButton(
                onClick = {
                    logged(username.value,password.value)},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)

                ) {
                Text(text = "Login", color = Color.Blue)
                
            }

            Text(
                text = "Register", fontSize = 20.sp,  color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top =35.dp)

            )

            Text(
                text = "UserForget", fontSize = 20.sp,  color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 35.dp)


            )

        }


    }

}


