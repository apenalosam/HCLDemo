fun User.copyFrom(user: User) {
    this.address = user.address
    this.age = user.age
    this.isActive = user.isActive
    this.lastname = user.lastname
}

fun User.copyTo(): User = User(
    name = this.name,
    id = this.id,
    age = this.age,
    address = this.address,
    lastname = this.lastname,
    isActive = this.isActive
)

fun String.removeFirst(): String {
    return if(this.isNotEmpty()) this.substring(1)
    else ""
}

fun String.removeLast(): String {
    return if(this.isNotEmpty()) this.substring(0, this.length - 1)
    else ""
}