package com.example.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Adapter.ProductAdapter
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType.toString())) {product ->
            val productIntent = Intent(this, ProductDetailActivity::class.java)
            productIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        val productsListView = findViewById<RecyclerView>(R.id.productListview)

        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}