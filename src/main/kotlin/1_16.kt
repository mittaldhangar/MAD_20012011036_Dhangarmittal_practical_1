open class Person(firstname:String,lastname:String){ var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):
    Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):
            this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("	")
    }

}
fun main(){ var
        s1=Student("Pratiksha","Gaykwad",19,20012011040,"CE","C","AB7"
    )
    var s2=Student("Jinal","Saxena",20,20012011016,"CE","B","AB1"
    )
    var s3=Student("Mittal","Dhangar",21,20012011036,"CE","C","AB7")
    var s4=Student("Payal","Parmar",19,20012021009,"IT","C","AB6")
    var s5=Student("Kinnu","Kamol",20,20012021148,"CIVIL","A","AB5"
    )

}
