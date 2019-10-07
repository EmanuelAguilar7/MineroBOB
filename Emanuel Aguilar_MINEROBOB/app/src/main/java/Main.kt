package main.kotlin

fun main(args: Array<String>) {


    val end = true


    val bob = Jugador("Minero Bob", StateType.NADA)
    bob.show()

    while (end) {
        if (bob.oro < 3 && bob.fatiga < 10 && bob.sed < 5) {
            bob.action(bob.name, StateType.MINA)
            bob.show()

            if (bob.sed >= 5)
            {
                bob.action(bob.name, StateType.BEBER)
                bob.show()
            }

            if (bob.fatiga >=10)
            {
                bob.action(bob.name, StateType.DORMIR)
                bob.show()
            }
        }

        if(bob.oro == 3)
        {
            bob.action(bob.name, StateType.DEPOSITAR)

            if (bob.fatiga >= 8)
            {
                bob.action(bob.name, StateType.DORMIR)
                bob.show()
            }
        }

        Thread.sleep(1000)

    }
}
