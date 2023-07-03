import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.threetrees.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    TabLayout()
                }
            }
        }
    }
}
@Composable
fun TabLayout() {
    // Maintain the selected tab state
    val selectedTabIndex = remember { mutableStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigation(
//                modifier = Modifier.fillMaxSize(),
                backgroundColor = MaterialTheme.colors.primary
            ) {
                BottomNavigationItem(
                    selected = selectedTabIndex.value == 0,
                    onClick = { selectedTabIndex.value = 0 },
                    icon = { Icon(painterResource(R.drawable.ic_baseline_emoji_emotions_24), contentDescription = "Tab 1") },
                    label = { Text(text = "Tab 1") }
                )
                BottomNavigationItem(
                    selected = selectedTabIndex.value == 1,
                    onClick = { selectedTabIndex.value = 1 },
                    icon = { Icon(painterResource(R.drawable.ic_baseline_emoji_emotions_24), contentDescription = "Tab 2") },
                    label = { Text(text = "Tab 2") }
                )
                BottomNavigationItem(
                    selected = selectedTabIndex.value == 2,
                    onClick = { selectedTabIndex.value = 2 },
                    icon = { Icon(painterResource(R.drawable.ic_baseline_emoji_emotions_24), contentDescription = "Tab 3") },
                    label = { Text(text = "Tab 3") }
                )
            }
        }
    ) {
        // Content of each tab
        Box(Modifier.fillMaxSize()) {
            when (selectedTabIndex.value) {
                0 -> displayExerciseInformation()
                1 -> BeautifulDayLyricsView()
                2 -> Text(text = "This is tab 3")
            }
        }
    }
}

@Composable
fun displayExerciseInformation() {
    Column {
        ChatMessage("User: Can you tell me about the squat exercise?")
        ChatMessage("Assistant: Sure! The squat is a compound exercise that primarily targets your lower body muscles, including your quadriceps, hamstrings, and glutes.")
        ChatMessage("Assistant: To perform a squat, start by standing with your feet shoulder-width apart. Lower your body by bending your knees and pushing your hips back, as if you're sitting on an imaginary chair. Keep your chest up and your back straight. Then, push through your heels to return to the starting position.")

        ChatMessage("User: What about the deadlift?")
        ChatMessage("Assistant: The deadlift is another compound exercise that targets several muscles, including your hamstrings, glutes, lower back, and upper back.")
        ChatMessage("Assistant: To do a deadlift, stand with your feet hip-width apart and your toes pointing forward. Bend at your hips and knees, keeping your back straight and chest up. Grip the barbell with your hands shoulder-width apart. Stand up by pushing through your heels and extending your hips, keeping the barbell close to your body. Lower the barbell back down in a controlled manner.")

        ChatMessage("User: And what about the Bulgarian split squat?")
        ChatMessage("Assistant: The Bulgarian split squat is a unilateral exercise that targets your quads, glutes, and hamstrings. It also improves balance and stability.")
        ChatMessage("Assistant: To perform a Bulgarian split squat, stand a few feet in front of a bench or step. Place one foot behind you on the bench, with your toes pointing down. Lower your body by bending your front knee until your thigh is parallel to the ground. Push through your front heel to return to the starting position. Repeat with the other leg.")
    }
}

@Composable
fun ChatMessage(message: String) {
    Text(
        text = message,
        style = TextStyle(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(8.dp)
    )
}

@Composable
fun BeautifulDayLyricsView() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .size(1000.dp)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(10) {
            Text(
                text = "The heart is a bloom\n" +
                        "Shoots up through the stony ground\n" +
                        "There's no room\n" +
                        "No space to rent in this town\n" +
                        "You're out of luck\n" +
                        "And the reason that you had to care\n" +
                        "The traffic is stuck\n" +
                        "And you're not moving anywhere\n" +
                        "You thought you'd found a friend\n" +
                        "To take you out of this place\n" +
                        "Someone you could lend a hand\n" +
                        "In return for grace\n" +
                        "It's a beautiful day\n" +
                        "Sky falls, you feel like\n" +
                        "It's a beautiful day\n" +
                        "Don't let it get away\n" +
                        "You're on the road\n" +
                        "But you've got no destination\n" +
                        "You're in the mud\n" +
                        "In the maze of her imagination\n" +
                        "You love this town\n" +
                        "Even if that doesn't ring true\n" +
                        "You've been all over\n" +
                        "And it's been all over you\n" +
                        "It's a beautiful day\n" +
                        "Don't let it get away\n" +
                        "It's a beautiful day\n" +
                        "Touch me, take me to that other place\n" +
                        "Teach me, I know I'm not a hopeless case\n" +
                        "See the world in green and blue\n" +
                        "See China right in front of you\n" +
                        "See the canyons broken by cloud\n" +
                        "See the tuna fleets clearing the sea out\n" +
                        "See the Bedouin fires at night\n" +
                        "See the oil fields at first light\n" +
                        "And see the bird with a leaf in her mouth\n" +
                        "After the flood all the colors came out\n" +
                        "It was a beautiful day\n" +
                        "Don't let it get away\n" +
                        "Beautiful day\n" +
                        "Touch me, take me to that other place\n" +
                        "Reach me, I know I'm not a hopeless case\n" +
                        "What you don't have, you don't need it now\n" +
                        "What you don't know, you can feel it somehow\n" +
                        "What you don't have, you don't need it now\n" +
                        "Don't need it now\n" +
                        "Was a beautiful day",
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewTabLayout() {
    TabLayout()
}
