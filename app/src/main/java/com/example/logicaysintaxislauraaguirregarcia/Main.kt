fun main(){
    //Variables y Tipos
    val numeroInt : Int = 3;
    val numeroDouble : Double = 1998.3;
    val nombre : String = "Laura";
    val datoBooleano : Boolean = true;
    val caracter : Char = 'L';

    //Valores e interpolación
    println("Numero tipo Int: $numeroInt");
    println("Numero tipo Double: $numeroDouble");
    println("Dato tipo String: $nombre");
    println("Dato booleano: $datoBooleano");
    println("Caracter: $caracter");

    //Cuando usar val y var:
    //val se usa cuando la información o el dato no va a cambiar
    val ficha : String = "2994282";
    println("El numero de la ficha es: $ficha");

    //var se usa cuando la información puede variar
    println("Ingresa tu nombre");
    var nombre1 = readLine();
    println("Su nombre es: $nombre1");

    //Conversión de tipos
    println("Ingresa una temperatura");
    var celsius : Double = readLine()!!.toDouble();
    fun convertirTemperatura(celsius : Double) : Double = (celsius*9/5)+32;

    println("La conversion es: " + convertirTemperatura(celsius) + " Fahrenheit");

    //Expresiones y Condiciones
    println("Ingresa un numero")
    var numero : Int = readLine()!!.toInt();
    fun esPar(numero : Int) : Boolean{
        return numero % 2 == 0;
    }
    if(esPar(numero)){
        println("El numero $numero es par");
    }else{
        println("El numero $numero es impar")
    }

    //Máximo de 3 numeros
    println("Ingresa tres numeros por favor");
    var a : Int = readLine()!!.toInt();
    var b : Int = readLine()!!.toInt();
    var c : Int = readLine()!!.toInt();
    fun mayorDeTres(a : Int, b : Int, c : Int) : String{
        return if (a>b && a>c){
            return "El numero mayor es: $a"
        }else if (b>a && b>c) {
            return "El numero mayor es: $b"
        } else {
            "El numero mayor es: $c"
        }
    }
    println(mayorDeTres(a,b,c));

    //Funcion con when
    println("Ingresa tu nota");
    var nota : Int = readLine()!!.toInt();
    fun clasificarNota(nota : Int) : String{
        return when (nota){
            in 90..100 -> "Excelente"
            in 70..89 -> "Buena"
            in 50..69 -> "Regular"
            in 0..50 -> "Insuficiente"
            else -> {"Ingresa una nota dentro del rango"}
        }
    }
    println(clasificarNota(nota));

    val nombres = listOf("Laura","Brayan","Alejandro","Santiago","Pepe")
    fun mostrarNombres(list: List<String>){
        for (i in 0 until nombres.size){
            val nombre = nombres[i];
            println(nombre.uppercase());
        }
    }
    mostrarNombres(nombres);
}