fun a()=readln().toInt()
fun main()=print(if(a()==(1..a()).sumOf{readln().split(" ").let{it[0].toInt()*it[1].toInt()}})"Yes" else "No")