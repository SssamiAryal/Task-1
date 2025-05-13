package com.example.meroapplication

import android.os.Bundle
import android.renderscript.Sampler.Value
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.example.meroapplication.ui.theme.MeroApplicationTheme
import android.app.DatePickerDialog
import androidx.compose.ui.platform.LocalContext
import java.util.*


class sSgnup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeroApplicationTheme {
                Scaffold { innerPadding ->
                    sSgnup(innerPadding)            }
            }
            }
        }
    }



@Composable
fun sSgnup (innerPaddingValues: PaddingValues) {
    var Firstname by remember { mutableStateOf("") }
    var Lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf("Select Country") }
    var option= listOf("Nepal","Usa","China","Uk")
    var textFieldSize by remember { mutableStateOf(Size.Zero) }
    var dateOfBirth by remember { mutableStateOf("Select Date of Birth") }

    //Date Picker


    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement =Arrangement.Center,
            verticalAlignment =Alignment.CenterVertically

        ){
            Text(text = "Register")
        }
        Spacer(
            modifier = Modifier.height(20.dp),
        )
        Row (
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            OutlinedTextField(
                value = Firstname,
                onValueChange = { Firstname = it },
                label = { Text("First Name") },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4)
            )
            OutlinedTextField(
                value = Lastname,
                onValueChange = { Lastname = it },
                label = { Text("Last Name") },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4)
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            shape = RoundedCornerShape(4),
            modifier = Modifier.fillMaxWidth()



        )
        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)){
            OutlinedTextField(
                value = selectedOptionText,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { Coordinates ->
                        textFieldSize=Coordinates.size.toSize()

                    }
                    .clickable { expanded=true },
                placeholder = { Text("Select Country") },
                enabled = false,
                trailingIcon ={
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = null
                    )

                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .fillMaxWidth()
            ){
                option.forEach{country->
                    DropdownMenuItem(
                        text = { Text(country) },
                        onClick = {
                            selectedOptionText=country
                            expanded=false
                        }
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = dateOfBirth,
            onValueChange = {},
            label = { Text("Date of Birth") },
            modifier = Modifier
                .fillMaxWidth()
                .clickable { datePickerDialog.show() },
            enabled = false,
            shape = RoundedCornerShape(4),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null
                )
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLogn() {
    MeroApplicationTheme {
        sSgnup(innerPaddingValues = PaddingValues(0.dp))
    }
}
