fun main(args: Array<String>){

	// クラス
	class Dog(val name: String, val age: Int) {

		// initialize
		init {
			println("The dog's name is ${name}")
		}

		// func
		fun getAgeAfterYears(i: Int): Unit{
			println(" The dog's age will be ${this.age + i} old after ${i} years")
		}
	}

	// インスタンス作成
	val dog = Dog("pochi",10)

	// プロパティ取得
	println(dog.name)
	println(dog.age)

	// ファンクション実行
	dog.getAgeAfterYears(12)




	// クラス
	class Dog2() {

		// プロパティ定義
		lateinit var name: String
		lateinit var age: Int

		// initialize
		init {
			println("The dog's name is ${name}")
		}

		// func
		fun getAgeAfterYears(i: Int): Unit{
			println(" The dog's age will be ${this.age + i} old after ${i} years")
		}
	}

	// インスタンス作成
	val dog2 = Dog2("pochi",10)

	// プロパティ取得
	println(dog2.name)
	println(dog2.age)

	// ファンクション実行
	dog2.getAgeAfterYears(12)
}
