package main.kotlin

class Banco(val nombre: String, var oro: Int, var banco: Int) {
    fun depositarOro ()
    {
        Thread.sleep(1000)
        println("\n$nombre: Voy para el banco, sí señor")
        banco += oro
        Thread.sleep(1000)
        println("$nombre: Depositando oro en el banco. Total de oro ahorrado: $banco")
        oro = 0

    }
}