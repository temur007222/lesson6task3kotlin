package com.example.lesson6task3kotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task3kotlin.Model.Phone
import com.example.lesson6task3kotlin.R
import java.lang.reflect.Member

 class MemberAdapter(private var context: Context?, private var members: ArrayList<Phone>?) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {

     override fun getItemCount(): Int{return members!!.size
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
         val view = LayoutInflater.from(context).inflate(R.layout.item_member_list, parent, false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val member= members?.get(position)

        if (holder is MemberViewHolder) {
            val tv_lastname = holder.tv_lastname
            if (member != null) {
                tv_lastname.text = member.getLastname()
            }
        }
    }
    class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tv_lastname: TextView = view.findViewById(R.id.tv_lastName)
    }
}