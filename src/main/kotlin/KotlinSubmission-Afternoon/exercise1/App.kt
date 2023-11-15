package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namDepan: String = "Steffany"
    val namaBelakang: String = "Wu"
    val umur: Int = 20
    val status: Boolean = true

    println("nama depan : $namDepan")
    println("nama belakang : $namaBelakang")
    println("umur : $umur")
    println("status : $status")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("group id : $groupId")
    println("group member : $groupMember")
    println("session : $session")

    return "$groupId, $groupMember, $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val unlimitedInnovation = listOf("Ardini", "Rizky", "Yoga", "Afif","Steffany", "Irfan", "Dedi", "Alif", "Alan", "Rafi")
    return listOf(unlimitedInnovation[4])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val totalmentor = arrayOf<String>("kak jovian", "kak iman")
    val countOfGroup = arrayOf<String>("Ardini", "Rizky", "Yoga", "Afif","Steffany", "Irfan", "Dedi", "Alif", "Alan", "Rafi")

    val totalSemua = totalmentor.count() + countOfGroup.count()
    return totalSemua
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val gorupId = "Unlimited Innovation"
    val groupMember = listOf("Ardini", "Rizky", "Yoga", "Afif","Steffany", "Irfan", "Dedi", "Alif", "Alan", "Rafi")
    val session = "Afternoon"
    groupDetail(gorupId, groupMember, session)

}