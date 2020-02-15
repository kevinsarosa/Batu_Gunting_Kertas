class Main() {
    companion object : CallBack {
        @JvmStatic
        fun main(args: Array<String>) {
            println("=============================")
            println("==GameSuit Terminal Version==")
            println("=============================")

            println("Pemain 1 Masukan Nama:  ")
            var pemain1 = readLine()!!.toString()
            println("Pemain 1 adalah $pemain1")
            println("=============================")

            println("Pemain 2 masukan nama: ")
            var pemain2 = readLine()!!.toString()
            println("Pemain 2 adalah $pemain2")
            println("=============================")

            var pemainPertama: String
            println("$pemain1 pilih, batu, gunting, kertas :")

            var inputA = readLine().toString()
            pemainPertama = inputA


            var pemainKedua: String
            println("$pemain2 pilih, batu, gunting, kertas :")

            var inputB = readLine().toString()
            pemainKedua = inputB
            var controller = Controller()
            controller.mekanikGame(pemain1, pemain2, pemainPertama, pemainKedua, this)
        }

        override fun nilaiBalik(hasil: String) {

        }
    }
}