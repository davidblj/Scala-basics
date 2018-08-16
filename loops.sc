object worksheet {

  // 1
  var k = 0
  while (k < 20) {
    println(s"k vale ${k}, el siguiente es ${k + 1}.")
    k = k + 1
  }

  // 2
  k = 0
  do {
    println(s"k vale ${k}.")
    k = k + 1
  } while (k < 20)

  // 3

  val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure", "Swift")

  // you can loop through sequences with a "for each" or with an standard loop

  lenguajes.foreach(l => println(s"$l me asusta mucho."))

  for (l <- lenguajes) {
    println(s"$l me parece un buen lenguaje.")
  }
}