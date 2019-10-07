package main.kotlin
import java.util.*
class Destino {

    private val random = Random()

    fun generarfatiga(): Int
    {
        return random.nextInt(5) + 1
    }

    fun generaroro(): Int
    {
        return random.nextInt(3) + 1
    }

}