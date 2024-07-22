import java.util.Scanner

fun main() {

    var userInput: Int = 0
    val archiveList = ArchiveList()
    val menuArchiveList = Menu<ArchiveList>()

    while(true){
        val exitNumArchive: Int = menuArchiveList.printMenu(archiveList)
        userInput = menuArchiveList.readInputMenu()
        when(userInput){
            -1 -> continue
            0 -> {
                archiveList.createArchive()
                continue
            }
            exitNumArchive -> break
            else -> {0
                if(userInput - 1 in archiveList.archives.indices) {
                    val archive: Archive = archiveList[userInput - 1]
                    val menuNoteList = Menu<Archive>()
                    while (true) {
                        val exitNumNote: Int = menuNoteList.printMenu(archive)
                        userInput = menuNoteList.readInputMenu()
                        when (userInput) {
                            -1 -> continue
                            0 -> {
                                archive.createNote()
                                continue
                            }
                            exitNumNote -> break
                            else -> {
                                if (userInput - 1 in archive.notes.indices) {
                                    val note: Note = archive[userInput - 1]
                                    note.printNote()
                                    while(true){
                                        println("Введите любой символ, чтобы закрыть заметку")
                                        val closeNote: String = Scanner(System.`in`).nextLine().trim()
                                        if(closeNote.isNotEmpty()){
                                           break
                                        }else{
                                            NoticeList.printNonItem()
                                            continue
                                        }
                                    }
                                }else{
                                    NoticeList.printNonItem()
                                    continue
                                }
                            }
                        }
                    }
                }else{
                    NoticeList.printNonItem()
                    continue
                }
            }
        }
    }
}