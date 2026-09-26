package com.example.article

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                   Surface {
                       Text(text = "In this tutorial, you build a simple UI component with declarative functions.\n" +
                                   "You call Compose functions to say what elements you want and the Compose\n" +
                                   "compiler does the rest. Compose is built around Composable functions. These\n" +
                                   "functions let you define your app\\'s UI programmatically because they let you\n" +
                                   "describe how it should look and provide data dependencies, rather than focus\n" +
                                   "on the process of the UI\\'s construction, such as initializing an element and\n" +
                                   "then attaching it to a parent. To create a Composable function, you add the\n" +
                                   "@Composable annotation to the function name.")

                   }


                }
            }
        }
    }
}

@Composable
fun Article(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "In this tutorial, you build a simple UI component with declarative functions.\n" +
                "You call Compose functions to say what elements you want and the Compose\n" +
                "compiler does the rest. Compose is built around Composable functions. These\n" +
                "functions let you define your app\\'s UI programmatically because they let you\n" +
                "describe how it should look and provide data dependencies, rather than focus\n" +
                "on the process of the UI\\'s construction, such as initializing an element and\n" +
                "then attaching it to a parent. To create a Composable function, you add the\n" +
                "@Composable annotation to the function name.",
        modifier = modifier
    )
}
@Composable
fun ImageArticle(message: String, modifier: Modifier = Modifier){
 val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null
    )
}
@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArticleTheme {
        @Composable
        fun Article(name: String, modifier: Modifier = Modifier) {
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions.\n" +
                        "You call Compose functions to say what elements you want and the Compose\n" +
                        "compiler does the rest. Compose is built around Composable functions. These\n" +
                        "functions let you define your app\\'s UI programmatically because they let you\n" +
                        "describe how it should look and provide data dependencies, rather than focus\n" +
                        "on the process of the UI\\'s construction, such as initializing an element and\n" +
                        "then attaching it to a parent. To create a Composable function, you add the\n" +
                        "@Composable annotation to the function name.",
                modifier = modifier
            )

    }
    }
}