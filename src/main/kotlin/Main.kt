package org.example

import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val filePath = "src\\main\\resources\\Puzzle_02.txt"
    val fileContents = readFileIntoArray(filePath)

    println("Processando com 2 entradas")
    duasentradas(fileContents)
    println("==================================================================================")
    println("Processando com 3 entradas")
    tresentradas(fileContents)

}

fun duasentradas(puzzle: Array<String>) {
    for (valor1 in puzzle) {
        for (valor2 in puzzle) {
            if (valor1.toInt() + valor2.toInt() == 2020) {
                print("Valor 1: $valor1  => ")
                print("Valor 2: $valor2  ===> ")
                println("Resultado : " + valor1.toInt() * valor2.toInt())
            }
        }
    }
}

fun tresentradas(puzzle: Array<String>) {
    for (valor1 in puzzle) {
        for (valor2 in puzzle) {
            for (valor3 in puzzle) {
                if (valor1.toInt() + valor2.toInt() + valor3.toInt() == 2020) {
                    print("Valor 1: $valor1  => ")
                    print("Valor 2: $valor2  => ")
                    print("Valor 3: $valor2  ===>  ")
                    println("resultado : " + valor1.toInt() * valor2.toInt() * valor3.toInt())
                }
            }
        }
    }
}



fun readFileIntoArray(filePath: String): Array<String> {
    val file = File(filePath)
    return file.readLines().toTypedArray()
}