package com.nuriulgen.bitirmeodevi.domain.repository

import com.nuriulgen.bitirmeodevi.domain.model.TopDestinationModel
import retrofit2.Call

interface TopDestinationRepository {
    fun fetchTopDestination(): Call<List<TopDestinationModel>>
}