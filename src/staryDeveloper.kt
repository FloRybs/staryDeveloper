fun main(args : Array<String>) {
    val language = if (args.size == 0) "RU" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "ES" -> "¡Hola!"
        "RU" -> "Привет!"
        "FR" -> "Salut!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}