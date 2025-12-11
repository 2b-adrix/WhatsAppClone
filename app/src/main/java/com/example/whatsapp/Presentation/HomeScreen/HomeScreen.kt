package com.example.whatsapp.Presentation.HomeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.whatsapp.Presentation.BottomNavigation.BottomNavigationBar
import com.example.whatsapp.R

@Composable
fun HomeScreen(navHostController: NavHostController)
{    val chatData = listOf(
        ChatDesignModel(
            image = R.drawable.salman_khan,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        ),

        ChatDesignModel(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "09:00 PM",
            message = "Hello"
        ),ChatDesignModel(
            image = R.drawable.rajkummar_rao,
            name = "Raj kumar rao",
            time = "09:00 PM",
            message = "Hello"
        ),ChatDesignModel(
            image = R.drawable.ajay_devgn,
            name = "Ajay Devgn",
            time = "09:00 PM",
            message = "Hello"
        ),ChatDesignModel(
            image = R.drawable.sharadha_kapoor,
            name = "Shradha Kapoor",
            time = "09:00 PM",
            message = "Hello"
        ),ChatDesignModel(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            time = "09:00 PM",
            message = "Hello"
        ),
         ChatDesignModel(
         image = R.drawable.rashmika,
             name = "Rashmika",
    time = "09:00 PM",
    message = "Hello"
    ),

        ChatDesignModel(
            image = R.drawable.sharukh_khan,
            name = "Salman Khan",
            time = "10:00 AM",
            message = "Hello"
        )
    )


    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.Dark_Green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White) {
                Icon(
                    painter = painterResource(id = R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                )
            }
        },        bottomBar = {
            BottomNavigationBar(navHostController, "HomeScreen")
        }

    )


    {
        Column(modifier = Modifier.padding(it))
        {
            Spacer(modifier = Modifier.height(8.dp))

            Box(modifier = Modifier.fillMaxWidth())
            {
                Text(
                    text = "WhatsApp",
                    fontSize = 28.sp, color = colorResource(id = R.color.light_Green),
                    modifier = Modifier.align(Alignment.CenterStart).padding(start = 16.dp),

                    fontWeight = FontWeight.Bold
                )


                Row(modifier = Modifier.align(Alignment.CenterEnd))
                {
                    IconButton(onClick = {})
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }


                    IconButton(onClick = {})
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null, modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = {})
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                }
            }
            HorizontalDivider()

            LazyColumn {

                 items(chatData)
                {
                    ChatDesign(chatDesignModel = it)
                }
            }
            } }}

