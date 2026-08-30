fun main()=readln().split(" ").run{var p=get(1).toInt()
print(List(get(0).toInt()){readln().toInt()}.reversed().sumOf{val a=p/it
p%=it
a})}