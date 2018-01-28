fun main(args : Array<String>) {
    val language = if (args.size == 0) "PL" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "ES" -> "¡Hola!"
        "RU" -> "Привет!"
        "FR" -> "Salut!"
        "PL" -> "Siema!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}