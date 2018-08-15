object worksheet {

  // 1
  var k = 0
  while (k < 20) {
    println(s"k vale ${k}, el siguiente es ${k + 1}.")
    k = k + 1
  }

  // 2
  k = 0;
  do {
    println(s"k vale ${k}.")
    k = k + 1;
  } while (k < 20)
}