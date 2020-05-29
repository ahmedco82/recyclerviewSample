package com.ahmedcom.recyclerviews

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Mathiazhagan on 20-06-2017.
 */

class CustomViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    var androidLayout: View
    var name: TextView
    var api: TextView
    var version: TextView

    init{
        androidLayout = itemView.findViewById(R.id.android_layout)
        name = itemView.findViewById(R.id.name) as TextView
        api = itemView.findViewById(R.id.api) as TextView
        version = itemView.findViewById(R.id.version) as TextView
    }


}
