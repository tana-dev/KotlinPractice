fun main(args: Array<String>){

	// 戻り値があるfun
	fun times(a: Int, b: Int): Int {
		return a * b
	}
	println(times(2,5))

	// 戻り値がないfun
	// 戻り値がない場合はUnitを使う
	fun printTimes(a: Int, b: Int): Unit {
		println("$a multiplied by $b is ${a*b}")
	}
	printTimes(2,5)

	// 引数の省略
	fun times1(a: Int, b: Int = 2) = a * b
	println(times1(2))
}
