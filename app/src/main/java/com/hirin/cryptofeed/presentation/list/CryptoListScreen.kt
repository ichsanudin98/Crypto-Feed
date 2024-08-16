package com.hirin.cryptofeed.presentation.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hirin.cryptofeed.R

@Preview
@Composable
fun CryptoListScreen() {
    Surface(color = MaterialTheme.colorScheme.onPrimary) {
        Box(modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                val path = Path()
                val x = size.width
                val y = size.height
                val center = size.center
                path.apply {
                    moveTo(0f, 0f)
                    lineTo(x, 0f)
                    cubicTo(
                        x1 = x,
                        y1 = center.y / 2,
                        x2 = x,
                        y2 = center.y,
                        x3 = 0f,
                        y3 = center.y

                    )

                }

                drawPath(path = path, color = Color.Blue)
            }
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = "Halo",
                    style = MaterialTheme.typography.headlineLarge,
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Welcome to Hood Lab ",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.size(16.dp))
                Image(
                    painter = painterResource(id = R.mipmap.ic_launcher),
                    contentDescription = null,
                    modifier = Modifier.size(34.dp)
                )
            }
            
            Column(modifier = Modifier.fillMaxSize()
                .padding(20.dp)) {

            }
        }
    }
}