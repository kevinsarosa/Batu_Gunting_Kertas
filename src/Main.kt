class Main() {
    companion object : CallBack {
        @JvmStatic
        fun main(args: Array<String>) {
            var curIndexA = 0
            var pemainPertama: String
                println("pemain pertama pilih, batu, gunting, kertas :")

                var inputA = readLine().toString()
                pemainPertama = inputA
                curIndexA++


            var pemainKedua: String
            println("pemain kedua pilih, batu, gunting, kertas :")

            var inputB = readLine().toString()
            pemainKedua = inputB
            var controller = Controller()
            controller.mekanikGame(pemainPertama, pemainKedua,this)
        }

        override fun nilaiBalik(hasil: String) {

        }
    }
}