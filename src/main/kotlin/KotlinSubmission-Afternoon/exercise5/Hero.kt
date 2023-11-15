package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        val repeat = 1
        checkHealth()
        println("$name sedang berjalan $repeat kali")
        health -= 1
    }

    fun lari() {
        val repeat = 3
        checkHealth()
        println("$name sedang berlari $repeat kali")
        health -= 2
    }

    fun makan() {
        val repeat = 2
        checkHealth()
        println("$name sedang makan $repeat kali")
        health += 2
    }

    fun minum() {
        val repeat = 5
        checkHealth()
        println("$name sedang minum $repeat kali")
        health += 2
    }

    fun lompat() {
        val repeat = 4
        checkHealth()
        println("$name sedang lompat $repeat kali")
        health -= 2
    }

    fun duduk() {
        val repeat = 1
        checkHealth()
        println("$name sedang duduk $repeat kali")
        health += 1
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}

