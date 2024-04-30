package net.ezra.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.ezra.MenuItem
import net.ezra.R

@Composable
fun DrawerHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp),
            contentAlignment = Alignment.Center
    ) {
         Image(
             painter = painterResource(id = R.drawable.ty),
             contentDescription = null,
             contentScale = ContentScale.Crop,

         )

    }

}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: androidx.compose.ui.text.TextStyle = androidx.compose.ui.text.TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit


){
    LazyColumn(modifier) {
        items(items){item ->
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemClick(item)
                    }
                    .padding(16.dp)
            ){
                Icon(
                    imageVector = item.icon,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = item.title,
                    style = itemTextStyle,
                    modifier = Modifier.weight(1f)
                    )

            }

        }

    }

}


















