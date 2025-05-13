//package com.example.firstkotlin
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.firstkotlin.ui.theme.AppGreen
//import com.example.firstkotlin.ui.theme.LightWhite
//import com.example.meroapplication.R
//
//class DashboardScreen : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold { paddingValues ->
//                DashboardContent(paddingValues)
//            }
//        }
//    }
//}
//
//@Composable
//fun DashboardContent(paddingValues: PaddingValues) {
//    Column(
//        modifier = Modifier
//            .padding(paddingValues)
//            .fillMaxSize()
//            .background(AppGreen)
//    ) {
//        // Profile Icon
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(12.dp),
//            horizontalArrangement = Arrangement.End
//        ) {
//            Button(
//                onClick = { /* TODO */ },
//                colors = ButtonDefaults.buttonColors(containerColor = AppGreen),
//                contentPadding = PaddingValues(0.dp)
//            ) {
//                Image(
//                    painter = painterResource(R.drawable.boy),
//                    contentDescription = "User Profile",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clip(CircleShape)
//                )
//            }
//        }
//
//        // Heading
//        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
//            Text(
//                text = "Dashboard",
//                style = TextStyle(
//                    fontSize = 36.sp,
//                    color = Color.White,
//                    fontWeight = FontWeight.Bold
//                )
//            )
//            Text(
//                text = "Manage your stuff easily",
//                style = TextStyle(
//                    fontSize = 16.sp,
//                    color = Color.White.copy(alpha = 0.8f)
//                )
//            )
//        }
//
//        Spacer(modifier = Modifier.height(30.dp))
//
//        // Cards Grid
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp)
//        ) {
//            Row {
//                DashboardCard(R.drawable.book, "Notes", "20 files", LightWhite)
//                Spacer(modifier = Modifier.width(12.dp))
//                DashboardCard(R.drawable.address, "Contacts", "7 saved", Color.White)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Row {
//                DashboardCard(R.drawable.atm, "Cards", "4 linked", Color.White)
//                Spacer(modifier = Modifier.width(12.dp))
//                DashboardCard(R.drawable.password, "Security", "12 passwords", LightWhite)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Row {
//                DashboardCard(R.drawable.character, "Profiles", "8 avatars", Color.White)
//                Spacer(modifier = Modifier.width(12.dp))
//                DashboardCard(R.drawable.logistic, "Parcels", "5 deliveries", LightWhite)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Single Settings Card
//            Row {
//                Card(
//                    modifier = Modifier
//                        .weight(1f)
//                        .height(80.dp),
//                    colors = CardDefaults.cardColors(containerColor = Color.White)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(start = 18.dp),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Image(
//                            painter = painterResource(R.drawable.settings),
//                            contentDescription = "Settings",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .size(44.dp)
//                                .clip(CircleShape)
//                        )
//                        Spacer(modifier = Modifier.width(10.dp))
//                        Column {
//                            Text(
//                                text = "Settings",
//                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)
//                            )
//                            Text(
//                                text = "Privacy and Fingerprint",
//                                style = TextStyle(fontSize = 11.sp),
//                                modifier = Modifier.alpha(0.6f)
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun DashboardCard(
//    imageRes: Int,
//    title: String,
//    subtitle: String,
//    backgroundColor: Color
//) {
//    Card(
//        modifier = Modifier
//            .weight(1f)
//            .height(150.dp),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(top = 10.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = painterResource(id = imageRes),
//                contentDescription = title,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(70.dp)
//                    .clip(CircleShape)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = title,
//                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
//            )
//            Text(
//                text = subtitle,
//                style = TextStyle(fontSize = 11.sp),
//                modifier = Modifier.alpha(0.7f)
//            )
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewDashboardContent() {
//    DashboardContent(paddingValues = PaddingValues(0.dp))
//}
