fun main(args: Array<String>){

	// map 格納
	val fruits1: Map<String, Int> = mapOf("apple" to 1, "orange" to 2, "banana" to 3)
	println(fruits1)

	// 変更可能なmap 作成
	val fruits2: MutableMap<String, Int> = mutableMapOf("apple" to 1, "orange" to 2, "banana" to 3)

	// get
	println(fruits2.get("apple"))
	println(fruits2["apple"])

	// put
	fruits2.put("tanaka",4)
	println(fruits2)

	// remove
	fruits2.remove("tanaka",4)
	println(fruits2)
}
