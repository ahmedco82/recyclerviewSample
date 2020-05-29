package com.ahmedcom.recyclerviews

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

 /**
 * Created by Mathiazhagan on 20-06-2017.
 */

// Setting a declaration as internal means that it’ll be available in the same module only.

class CustomAdapter(internal var context:Context,internal var androidList:List<Android>):RecyclerView.Adapter<CustomViewHolder>(){


    internal var List: MutableList<Android>? = null

    override fun onCreateViewHolder(parent:ViewGroup , viewType:Int):CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_android_list, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder:CustomViewHolder, position:Int){
        holder.name.text = androidList!![position].name
        holder.api.text = context.getString(R.string.api) + ": " + androidList!![position].api
        holder.version.text = context.getString(R.string.version) + ": " + androidList!![position].verison
    }

    override fun getItemCount():Int{
        return androidList.size
    }
      // List.add(position,androidList.get(0))
    // notifyDataSetChanged()

 }
