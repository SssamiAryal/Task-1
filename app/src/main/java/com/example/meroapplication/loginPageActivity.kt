package com.example.meroapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meroapplication.R

class loginPageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                LoginBod(innerPadding)            }
        }
    }
}

@Composable
fun LoginBod(innerPadding: PaddingValues) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember {
        mutableStateOf(false)

    }
    var rememberMe by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(R.drawable.hat),
            contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .width(250.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        //email
        OutlinedTextField(
            value = email,
            onValueChange = { input ->
                email = input
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )
            },
            placeholder = {
                Text("abc@gmail.com")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(0.2f),
                unfocusedContainerColor = Color.Gray.copy(0.2f),

                )
        )


        Spacer(modifier = Modifier.height(20.dp))
        //password
        OutlinedTextField(
            value = password,
            onValueChange = { input ->
                password = input
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = null
                )
            },
            suffix = {
                Icon(
                    painter = painterResource(
                        if (passwordVisibility)
                        R.drawable.baseline_visibility_off_24
                        else R.drawable.baseline_visibility_24),
                    contentDescription = null,
                    modifier = Modifier.clickable { passwordVisibility=!passwordVisibility }
                )
            },
            placeholder = {
                Text("*******")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if(!passwordVisibility) PasswordVisualTransformation()
            else VisualTransformation.None,
//            minLines = 5,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(0.2f),
                unfocusedContainerColor = Color.Gray.copy(0.2f),

                )
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp, 0.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = rememberMe,
                    onCheckedChange = { rememeber ->
                        rememberMe = rememeber
                    },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = Color.Green,
                        checkedColor = Color.White
                    )
                )
                Text(text = "Remember me")

            }
            Row {

                Text(text = "Forget Password?",
                    modifier = Modifier.clickable {})

            }
        }
        Spacer(
            modifier = Modifier.height(20.dp),
        )
        ElevatedButton(
            onClick = {},
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .padding(10.dp, 0.dp)
        ) {
            Text(text = "Login")

        }
        Spacer(
            modifier = Modifier.height(20.dp),
        )
        ElevatedButton(
            onClick = {},
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .padding(10.dp, 0.dp)
        ) {
            Text(text = "Signup")


        }

    }
}

@Preview
@Composable
fun PreviewLogin() {
    LoginBod(PaddingValues(0.dp))
}