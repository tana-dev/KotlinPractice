fun main(args: Array<String>){

	// 親クラス
	open class Person(val name: String) {
	}

	// 子クラス
	class Student(name: String, var degree: String): Person(name){
	}

	// インスタンス作成
	val student = Student("Tanaka", "Bachelor")
	println(student.name)
	println(student.degree)
}
