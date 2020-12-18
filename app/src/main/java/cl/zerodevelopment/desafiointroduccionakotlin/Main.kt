package cl.zerodevelopment.desafiointroduccionakotlin

/*
2. Crear archivo “Main.kt” con la función main. x

 */
fun main() {
    // 3. Imprimir “Mi nombre es: {Nombre del alumno}.x
    var nombreAlumno = "Cristian Saavedra"
    println("Mi nombre es $nombreAlumno")

    //4. Declarar 3 variables numéricas con los valores “10”, “20” y “30”.x
    //5. Imprimir la suma de las 3 variables.x
    val num1 = 10
    val num2 = 20
    val num3 = 30

    var resultado = num1 + num2 + num3
    println("$num1 + $num2 + $num3 = $resultado")

    //6. Declarar 1 variable String y otra variable Char.

    var stringDesafio: String
    var charDesafio: Char
    // 7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
    stringDesafio = "Arataka Reigen"
    charDesafio = 'A'

    //8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable
    //char a otro valor distinto.

    println("Largo de String " + stringDesafio.length)
    charDesafio = 'B'

    //9. Declarar una variable de tipo Float de forma explícita.

    var floatDesafio: Float

    //10. Asignar un valor a la variable Float.
    floatDesafio = 25F

    //11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
    val byteMaximo = Byte.MAX_VALUE
    println("Valor maximo Byte $byteMaximo")
    val shortMaximo = Short.MAX_VALUE
    println("Valor maximo Short $shortMaximo")

    //12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
    val intMinimo = Int.MIN_VALUE
    println("Valor minimo Int $intMinimo")
    val longMinimo = Long.MIN_VALUE
    println("Valor minimo Long $longMinimo")

    //13. Declarar una variable Boolean con true o false e imprimir su valor.

    var booleanDesafio = true
    println("El valor de boolean es $booleanDesafio")

    //16. Desde la función main llamar a estas dos funciones de forma correcta.
    imprimiendoParametros("paralelepipedo", "romboide")
    obtieneIVA(47950.0)
}

//14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y
//este imprime el total de caracteres de los dos parámetros.
fun imprimiendoParametros(palabra1: String, palabra2: String) {
    var valor1 = palabra1.length
    var valor2 = palabra2.length
    var suma = valor1 + valor2
    println("El valor de la suma de caracteres de la palabra $palabra1 y $palabra2 es igual a $suma")
}

//15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
fun obtieneIVA(valorNeto: Double) {
    val valorIva = 0.19
    var iva = valorNeto * valorIva
    println("El iva del importe Iva incluido de $valorNeto pesos corresponde a $iva pesos")

}