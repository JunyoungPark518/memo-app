package com.example.jypnote

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.jypnote.ui.main.adapter.SectionsPagerAdapter
import com.example.jypnote.ui.main.api.ApiClient
import com.example.jypnote.ui.main.api.ApiInterface
import com.example.jypnote.ui.main.model.*
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    internal var apiInterface: ApiInterface? = null
    var bankList: List<Bank>? = null
    var cardList: List<Card>? = null
    var usageList: List<Usage>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(view_pager)
        tabs.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                view_pager.currentItem = tab.position
                when(tab.position) {
                    0 -> {
                        if(cardList!!.isEmpty())
                            getCardList()
                        println("카드")
                    }
                    1 -> {
                        if(bankList!!.isEmpty())
                            getBankList()
                        println("은행")
                    }
                    2 -> println("사용")
                    3 -> {
                        println("합")
                    }
                    else -> println("NO!!")

                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        apiInterface = ApiClient.getClient().create(ApiInterface::class.java)

//

        val call = apiInterface!!.meta("android", "1.0.0")
//        call.enqueue(object : retrofit2.Callback<Meta> {
//            override fun onResponse(call: Call<Meta>, response: Response<Meta>) {
//                val u = response.body()
////                tv.setText(u!!.toString())
//                println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
//                println(u!!.pushYn)
//                textView1.setText(u.toString())
//            }
//
//            override fun onFailure(call: Call<Meta>, t: Throwable) {
//                println(t.stackTrace)
//                textView1.setText("Fail!!!")
//            }
//        })

        fab.setOnClickListener {view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    fun getBankList() {
        apiInterface!!.getBankList(1).enqueue(object : retrofit2.Callback<BankMain> {
            override fun onResponse(call: Call<BankMain>, response: Response<BankMain>) {
                val res: BankMain? = response.body()
                if(res!!.result.equals("Y"))
                    bankList = res.list!!
            }
            override fun onFailure(call: Call<BankMain>, t: Throwable) {
                println(t.stackTrace)
                textView1.setText("Fail to getBankList")
            }
        })
    }

    fun getCardList() {
        apiInterface!!.getCardList(1).enqueue(object : retrofit2.Callback<CardMain> {
            override fun onResponse(call: Call<CardMain>, response: Response<CardMain>) {
                val res: CardMain? = response.body()
                if(res!!.result.equals("Y"))
                    cardList = res.list!!
            }
            override fun onFailure(call: Call<CardMain>, t: Throwable) {
                println(t.stackTrace)
                textView1.setText("Fail to getCardList")
            }
        })
    }
}