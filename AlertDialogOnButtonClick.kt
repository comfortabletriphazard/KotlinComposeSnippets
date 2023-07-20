@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        var textFieldValue by remember { mutableStateOf("") }
        val scaffoldState = rememberScaffoldState()

        val openDialog = remember { mutableStateOf(false) }

        MyAppContent(
            textFieldValue = textFieldValue,
            onTextFieldValueChanged = { textFieldValue = it },
            onSendClicked = {
                // Handle send button click here
                // For demonstration purposes, let's show the dialog
                openDialog.value = true
            },
            scaffoldState = scaffoldState
        )

        if (openDialog.value) {
            AlertDialog(
                onDismissRequest = { openDialog.value = false },
                title = { Text("Alert Dialog") },
                text = { Text("This is an example of an AlertDialog.") },
                confirmButton = {
                    TextButton(
                        onClick = {
                            // Handle confirmation here, if needed
                            openDialog.value = false
                        }
                    ) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            // Handle dismiss/cancellation here, if needed
                            openDialog.value = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
    }
}

@Composable
fun MyAppContent(
    textFieldValue: String,
    onTextFieldValueChanged: (String) -> Unit,
    onSendClicked: () -> Unit,
    scaffoldState: ScaffoldState
) {
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text(text = "My App") },
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Your UI components go here
            BasicTextField(
                value = textFieldValue,
                onValueChange = onTextFieldValueChanged,
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Send),
                keyboardActions = KeyboardActions(onSend = { onSendClicked() })
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    onSendClicked()
                }
            ) {
                Text("Show Dialog")
            }
        }
    }
