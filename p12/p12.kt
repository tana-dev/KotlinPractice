fun main(args: Array<String>){

	// セット
	var strings1: Set<String> = setOf("A","B","C")
	println(strings1)

	// セット
	var strings2: MutableSet<String> = mutableSetOf("x","y","z")
	println(strings2)

	strings2.add("A")
	println(strings2)

	strings2.remove("x")
	println(strings2)

	strings2.add("y")
	println(strings2)

}
