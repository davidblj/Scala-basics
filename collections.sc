import scala.collection.mutable
import scala.collection.immutable

object worksheet {

  // 2 types of collections: mutable and inmutable
  // a collection works differently, as "val" is not the collection itself
  // but a reference that cannot be change: Scala.collection.inmutable and
  // Scala.collection.mutable. The inmutable package is imported by default.

  // collections are born from a thrait: Traversable. Think of a thrait as a
  // java interface. Traversable have a child thrait: Iterable. You use iterables
  // to loop collections. And then you have Sets, Map, Seq. Seq have child thraits:
  // IndexedSeq, LinearSeq (Queues)


  // 1. arrays

  var frutas = Array("Manzana", "Naranja", "Albaricoque", 5) // type any
  var variableTypes = Array(true, 5)  // type anyVal

  frutas.apply(0) // get element at x position (weird, isn't it ?).
  frutas(1) // apply is not necessary though, its a 'default'

  frutas.length // functions without params can be called without parantesis
  frutas.isEmpty
  frutas.nonEmpty

  frutas.indexOf("Manzana")
  frutas indexOf "Manzana" // functions with 1 parameter can be also called without parantesis


  // 2. maps

  val numeros = List(4,8,15,16,23,42)
  numeros.map { x => x * 2}

  var coches = List("BMW", "Mercedes", "Seat")
  coches.map { coche => coche.toUpperCase }

  coches = List("BMW", "Mercedes", "Seat")
  coches.map { _.toUpperCase } // you can also use a dash to call each element


  // 3. lists and flatten

  var lista = List(List(1,2), List(2,3,5), List(6,7,8))
  lista.map {(x: List[Int]) => x.map { n => n * 2 }}.flatten // flatten simplifies a list

  lista.flatMap {(x: List[Int]) => x.map { n => n * 2 }} // or a simplified version of flatten. flatten
  // do needs a list of lists, but flatmap doesn't.

  var lista2 = List(1,2,3,4,5)
  lista2.flatMap { x => List(x, x*2)} // a flatmap applies a function to each element

  val bmw = "BMW" // an string is also a list of chars
  bmw(0)

  coches = List("BMW", "Mercedes", "Seat")
  coches.flatMap( _.toUpperCase()) // each String is also a list and the final result is
  // similar to that of the flatten example


  // 4. sets

  val set = Set(1,2,3,4,4,4) // you cant repeat values with sets
  set.contains(3) // you can look for values with "contains"
  set contains 3

  set + 5 // and you can add elements into a set with a '+' sign
  set // but sets are inmutable by default

  set ++ Set(5,6,7) // you can add sets
  set -- Set(1,2,3) // you can remove elements from a set

  set intersect Set(3,4) // you can make intersections
  set & Set(3,4) // intersection equivalent

  set union Set(5,6) // you can make unions
  set | Set(5,6) // union equivalent


  // 4.1 mutable sets

  val mset = mutable.Set(1,2,3)

  mset + 4 // the '+' operator sign don't modify the set itself, even if its mutable
  mset

  mset += 4 // the '+=' do modifies that set
  mset

  // we also have functions that can filter values. 'filter' is not mutable, but 'retain' is
  mset filter { x => x % 2 == 0 }
  mset

  mset retain { x => x % 2 == 0 }
  mset


  // 4.2 inmutable sets

  val sset = immutable.SortedSet(3,1,9,0)
  val unsortedSet = Set(1,4,3,8,5)

  var sortingOperation = Ordering.fromLessThan[Int]({ (m, n) => m > n})
  sortingOperation = Ordering.fromLessThan[Int]( _ > _ )
}