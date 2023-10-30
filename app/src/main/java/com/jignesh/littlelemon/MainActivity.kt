package com.jignesh.littlelemon

import android.os.Bundle
import android.widget.GridLayout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jignesh.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(180.dp)
                    )
                    Text(
                        text = "Let's get to know you",
                        color = Color.White,
                        modifier = Modifier
                            .background(Color(R.color.primary))
                            .fillMaxWidth()
                            .align(CenterHorizontally)
                    )
                    Text(
                        text = "Personal information",
                        color = Color.Black,
                        fontSize = 24.sp,
                        modifier = Modifier
                            .align(CenterHorizontally)
                    )
                    Text(
                        text = "First Name",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)
                    )
                    OutlinedTextField(
                        value = "Jignesh",
                        onValueChange = {}
                    )

                    Text(
                        text = "Last Name",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)
                    )
                    OutlinedTextField(
                        value = "Rathod",
                        onValueChange = {}
                    )

                    Text(
                        text = "Email",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)
                    )
                    OutlinedTextField(
                        value = "jignesh@gmail.com",
                        onValueChange = {}
                    )

                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 32.dp, 0.dp, 0.dp)
                    ) {
                        Text(text = "Register")
                    }
                }
            }
        }
    }
}