// インターフェイス
interface Pet {
	fun eat()
	fun showName() = println("I'm Pet")
}

fun main(args: Array<String>){

	// 子クラス
	class Cat : Pet{
		override fun eat() = println("I'm eating")
	}

	// インスタンス作成
	val zizi = Cat()
	zizi.eat()
}
