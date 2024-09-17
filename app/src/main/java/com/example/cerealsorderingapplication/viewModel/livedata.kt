package com.example.cerealsorderingapplication.viewModel

object livedata {
    private val _order = MutableLiveData<Order>()
    val order: LiveData<Order> get() = _order

    fun placeOrder(cereals: List<Cereal>) {
        val total = cereals.sumOf { it.price }
        _order.value = Order(cereals, total)
    }
}

private fun Any.sumOf(any: Any): Any {

}
