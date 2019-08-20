object WorsheetPrueba {
	println("Hola Mundo")                     //> Hola Mundo
	val n = 50                                //> n  : Int = 50
	
	def numero (): String = if( n == 20)"El valor de K es 20" else "Valor no parametrizado"
                                                  //> numero: ()String
	
	numero()                                  //> res0: String = Valor no parametrizado
}