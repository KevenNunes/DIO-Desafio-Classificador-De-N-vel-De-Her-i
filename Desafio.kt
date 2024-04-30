fun main() {
	var nomeHeroi = "Kleber"
    var quantidadeXp = 3000
    
    var nivel = when(quantidadeXp) {

      in 0..1000 -> "Ferro"
      in 1001..2000 -> "Bronze"
      in 2001..5000 -> "Prata"
      in 5001..7000 -> "Ouro"
      in 7001..8000 -> "Platina"
      in 8001..9000 -> "Ascendente"
      in 9001..10000 -> "Imortal"
      else -> "Radiante"
	}
    
    println("O Herói ${nomeHeroi} está no nível ${nivel}")
 
}
