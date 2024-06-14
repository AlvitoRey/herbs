import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import StructureDataResponse.Ingredient
import StructureDataResponse.Recipe

// Data class untuk memetakan response JSON
data class IngredientResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Ingredient> // Ubah tipe data sesuai dengan struktur data yang sebenarnya
)

data class getAllRecipes(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<Recipe>
)

// Interface Retrofit untuk mengakses endpoint
interface IngredientService {
    @GET("/ingredients") // get all ingredients
    fun getIngredients(): Call<IngredientResponse>
    @GET("/all-recipes") // get all recipes
    fun getRecipes(): Call<getAllRecipes>
}

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://34.101.223.243:3000") // Ganti dengan URL yang sebenarnya
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(IngredientService::class.java)
    val callGetIngredient = service.getIngredients()

    // Mengirim request secara asynchronous
    callGetIngredient.enqueue(object : retrofit2.Callback<IngredientResponse> {
        override fun onResponse(
            call: Call<IngredientResponse>,
            response: retrofit2.Response<IngredientResponse>
        ) {
            if (response.isSuccessful) {
                val ingredientResponse = response.body()
                println("GET Request:")
                println("Status: ${ingredientResponse?.status}")
                println("Message: ${ingredientResponse?.message}")
                println("Data : {")
                ingredientResponse?.data?.forEach { ingredient ->
                    println("\t[")
                    println("\t\tRecipe ID: ${ingredient.id}")
                    println("\t\tName: ${ingredient.name}")
                    println("\t\tid_picture: ${ingredient.idPicture}")
                    println("\t\tbenefit: ${ingredient.benefit}")
                    println("\t]")
                }
                println("}")
            } else {
                println("Request tidak berhasil: ${response.code()}")
            }
        }

        override fun onFailure(call: Call<IngredientResponse>, t: Throwable) {
            println("Gagal melakukan request: ${t.message}")
        }
    })

    // method mengambil data recipes
    val callGetRecipes = service.getRecipes()
    callGetRecipes.enqueue(object : retrofit2.Callback<getAllRecipes> {
        override fun onResponse(
            call: Call<getAllRecipes>,
            response: retrofit2.Response<getAllRecipes>
        ) {
            if (response.isSuccessful) {
                val ingredientResponse = response.body()
                println("GET Request:")
                println("Status: ${ingredientResponse?.status}")
                println("Message: ${ingredientResponse?.message}")
                println("Data : {")
                ingredientResponse?.data?.forEach { ingredient ->
                    println("\t[")
                    println("\t\tRecipe ID: ${ingredient.id}")
                    println("\t\tName: ${ingredient.name}")
                    println("\t\tid_picture: ${ingredient.idPicture}")
                    println("\t]")
                }
                println("}")
            } else {
                println("Request tidak berhasil: ${response.code()}")
            }
        }

        override fun onFailure(call: Call<getAllRecipes>, t: Throwable) {
            println("Gagal melakukan request: ${t.message}")
        }
    })
}
