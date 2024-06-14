package StructureData.Request

import StructureData.Response.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiServices {
    @GET("/ingredients") // mengambil semua data ingredient
    fun getIngredients(): Call<GetIngredientsResponse>

    @GET("/ingredients/name") // mengabil data rempah berdasarkan nama
    fun getIngredientByName(
        @Query("name") name: String
    ): Call<GetIngredientsResponse>

    @GET("/ingredient/{id}") // mengambil data resep berdasarkan id
    fun getIngredientById(
        @Path("id") id: String
    ): Call<GetIngredientByIdResponse>

    @GET("/all-recipes") // mengambil semua data resep
    fun getRecipes(): Call<GetRecipesResponse>

    @GET("/recipes/by-ingredient") // mengambil data resep berdasarkan bahan dasar
    fun getRecipesByIngredient(
        @Query("ingredient") ingredient: String
    ): Call<GetRecipesResponse>

    @GET("/recipes/name") // mengambil data resep berdasarkan nama
    fun getRecipesByName(
        @Query("name") name: String
    ): Call<GetRecipesResponse>

    @GET("/recipes/name") // mengambil data resep berdasarkan nama
    fun getRecipesByNameFail(
        @Query("name") name: String
    ): Call<GetFailureResponse>

    @GET("/recipe-detail/{id}") // mengambil data resep berdasarkan id
    fun getRecipeById(
        @Path("id") id: String
    ): Call<GetRecipeByIdResponse>

    @Multipart
    @POST("recipe-post")
    fun postRecipe(
        @Query("name") name: String,
        @Query("description") description: String,
        @Part("file") file: MultipartBody.Part
    ): Call<GetIngredientPostResponse>


}