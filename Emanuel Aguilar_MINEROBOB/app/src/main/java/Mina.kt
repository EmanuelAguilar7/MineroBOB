package main.kotlin

class Mina(val nombre: String, var oro: Int, var fatiga: Int, var sed: Int) {

    fun minaoro()
    {
        if(oro < 3 && fatiga < 10 && sed < 5) {

            println("\n$nombre: De regreso a la mina de oro.")

            var temp: Int
            while (oro < 3 && fatiga < 10 && sed < 5) {
                Thread.sleep(1000)
                temp = oro
                oro = mas_oro(oro)
                println("$nombre: Ha recolectado ${oro - temp} pepita de oro. Oro actual: $oro")
                fatiga = mas_fatiga(fatiga)
                sed = mas_sed(sed)
            }
        } else
        {
            Thread.sleep(1000)
            println("Me voy de la mina de oro con mis bolsillos llenos.")
        }

    }

    private fun mas_oro (oro: Int): Int
    {
        return oro + 1
    }

    private fun mas_fatiga (fatiga: Int): Int
    {
        return fatiga + 2
    }

    private fun mas_sed (sed: Int): Int
    {
        return sed + 1
    }

}