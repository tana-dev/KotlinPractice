fun main(args: Array<String>){

	// 配列の要素を処理する
	val array = arrayOf(1,2,3,100,1000)
	for (a in array) println(a)
	println("")

	// 配列の添字を使ったfor文
	val a = arrayOf(1,2,3,10,100,10000)
	for (i in array.indices ) {
		println("a[" + i + "]=" + a[i] + " ")
	}
	println("")

	// 範囲式
	for (i in 1..4) println(i)
	println("")
	for (i in 4 downTo 1) println(i)
	println("")
	for (i in 0..9 step 2) println(i)
}
