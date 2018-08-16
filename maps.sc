import scala.collection.mutable

object worksheet {

  // 1.

  val mapa = Map("pepito" -> 1, "elena" -> 2)
  mapa.keySet
  mapa.values

  mapa.get("pepito") // get finds wether a value is found or not,
  // in an object of type Option. Options specified that this value may
  // contain empty results: 'none'
  mapa.get("desconocido") // take a look at this result

  // you can avoid nones with the get function:
  mapa.get("pepito")
  // mapa("desconocido") // this one will throw an exception
  mapa.getOrElse("desconocido", "tipo no encontrado")


  // 2

  // map concatenation
  mapa + ("luis" -> 3, "beatriz" -> 4)  // remember maps are not mutable

  val mapa1 = Map(1 -> "BMW", 2 -> "Mercedes", 3 -> "Renault")
  val mapa2 = Map(2 -> "Toyota", 3 -> "Mini")

  mapa1 ++ mapa2 // as any set, you can merge maps with the '++' operator

  // mutable maps

  val mmap = mutable.Map(1 -> "Renault", 2 -> "BMW")
  mmap += (3 -> "Opel", 4 -> "Toyota")

  // you can add new elements in different ways
  mmap.put(5, "Ferrari")
  mmap

  mmap(6) = "Mustang"
  mmap

  mmap -= 2// and you can also delete elements at an specified position
}
