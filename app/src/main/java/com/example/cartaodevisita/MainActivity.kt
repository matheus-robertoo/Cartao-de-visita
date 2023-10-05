package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Cartao()
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)

fun Cartao() {
    val imagem = painterResource(id = R.drawable.android_logo1)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(Color.Black)
            .wrapContentSize()
    )

    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(top = 200.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imagem,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.size(100.dp)

            )

            Text(
                text = "Matheus Roberto",
                color = Color.White,
                fontSize = 36.sp,
            )

            Text(
                text = "Estudante Android",
                color = Color(0xFF3ddc84),
                fontSize = 20.sp
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 260.dp, start = 36.dp)
                    .fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.call_48px),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF3ddc84))

                )

                Text(
                    text = "00-0000 0000",
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 12.dp, start = 36.dp)
                    .fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.share_48px),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF3ddc84))
                )

                Text(
                    text = "@AndroidDev",
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 12.dp, start = 36.dp)
                    .fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.stacked_email_48px),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF3ddc84))
                )

                Text(
                    text = "android@android.com",
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}
