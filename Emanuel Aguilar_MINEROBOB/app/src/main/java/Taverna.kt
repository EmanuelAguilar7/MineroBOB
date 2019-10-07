package main.kotlin

class Taverna(val nombre: String, var sed: Int) {

    fun beber()
    {
        Thread.sleep(1000)
        println("\n$nombre: Hombre, estoy sediento. Me dirijo a la taberna.")

        val temp = sed
        while (sed != 0 )
        {
            sed -= 5
        }
        if(sed < 0)
        {
            sed = 0
        }
        Thread.sleep(1000)
        println("$nombre: Minero Bob: Oh! Esto sí que está muy bueno, ha calmado mi sed.")
    }

}