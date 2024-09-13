package com.example.hotelpus.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hotelplus.R
import com.example.hotelplus.navigation.ADD_PRODUCTS_URL
import com.example.hotelplus.navigation.ROUT_BOOKING
import com.example.hotelplus.navigation.ROUT_HOME
import com.example.hotelplus.navigation.ROUT_HOME
import com.example.hotelplus.navigation.ROUT_LOGIN
import com.example.hotelplus.ui.theme.pinklight40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize() .paint(painterResource(id = R.drawable.woodbg), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {



        Image(
            painter = painterResource(id = R.drawable.accomodationflaticon),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp),
            contentScale =ContentScale.Crop
        )




        Text(
            text = "What do you wish to do?",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = { navController.navigate(ROUT_BOOKING) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "Book/Rent")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate(ADD_PRODUCTS_URL) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "Rent out")
        }






    }





}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

