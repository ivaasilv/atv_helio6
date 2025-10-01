package com.example.ivauirb3_proj.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.ivauirb3_proj.model.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    suspend fun getAll(): List<Product>

    @Insert
    suspend fun insert(product: Product)
}
