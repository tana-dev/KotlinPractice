fun main(args: Array<String>){

	//
	var item: List<Int> = listOf(1,2,3)
	println(item)

	//
	var items: List<String> = listOf("First","Second","Thard")
	println(items.get(0))
	println(items[1])
	println(items.size)

	//
	val numbers: MutableList<Int> = mutableListOf(2,5,6)
	println(numbers)
	numbers.add(4)
	println(numbers)
	numbers.remove(4)
	println(numbers)
}
