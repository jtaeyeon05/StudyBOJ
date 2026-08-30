fun main()=repeat(readln().toInt()){println(readln().split("X").sumOf{it.length.let{it*(it+1)/2}})}

