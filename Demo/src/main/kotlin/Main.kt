fun main() {

    val user = User("Andres", 1L)
    println("user = $user")

    user.lastname = "Peñalosa"
    user.address = "Madrid"
    user.age = 34
    user.isActive = true
    println("user = $user")

    val roommate = User(name = "Roommate", id = 2L)
    println("roommate = $roommate")
    roommate.copyFrom(user)
    println("roommate = $roommate")

    var userClone = User("new user", 3L)
    println("userClone = $userClone")
    userClone = user.copyTo()
    println("userClone = $userClone")

    val userList: List<User> = mutableListOf(user, roommate, userClone)
    var nullableList: MutableList<String>? = null
    val listWithNullableElements: MutableList<User?> = mutableListOf()

    val listIterator: ListIterator<User> = userList.listIterator()

    nullableList = mutableListOf("")
    nullableList.add("Added String")

    listWithNullableElements.add(null)

    userList.forEach{println(it)}
    for(userInList in userList) {println(userInList)}

    while(listIterator.hasNext()) {
        println("user${listIterator.nextIndex()}: ${listIterator.next()}")
    }

}