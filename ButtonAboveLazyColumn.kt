
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ButtonAboveLazyColumn(dogs: List<Dog>) {
    Column(modifier = Modifier.fillMaxSize()) {
        // Button composable
        Button(
            onClick = { /* Button click action */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Click Me")
        }

        // LazyColumn composable
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            items(dogs) { dog ->
                DogCard(dog)
            }
        }
    }
}
