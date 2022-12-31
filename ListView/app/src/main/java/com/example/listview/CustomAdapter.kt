package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (var context : Context, var mangmonan : ArrayList<MonAn>) : BaseAdapter() {
    class ViewHolder(row : View) {
        var textviewtenmonan : TextView
        var imageviewtenmonan : ImageView

        init {
            textviewtenmonan = row.findViewById(R.id.textviewtenmonan) as TextView
            imageviewtenmonan = row.findViewById(R.id.imageviewhinhmonan) as ImageView
        }
    }

    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewholder : ViewHolder
        if (convertView == null) {
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.dong_monan,null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        } else {
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }
        var monan : MonAn = getItem(position) as MonAn
        viewholder.textviewtenmonan.text = monan.ten
        viewholder.imageviewtenmonan.setImageResource(monan.hinhanh)

        return view as View
    }
}