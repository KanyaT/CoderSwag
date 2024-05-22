package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product = intent.getParcelableExtra(EXTRA_PRODUCT)!!

        val detailImageView = findViewById<ImageView>(R.id.detailImageView)
        val detailTextTitle = findViewById<TextView>(R.id.detailTextTitle)
        val detailTextPrice = findViewById<TextView>(R.id.detailTextPrice)
        val addToCartBtn = findViewById<Button>(R.id.addToCartBtn)

        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        detailImageView.setImageResource(resourceId)
        detailTextTitle.text = product.title
        detailTextPrice.text = product.price

        addToCartBtn.setOnClickListener {
            Toast.makeText(this, "Successfully aded to cart!", Toast.LENGTH_SHORT).show()
        }


    }
}