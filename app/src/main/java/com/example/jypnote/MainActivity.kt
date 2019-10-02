package com.example.jypnote

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.jypnote.ui.main.adapter.SectionsPagerAdapter
import com.example.jypnote.ui.main.api.ApiClient
import com.example.jypnote.ui.main.api.ApiInterface
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal var apiInterface: ApiInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)

        // https://jongmin92.github.io/2018/01/29/Programming/android-retrofit2-okhttp3/
        apiInterface = ApiClient.getClient().create(ApiInterface::class.java)
        val call = apiInterface!!.selectBankList()

        fab.setOnClickListener {view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }
}