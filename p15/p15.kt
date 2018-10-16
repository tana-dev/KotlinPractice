fun main(args: Array<String>){

	// ラムダ式
	// 関数型の変数 = { ラムダ式 }
	var minus1 = { x: Int, y: Int -> x - y }
	println(minus1(10,3))

	// ラムダ式(省略形)
	var minus2: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
	println(minus2(5,4))

	// ラムダ式(省略形)
	var minus3: (Int, Int) -> Int = { x, y -> x - y }
	println(minus3(11,3))

	// ラムダ式(暗黙の引数)
	var double1: (Int) -> Int = { it * 3 }
	println(double1(5))

	// ラムダ式((省略形)
	var double2: (Int) -> Int = { x -> x * 3 }
	println(double2(5))

	// 関数型を引数にもつ関数
	fun doLambda(x: Int, l: (Int)->Int) = l(x)
	println(doLambda(5, {it * 2}))

}
