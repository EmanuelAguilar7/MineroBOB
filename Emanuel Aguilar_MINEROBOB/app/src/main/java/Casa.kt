package main.kotlin

class Casa (val nombre: String, var fatiga: Int) {

    fun dormir ()
    {
        Thread.sleep(1000)
        println("\n$nombre: Me siento muy cansado. Iré a descansar")
        Thread.sleep(1000)
        println("$nombre: De camino a mi hogar dulce hogar.")
        Thread.sleep(1000)
        println("$nombre: Hogar dulce hogar.")
        Thread.sleep(1000)
        print("$nombre: ")
        for(num in 0..4)
        {

            if(num == 0)
            {
                print("Zzzzz")
                Thread.sleep(800)
            } else
            {
                print("zzzzz")
                Thread.sleep(800)
            }
        }
        print("\n")
        fatiga = 0
    }

}