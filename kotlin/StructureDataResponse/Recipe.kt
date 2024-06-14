package StructureDataResponse
import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName("id") val id: String,
    @SerializedName("id_picture") val idPicture: String,
    @SerializedName("bahan") val bahan: List<String>,
    @SerializedName("author") val author: String,
    @SerializedName("langkah_pembuatan") val langkahPembuatan: List<String>,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("asal_daerah") val asalDaerah: String
)
