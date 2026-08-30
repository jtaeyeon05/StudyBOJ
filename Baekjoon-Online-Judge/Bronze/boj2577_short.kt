fun r()=readln().toInt()
fun main()=(r()*r()*r()).toString().run{repeat(10){a->println(count{a+48==it.code})}}
