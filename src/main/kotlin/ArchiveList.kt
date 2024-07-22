import java.util.Scanner

/*
Это класс список архивов.
Он содержит в себе архивы в виде списка
Умеет добавлять архивы в список.
*/
class ArchiveList {
    val archives = mutableListOf<Archive>()

    fun createArchive(){
        while(true){
            println("Введите название архива или 0, чтобы выйти:")
            val nameArchive: String = Scanner(System.`in`).nextLine().trim()
            if(nameArchive.isNotEmpty()){
                if(nameArchive == "0"){
                    break
                }else {
                    val archive = Archive(nameArchive)
                    archives.add(archive)
                    println("Архив \"$nameArchive\" успешно создан!")
                    break
                }
            }else{
                NoticeList.printEmptyArchiveName()
                continue
            }
        }
    }

    operator fun get(index: Int): Archive {
        return  archives[index]
    }
}