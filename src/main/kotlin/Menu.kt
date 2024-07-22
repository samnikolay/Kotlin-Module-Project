import java.util.Scanner

/*
Это класс менюшек.
В него передается лист архивов или лист заметок
В зависимости от передалнного класса:
1) Выводится предложение создать архив, потом список существующих архивов, потом Выход.
2) Выводится предложение создать заметку, потом список существуюзих заметок, потом Назад
*/
class Menu<T> {
    fun printMenu(list: T): Int {
        var exitNum: Int = 0
        if (list is ArchiveList) {
            println("0. Создать архив")
            if(list.archives.size > 0){
                list.archives.forEachIndexed { index, archive ->
                    println("${index + 1}. ${archive.name}")
                }
            }
            exitNum = list.archives.size + 1
            println("$exitNum Выход")
        } else if (list is Archive) {
            println("0. Создать заметку")
            if(list.notes.size > 0){
                list.notes.forEachIndexed { index, note ->
                    println("${index + 1}. ${note.name}")
                }
            }
            exitNum = list.notes.size + 1
            println("$exitNum Назад")
        }

        return exitNum
    }

    fun readInputMenu(): Int {
        val scanner = Scanner(System.`in`)
        if (scanner.hasNextInt()){
            val input = scanner.nextInt()
            println(input) // пока что для проверки введеного значения
            return input
        }else{
            NoticeList.printNonNumber()
            return -1
        }
    }
}
