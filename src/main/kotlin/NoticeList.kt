/* Этот класс содержит список предупреждений, которые выводятся юзеру, когда он что-то сделал не так*/
class NoticeList {
    companion object {
        fun printNonNumber() {
            // выводим на экран, когда юзер ввел НЕ число
            println("Нужно ввести число!")
            println("Попробуйте еще раз:")
        }

        fun printNonItem() {
            // выводим на экран, когда юзер ввел несуществующий пункт меню
            println("Такого пункта меню не существует!")
            println("Попробуйте еще раз:")
        }

        fun printEmptyArchiveName() {
            // выводим на экран, когда юзер забыл ввести название архива
            println("Название архива не может быть пустым!")
        }

        fun printEmptyNoteName() {
            // выводим на экран, когда юзер забыл ввести название заметки
            println("Название заметки не может быть пустым!")
        }

        fun printEmptyContent() {
            // выводим на экран, когда юзер забыл ввести содержимое (текст) заметки
            println("Заметка не может быть пустой!")
        }
    }
}