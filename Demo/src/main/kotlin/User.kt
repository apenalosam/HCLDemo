data class User(
    val name: String,
    val id: Long
) {
    var age: Int = 0
    var address = "Non-specified"
    var lastname: String? = null
    var isActive: Boolean = false

    override fun toString(): String {
        return "User(name: ${this.name}, id: ${this.id}, age: ${this.age}," +
                " address: ${this.address}, lastname: ${this.lastname}, isActive: ${this.isActive})"
    }

    constructor(
        name: String,
        id: Long,
        age: Int,
        address: String,
        lastname: String?,
        isActive: Boolean
    ) : this(name, id) {
        this.age = age
        this.address = address
        this.lastname = lastname
        this.isActive = isActive
    }
}
