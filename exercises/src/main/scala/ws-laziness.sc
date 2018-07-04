
import fpinscala.laziness.Stream

val stream = Stream(1 to 100000 : _*)
val list = stream.toList3
println (s"list length: ${list.length}")