fun main(args: Array<String>){


	// 型変換
	val str1 = "64"
	val intVal: Int = str1.toInt()
	println(intVal)

	// 型変換時のエラー防止のために、エラー時はNullに変換する
	val str2 = "Kotlin"
	val intValorNull: Int? = str2.toIntOrNull()
	println(intValorNull)

	// 数値から文字列に変換する
	val num = 128
	val intStr: String = num.toString()
	println(intStr)

	// 数値同士の変換
	val i: Int = 100
	val l: Long = i.toLong()
	println(l)






}
