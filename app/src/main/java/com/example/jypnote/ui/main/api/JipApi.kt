package com.example.jypnote.ui.main.api

import okhttp3.*
import java.io.IOException

class JipApi {
    private val client = OkHttpClient()

    fun call(url: String) {
        val request = Request.Builder().url(url).build()

        client.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }

            override fun onResponse(call: Call, response: Response) {
                println(response.body()?.string())
            }
        })
    }
}
