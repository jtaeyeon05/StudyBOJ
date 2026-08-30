fun main()=repeat(readln().toInt()){readln().split(" ").drop(1).map{it.toInt()}.run{println("%.3f%%".format(100f*filter{it>average()}.size/size))}}
