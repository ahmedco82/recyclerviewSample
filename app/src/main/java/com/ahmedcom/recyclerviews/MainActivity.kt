package com.ahmedcom.recyclerviews

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import java.util.*

class MainActivity : AppCompatActivity() {

    internal var androidRecyclerView:RecyclerView? = null
    internal var androidList: MutableList<Android>? = null
    internal var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        androidRecyclerView = findViewById(R.id.android_recycler_view) as RecyclerView
        androidList = ArrayList<Android>()
        // setValues("a","b","c")
    }

    fun addItems(v:View){
         setValues("a","b","c")
       // customAdapter!!.addItem(0)
        customAdapter = CustomAdapter(this@MainActivity , androidList!!)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        androidRecyclerView!!.layoutManager = mLayoutManager
        androidRecyclerView!!.adapter = customAdapter
    }

   fun removeItems(v:View){
       if(androidList!!.size>0) {
           androidList!!.removeAt(androidList!!.size-1)
           customAdapter = CustomAdapter(this@MainActivity, androidList!!)
           val mLayoutManager = LinearLayoutManager(applicationContext)
           androidRecyclerView!!.layoutManager = mLayoutManager
           androidRecyclerView!!.adapter = customAdapter
       }
   }

    private fun setValues(s1:String, s2:String, s3:String){
        androidList!!.add(Android(s1, s2,s3))
    }
}
