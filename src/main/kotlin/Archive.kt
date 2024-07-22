import java.util.Scanner

/*
Это класс архива.
У архива есть имя и список заметок, которые он содержит.
Умеет добавлять заметки в архив.
*/
class Archive(val name: String) {
    val notes = mutableListOf<Note>()

    fun createNote(){
        while(true){
            println("Введите название заметки или 0, чтобы выйти:")
            val nameNote: String = Scanner(System.`in`).nextLine().trim()
            if(nameNote.isNotEmpty()){
                if(nameNote == "0"){
                    break
                }
                else{
                    while (true) {
                        println("Введите текст заметки:")
                        val textNote: String = Scanner(System.`in`).nextLine().trim()
                        if (textNote.isNotEmpty()) {
                            val note: Note = Note(nameNote, textNote)
                            notes.add(note)
                            println("Заметка \"$nameNote\" успешно создана!")
                            break
                        }else{
                            NoticeList.printEmptyContent()
                            continue
                        }
                    }
                }
            }else{
                NoticeList.printEmptyNoteName()
                continue
            }
            break
        }
    }

    operator fun get(index: Int): Note {
        return  notes[index]
    }
}