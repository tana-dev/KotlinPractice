fun main(args: Array<String>){

	// 通常
	val a = 4
	when(a){
		1      ->   println("a == 1")
		2,3    ->   println("a == 2 or a == 3")
		else   ->   println("otherwise")
	}

	// 範囲マッチ
	val b = 100
	when(b){
		in 1..10     -> println("b is in the range")
		!in 10..20   -> println("b is outside the range")
		else         -> println("otherwise")
	}

	// 値を受け取る
	val c = 3
	val d = when(c){
		1    -> "c == 1"
		2,3  -> "c == 2 or c == 3"
		else -> "otherwise"
	}
	println(d)

	// when式による型チェック
	val e: Any = 11
	//val e: Any = "kotlin"
	when(e){
		is Int    -> println(e * e)
		is String -> println(e.toUpperCase())
	}

	// if式の代わりにwhen式を使う
	val f: Int? = 1 
	val text = "Kotlin"
	when {

		//
		f != null && text.startsWith("Kot") ->
			println("starts whth a prefix 'Kot'")

		//
		f == null && text.endsWith("lin") -> println("ends with a suffix 'lin'")

		// その他
		else -> println("otherwise")
	}
}
