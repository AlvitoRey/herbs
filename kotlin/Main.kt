import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import StructureData.Request.ApiServices
import StructureData.Response.GetFailureResponse

// Fungsi untuk melakukan request ke API dengan lambda parameter
fun <T> fetchApiResponse(call: Call<T>, onResult: (response: T?) -> Unit) {
    call.enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            val statusCode = response.code()
            println(statusCode);
            if (response.isSuccessful) {
                val apiResponse = response.body()
                onResult(apiResponse)
            } else {
                onResult(null)
            }
        }

        override fun onFailure(call: Call<T>, t: Throwable) {
            onResult(null)
        }
    })
}

// Contoh penggunaan
fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://34.101.223.243:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: ApiServices = retrofit.create(ApiServices::class.java)

//    // Contoh penggunaan untuk getIngredients
//    val callIngredients = service.getIngredients()
//    fetchApiResponse(callIngredients) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//            response.data.forEach { ingredient ->
//                println("\t[")
//                println("\t\tIngredient ID: ${ingredient.id}")
//                println("\t\tName: ${ingredient.name}")
//                println("\t\tid_picture: ${ingredient.idPicture}")
//                println("\t\tid_picture: ${ingredient.benefit}")
//                println("\t]")
//            }
//            println("}")
//        } else {
//            println("GET Ingredients Request tidak berhasil")
//        }
//    }
//
//    // Contoh penggunaan untuk getRecipes
//    val callRecipes = service.getRecipes()
//    fetchApiResponse(callRecipes) { response ->
//        if (response != null) {
//            println("\nGET Recipes Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//            response.data.forEach { recipe ->
//                println("\t[")
//                println("\t\tRecipe ID: ${recipe.id}")
//                println("\t\tName: ${recipe.name}")
//                println("\t\tid_picture: ${recipe.idPicture}")
//                println("\t]")
//            }
//            println("}")
//        } else {
//            println("\nGET Recipes Request tidak berhasil")
//        }
//    }

//    // contoh penggunaan getRecipesByIngredient
//    val callRecipesByIngredient = service.getRecipesByIngredient("jahe")
//    fetchApiResponse(callRecipesByIngredient) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//            response.data.forEach { recipe ->
//                println("\t[")
//                println("\t\tRecipe ID: ${recipe.id}")
//                println("\t\tName: ${recipe.name}")
//                println("\t\tDescription: ${recipe.description}")
//                println("\t\tAsal Daerah: ${recipe.asalDaerah}")
//                println("\t\tID Picture: ${recipe.idPicture}")
//                println("\t\tBahan: ${recipe.bahan}")
//                println("\t\tAuthor: ${recipe.author}")
//                println("\t\tlangkah pembuatan: ${recipe.langkahPembuatan}")
//                println("\t]")
//            }
//            println("}")
//        } else {
//            println("GET Ingredients By Name Request tidak berhasil")
//        }
//    }

//    // contoh penggunaan getRecipesByName
//    val callRecipesByName = service.getRecipesByName("anG")
//    fetchApiResponse(callRecipesByName) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//            response.data.forEach { recipe ->
//                println("\t[")
//                println("\t\tRecipe ID: ${recipe.id}")
//                println("\t\tName: ${recipe.name}")
//                println("\t\tDescription: ${recipe.description}")
//                println("\t\tAsal Daerah: ${recipe.asalDaerah}")
//                println("\t\tID Picture: ${recipe.idPicture}")
//                println("\t\tBahan: ${recipe.bahan}")
//                println("\t\tAuthor: ${recipe.author}")
//                println("\t\tlangkah pembuatan: ${recipe.langkahPembuatan}")
//                println("\t]")
//            }
//            println("}")
//        } else {
//            println("GET Ingredients By Name Request tidak berhasil")
//        }
//    }

//    // contoh penggunaan getRecipesById
//    val callRecipeById = service.getRecipeById("7HyG113YnzHU6ZH3Qc1z")
//    fetchApiResponse(callRecipeById) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//                println("\tRecipe ID: ${response.data.id}")
//                println("\tName: ${response.data.name}")
//                println("\tDescription: ${response.data.description}")
//                println("\tAsal Daerah: ${response.data.asalDaerah}")
//                println("\tID Picture: ${response.data.idPicture}")
//                println("\tBahan: ${response.data.bahan}")
//                println("\tAuthor: ${response.data.author}")
//                println("\tlangkah pembuatan: ${response.data.langkahPembuatan}")
//            println("}")
//        } else {
//            println("GET Ingredients By Name Request tidak berhasil")
//        }
//    }

//    // contoh penggunaan getIngredientByName
//    val callIngredientsByName= service.getIngredientByName("jahe")
//    fetchApiResponse(callIngredientsByName) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//            response.data.forEach { recipe ->
//                println("\t[")
//                println("\t\tRecipe ID: ${recipe.id}")
//                println("\t\tName: ${recipe.name}")
//                println("\t\tBenefit: ${recipe.benefit}")
//                println("\t\tID Picture: ${recipe.idPicture}")
//                println("\t]")
//            }
//            println("}")
//        } else {
//            println("GET Ingredients By Name Request tidak berhasil")
//        }
//    }

//    // contoh penggunaan getIngredientById
//    val callIngredientsById= service.getIngredientById("0dU9O5nffiQkzLUekC6t")
//    fetchApiResponse(callIngredientsById) { response ->
//        if (response != null) {
//            println("GET Ingredients Request:")
//            println("Status: ${response.status}")
//            println("Message: ${response.message}")
//            println("Data: {")
//                println("\t[")
//                println("\t\tRecipe ID: ${response.data.id}")
//                println("\t\tName: ${response.data.name}")
//                println("\t\tBenefit: ${response.data.benefit}")
//                println("\t\tID Picture: ${response.data.idPicture}")
//                println("\t]")
//            println("}")
//        } else {
//            println("GET Ingredients By Name Request tidak berhasil")
//        }
//    }

    val callFailure = service.getRecipesByNameFail("TidakAdaBahan")
    fetchApiResponse(callFailure) { response ->
        when (response) {
            is GetFailureResponse -> {
                println("\nGET Ingredient Details Request (Failure):")
                println("Status: ${response.status}")
                println("Message: ${response.message}")
            }
            else -> {
                println("\nGET Ingredient Details Request (Failure) tidak berhasil")
            }
        }
    }

//    val name = "Rendang Sapi"
//    val description = "Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. "
//    val bahanBahan = "Potong daging berlawanan dari seratnya, Peras santan dari 4 butir kelapa tua menjadi 2 liter, Haluskan bumbu--Tuang santan dan bumbu ke dalam wajan anti lengket, masak hingga mendidih, Kemudian masukkan daging, garam dan kaldu. Masak dengan api kecil sambil sesekali di aduk agar tidak gosong, Sampai tahap ini dinamakan kalio, teruskan memasak hingga daging mulai mengering dan kehitaman,Rendang siap dinikmati"
//    val langkahPembuatan = "Potong daging berlawanan dari seratnya, Peras santan dari 4 butir kelapa tua menjadi 2 liter, Haluskan bumbu--Tuang santan dan bumbu ke dalam wajan anti lengket, masak hingga mendidih, Kemudian masukkan daging, garam dan kaldu. Masak dengan api kecil sambil sesekali di aduk agar tidak gosong, Sampai tahap ini dinamakan kalio, teruskan memasak hingga daging mulai mengering dan kehitaman,Rendang siap dinikmati"
//    val asalDaerah = "Padang, Sumatera Barat"
//    val author = "official"

}