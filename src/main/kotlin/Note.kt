/*
Класс одной заметки.
Содержит имя и текст заметки.
Умеет их выводить на экран
*/
class Note(val name: String, val text: String) {
    fun printNote() {
        println("Заметка: $name")
        println("Текст заметки:\n$text\n\n")
    }
}