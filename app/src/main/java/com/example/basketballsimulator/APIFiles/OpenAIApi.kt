package com.example.basketballsimulator.APIFiles

import com.example.basketballsimulator.APIFiles.ChatRequest
import com.example.basketballsimulator.APIFiles.ChatResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface OpenAIApi {

    @POST("v1/chat/completions")
    fun getChatCompletion(@Header("Authorization") authorization: String, @Body request: ChatRequest, ): Call<ChatResponse>
}