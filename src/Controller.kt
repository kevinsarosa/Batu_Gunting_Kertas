class Controller() {
    fun mekanikGame(pemainPertama: String, pemainKedua: String, listener: CallBack) {
        var hasil = String
        if (pemainPertama.equals("batu", ignoreCase = true) && pemainKedua.equals("gunting", ignoreCase = true)
            || pemainPertama.equals("gunting", ignoreCase = true) && pemainKedua.equals(
                "kertas",
                ignoreCase = true
            )
            || pemainPertama.equals("kertas", ignoreCase = true) && pemainKedua.equals(
                "batu",
                ignoreCase = true
            )
        ) {
            println("pemain pertama menang")
        } else if (pemainKedua.equals("batu", ignoreCase = true) && pemainPertama.equals(
                "gunting",
                ignoreCase = true
            )
            || pemainKedua.equals("gunting", ignoreCase = true) && pemainPertama.equals(
                "kertas",
                ignoreCase = true
            )
            || pemainKedua.equals("kertas", ignoreCase = true) && pemainPertama.equals(
                "batu",
                ignoreCase = true
            )
        ) {
            println("pemain kedua menang")
        } else {
            println("Seri")
        }
    }
}