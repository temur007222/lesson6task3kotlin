package com.example.lesson6task3kotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task3kotlin.Adapter.MemberAdapter
import com.example.lesson6task3kotlin.Model.Phone

class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val phones: List<Phone> = prepareMemberList()
        refreshAdapter(phones as ArrayList<Phone>)
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
    }

    private fun refreshAdapter(phones: ArrayList<Phone>) {
        val adapter = MemberAdapter(context!!, phones )
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = false
    }

    private fun prepareMemberList(): List<Phone> {
        val phones: MutableList<Phone> = ArrayList()
        for (i in 1..14) {
            phones.add(Phone("Temur $i", 1 + i))
        }
        return phones
    }
}