fun main()=repeat(readln().toInt()){val(a,b)=readln().split(" ").map{it.toInt()}
println("You get ${a/b} piece(s) and your dad gets ${a%b} piece(s).")}