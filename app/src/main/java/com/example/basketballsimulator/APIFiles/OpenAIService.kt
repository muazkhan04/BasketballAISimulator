package com.example.basketballsimulator.APIFiles

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class OpenAIService(private val apiKey: String) {
    private val api: OpenAIApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openai.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(OpenAIApi::class.java)
    }

    fun getChatCompletion(request: ChatRequest, onSuccess: (ChatResponse?) -> Unit, onError: (String) -> Unit
    ) {
        val authorization = "Bearer $apiKey"
        api.getChatCompletion(authorization, request).enqueue(object : Callback<ChatResponse> {
            override fun onResponse(call: Call<ChatResponse>, response: Response<ChatResponse>) {
                if (response.isSuccessful) {
                    onSuccess(response.body())
                } else {
                    onError("Error: ${response.errorBody()?.string()}")
                }
            }

            override fun onFailure(call: Call<ChatResponse>, t: Throwable) {
                onError("Failure: ${t.message}")
            }
        })
    }
}