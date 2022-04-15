package com.midterm.firstjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.midterm.firstjetpack.ui.theme.FirstJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    CreateView()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Composable
fun CreateView(){
    Column(modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = painterResource(R.drawable.cat),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, Color.White, CircleShape)   // add a border (optional)
        );
        Text(text = "Trần Đức Thông", style = TextStyle(
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(vertical = 6.dp)
            );
        Text(text = "Android Programmer VIP Pro123", style = TextStyle(
            fontSize = 20.sp
        ));
        Text(text = "@tranducthong", style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Light
        ));



        var ls = ArrayList<Skill>();
        ls.add(Skill(R.drawable.cat1,"Project 1", "Description of Project 1"))
        ls.add(Skill(R.drawable.cat2,"Project 2", "Description of Project 2"))
        ls.add(Skill(R.drawable.cat3,"Project 3", "Description of Project 3"))
        ls.add(Skill(R.drawable.cat4,"Project 4", "Description of Project 4"))
        ls.add(Skill(R.drawable.cat1,"Project 1", "Description of Project 1"))
        ls.add(Skill(R.drawable.cat2,"Project 2", "Description of Project 2"))
        ls.add(Skill(R.drawable.cat3,"Project 3", "Description of Project 3"))
        ls.add(Skill(R.drawable.cat4,"Project 4", "Description of Project 4"))
        ls.add(Skill(R.drawable.cat1,"Project 1", "Description of Project 1"))
        ls.add(Skill(R.drawable.cat2,"Project 2", "Description of Project 2"))
        ls.add(Skill(R.drawable.cat3,"Project 3", "Description of Project 3"))
        ls.add(Skill(R.drawable.cat4,"Project 4", "Description of Project 4"))
        ls.add(Skill(R.drawable.cat1,"Project 1", "Description of Project 1"))
        ls.add(Skill(R.drawable.cat2,"Project 2", "Description of Project 2"))
        ls.add(Skill(R.drawable.cat3,"Project 3", "Description of Project 3"))
        ls.add(Skill(R.drawable.cat4,"Project 4", "Description of Project 4"))



        val showPortifilo = remember {
            mutableStateOf(false)
        }

        Button(
            onClick =
        {
                showPortifilo.value = !showPortifilo.value

        }, modifier = Modifier.padding(all = 20.dp)) {
            Text(text = "Portfolio", style = TextStyle(
                fontSize = 26.sp
            ))
        };
        if(showPortifilo.value) {
            Portfolio(ls)
        }
    }
}

@Composable
fun Portfolio(data: ArrayList<Skill>) {
    LazyColumn {
        items(data) { item ->
            Card(modifier = Modifier.padding(vertical = 10.dp)) {
                Row() {
                    Image(

                        painter = painterResource(item.Imageres),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,
                        // crop the image if it's not a square
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
//                            .padding(vertical = 10.dp)
//                .border(2.dp, Color.CYAN, CircleShape)   // add a border (optional)
                    );
                    Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                        Text(
                            text = item.Name,
                            style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Normal)
                        );
                        Text(
                            text = item.Descrip,
                            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Light)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CreateCard(data: String){
    Text(text = data)
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstJetpackTheme {
//        Greeting("Android")
    }
}
