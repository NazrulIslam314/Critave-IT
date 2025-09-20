package watherSuggetion

fun suggestWhatToWear(temperature: Double): String {
    return when {
        temperature < 15 -> "It's cold! Wear a jacket or sweater."
        temperature in 15.0..25.0 -> "It's moderate. A light jacket or t-shirt would be perfect."
        temperature > 25 -> "It's hot! Wear a t-shirt and shorts."
        else -> "Invalid temperature"
    }
}