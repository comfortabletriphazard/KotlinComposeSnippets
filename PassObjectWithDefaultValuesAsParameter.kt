
//Step 1 - set up your object
//i.e product == productName, cost = productCost

// Create immutable instances before passing to ProductDetails
                val immutableProductDetails = ProductDetails(
                    product = productName,
                    cost = itemCost
                )


                
// Step 2 - Create function that accepts the object - do this by using the variable name, in this case it is 'immutableProductDetails'
//See line 18 - variable: Function set up as parameter
//Parameter called and used on lines 25 and 26

@Composable
fun ProductDetails(
    immutableProductDetails: ProductDetails // Defines parameter as immutable so values cannot be changed after stored 
                                    //i.e in a list, when you would not want them to change after submission
) {
    // Use immutableProductDetails in the function body

  //You can then prefix the object to a variable name so when it is passed in, it is placed correctly.
    // For example:
    Text(text = "Item Name: ${immutableProductDetails.productName}")
    Text(text = "Cost: ${immutableProductDetails.cost}")
}



//Step 3 - Call the function with the object in the parameter wherever needed
                ProductDetails(immutableProductDetails) // Passing the immutable instance


