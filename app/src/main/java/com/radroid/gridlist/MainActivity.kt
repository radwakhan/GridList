package com.radroid.gridlist

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radroid.gridlist.ui.theme.GridListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridListTheme {
              GridListApp()
            }
        }
    }
}
@Composable
fun GridListApp(modifier: Modifier=Modifier){
CardList(topicList = DataSource().topic())
}
@Composable
fun CardList(topicList:List<Topic>,modifier: Modifier=Modifier){
    LazyVerticalGrid(columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)) {
items(topicList){item->
    CardLayout(topic = item)
}
        }
    }



@Composable
fun CardLayout(topic:Topic,modifier: Modifier=Modifier){
    Card(modifier = Modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = topic.image), contentDescription = stringResource(id = topic.topic),
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp),
                contentScale = ContentScale.Crop)
            Column(modifier = Modifier.padding(top = 16.dp, end = 16.dp, start = 16.dp)) {
                Text(text = stringResource(id = topic.topic))
                Row(modifier = Modifier.padding(top = 8.dp,)) {
                    Text(text = "⁂", modifier = Modifier.padding(end = 8.dp))
                    Text(text = ""+integerResource(id = topic.number))
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GridListTheme {
GridListApp()
    }
}