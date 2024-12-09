import java.util.Scanner

data class Proyecto(
    val nombre: String,
    val descripcion: String,
    val fechaInicio: String,
    val fechaFin: String
)

val proyectos = mutableListOf<Proyecto>()

fun agregarProyecto(nombre: String, descripcion: String, fechaInicio: String, fechaFin: String) {
    val proyecto = Proyecto(nombre, descripcion, fechaInicio, fechaFin)
    proyectos.add(proyecto)
    println("Proyecto agregado exitosamente.")
}

fun listarProyectos() {
    println("Lista de Proyectos:")
    proyectos.forEachIndexed { index, proyecto ->
        println("${index + 1}. ${proyecto.nombre} - ${proyecto.descripcion} (Inicio: ${proyecto.fechaInicio}, Fin: ${proyecto.fechaFin})")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("1. Agregar Proyecto")
        println("2. Listar Proyectos")
        println("3. Salir")
        print("Seleccione una opción: ")
        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()  // Consumir el salto de línea
                print("Nombre del Proyecto: ")
                val nombre = scanner.nextLine()
                print("Descripción del Proyecto: ")
                val descripcion = scanner.nextLine()
                print("Fecha de Inicio (YYYY-MM-DD): ")
                val fechaInicio = scanner.nextLine()
                print("Fecha de Fin (YYYY-MM-DD): ")
                val fechaFin = scanner.nextLine()
                agregarProyecto(nombre, descripcion, fechaInicio, fechaFin)
            }
            2 -> listarProyectos()
            3 -> {
                println("Saliendo...")
                return
            }
            else -> println("Opción no válida, por favor intente de nuevo.")
        }
    }
}
