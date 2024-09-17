import androidx.lifecycle.LiveData

class CerealViewModel : ViewModel() {
    private val repository = CerealRepository()
    private val _cereals = MutableLiveData<List<Cereal>>()

    val cereals: LiveData<List<Cereal>> get() = _cereals

    fun loadCereals() {
        _cereals.value = repository.getCereals()
    }
}