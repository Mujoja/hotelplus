package com.example.hotelplus.ui.theme.screens.booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hotelplus.R
import com.example.hotelplus.navigation.ROUT_BEACH
import com.example.hotelplus.navigation.ROUT_CITY
import com.example.hotelplus.navigation.ROUT_COUNTRY
import com.example.hotelplus.navigation.ROUT_SUBURBAN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        TopAppBar(
            title = { Text(text = "HotelPlus",
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center
            ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.Black)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications", tint = Color.Black)

                }
            }

        )
        Spacer(modifier = Modifier.height(10.dp))

        //search bar
        var search by remember {
            mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search=it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search,
                contentDescription = "Search")},
            placeholder = { Text(text = "Enter destination")}
        )
        //end of search bar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Need ideas?",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center

        )


        Row(
            modifier = Modifier
                .padding(start = 20.dp,)
                .horizontalScroll(rememberScrollState())
        ) {
            //CARD ONE

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)
                .clickable {
                    navController.navigate(ROUT_CITY)
                },
            )

            {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.city),
                        contentDescription ="city",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "The City",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center

                    )
                }
            }
            //CARD END
            Spacer(modifier = Modifier.width(20.dp))

            //CARD TWO

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)
                .clickable {
                    navController.navigate(ROUT_BEACH)
                },
            )

            {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.beach),
                        contentDescription ="city",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Beach",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center

                    )
                }
            }
            //CARD END TWO
            Spacer(modifier = Modifier.width(20.dp))

            //CARD THREE

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)
                .clickable {
                    navController.navigate(ROUT_COUNTRY)
                },
            )

            {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.country),
                        contentDescription ="city",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Country",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center

                    )
                }
            }
            //CARD END THREE
            Spacer(modifier = Modifier.width(20.dp))

            //CARD FOUR

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)
                .clickable {
                    navController.navigate(ROUT_SUBURBAN)
                },
            )

            {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {

                    Image(painter = painterResource(id = R.drawable.suburban),
                        contentDescription ="city",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Suburbarn",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center

                    )
                }
            }
            //CARD END FOUR



        }

    }


}

@Composable
@Preview(showBackground = true)
fun BookingScreenPreview(){
    BookingScreen(rememberNavController())
}