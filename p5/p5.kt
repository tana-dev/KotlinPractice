fun main(args: Array<String>){

	// 以下はだめ
	// なぜならnull非許容型の変数だから
	//var text: String = null

	// 以下はOK
	var text: String? = null
	println(text)

}
