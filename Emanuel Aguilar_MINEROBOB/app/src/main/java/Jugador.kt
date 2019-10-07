package main.kotlin

class Jugador(val name: String, var state: StateType): State() {

    fun show ()
    {
        println("$name: tiene $gold en oro, $fatigue en cansancio y $thirst de sed. Ahorrado en el banco $count")
    }

}