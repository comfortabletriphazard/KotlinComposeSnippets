    @Composable
    private fun TopAppBar(titleText: String) {
        TopAppBar(
            title = {
                Text(text = titleText)
            },
            navigationIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            // Handle navigation icon click
                        }
                        .padding(8.dp)
                )
            },
            actions = {
                // Add actions here if needed
                IconButton(
                    onClick = {
                        // Handle action button click
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                }
            },
            elevation = AppBarDefaults.TopAppBarElevation
        )
    }
