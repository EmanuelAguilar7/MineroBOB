package main.kotlin

enum class StateType {
    MINA, DORMIR , BEBER, DEPOSITAR, NADA
}

open class State {
    private val random = Destino()
    var oro = random.generaroro()
    var fatiga = random.generarfatiga()
    var sed = 0
    var count = 0

    fun action(name: String, state: StateType) {
        when (state)
        {
            StateType.MINA -> mining(name)

            StateType.DEPOSITAR -> depositing(name)

            StateType.DORMIR -> sleeping(name)

            StateType.BEBER -> drinking(name)
        }
    }

    private fun mining(name: String)
    {
        val mina = Mina(name, oro, fatiga, sed)
        mina.minaoro()
        oro = mina.oro
        fatiga = mina.fatiga
        sed = mina.sed

    }

    private fun depositing(nombre: String)
    {
        val banco = Banco(nombre, oro, count)
        banco.depositarOro()
        oro = banco.oro
        count = banco.banco

    }

    private fun sleeping (nombre: String)
    {
        val casa = Casa(nombre, fatiga)
        casa.dormir()
        fatiga = casa.fatiga

    }

    private fun drinking (nombre: String)
    {
        val b = Taverna (nombre, sed)
        b.beber()
        sed = b.sed

    }
}