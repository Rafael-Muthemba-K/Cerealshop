class CerealRepository {
    private val cereals = listOf(
        Cereal("Wheat", 100.0),
        Cereal("Rice", 80.0)
    )

    fun getCereals(): List<Cereal> = cereals
}