
package com.example.jarvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jarvis.ui.theme.JarvisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JarvisTheme {
                JarvisUI()
            }
        }
    }
}

@Composable
fun JarvisUI() {
    val jarvisFont = FontFamily(
        Font(R.font.orbitron_bold)
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .border(10.dp, Color.Red)
        ) {
            // Dragon image: smaller and aligned to the far right
            Image(
                painter = painterResource(id = R.drawable.dragon),
                contentDescription = "Red Chinese dragon",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .fillMaxHeight(0.85f)
                    .fillMaxWidth(0.30f)
                    .alpha(0.45f)
            )

            // Heading at the top center
            Text(
                text = "JARVIS",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 20.dp),
                color = Color.Red,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = jarvisFont,
                letterSpacing = 4.sp
            )
        }
    }
}
