package StructureDataResponse
import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("id") val id: String,
    @SerializedName("id_picture") val idPicture: String,
    @SerializedName("name") val name: String,
    @SerializedName("benefit") val benefit: List<String>
)
