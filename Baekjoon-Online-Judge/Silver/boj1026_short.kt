val t={readln().split(" ").map{it.toInt()}.sorted()}
fun main()=readln().toInt().let{val (a,b)=t() to t().reversed()
println((0..it-1).sumOf{a[it]*b[it]})}