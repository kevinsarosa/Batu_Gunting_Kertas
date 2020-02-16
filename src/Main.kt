class Main() {
    companion object : CallBack {
        @JvmStatic
        fun main(args: Array<String>) {
            println("=============================")
            println("==GameSuit Terminal Version==")
            println("=============================")
            println("Menu ")
            println("1. Main 2 Player")
            println("2. Exit")
            print("Masukan Pilihan: ")
            var input = readLine()!!.toInt()

            when (input) {
                1 -> {
                    println("Pemain 1 Masukan Nama:  ")
                    var pemain1 = readLine()!!.toString()
                    println("Pemain 1 adalah $pemain1")
                    println("=============================")

                    println("Pemain 2 masukan nama: ")
                    var pemain2 = readLine()!!.toString()
                    println("Pemain 2 adalah $pemain2")
                    println("=============================")


                    println("$pemain1 pilih, batu, gunting, kertas :")
                    var pemainPertama = readLine().toString().toLowerCase().trim()


                    println("$pemain2 pilih, batu, gunting, kertas :")
                    var pemainKedua = readLine().toString().toLowerCase().trim()


                    var controller = Controller()
                    controller.mekanikGame(pemain1, pemain2, pemainPertama, pemainKedua, this)
                }
                2 -> {
                }
            }
        }


        override fun nilaiBalik(hasil: String) {

        }
    }
}