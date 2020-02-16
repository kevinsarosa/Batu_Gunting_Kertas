class Controller() {
    fun mekanikGame(pemain1: String, pemain2: String, pemainPertama: String, pemainKedua: String, listener: CallBack) {
        var hasil =
            if (pemainPertama.equals("batu") && pemainKedua.equals("gunting")
                || pemainPertama.equals("gunting") && pemainKedua.equals("kertas")
                || pemainPertama.equals("kertas") && pemainKedua.equals("batu")) {
                println("$pemain1 menang")


            } else if (pemainKedua.equals("batu") && pemainPertama.equals("gunting")
                || pemainKedua.equals("gunting") && pemainPertama.equals("kertas")
                || pemainKedua.equals("kertas") && pemainPertama.equals("batu")) {
                println("$pemain2 menang")


            } else {
                println("Seri")
            }
    }
}