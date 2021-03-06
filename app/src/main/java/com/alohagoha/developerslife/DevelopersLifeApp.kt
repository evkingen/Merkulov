package com.alohagoha.developerslife

import android.app.Application
import com.alohagoha.developerslife.model.data.DevelopersLifeAPI
import com.alohagoha.developerslife.model.data.GifsRepository
import com.alohagoha.developerslife.model.data.NetworkModule

class DevelopersLifeApp : Application() {
    val apiService: DevelopersLifeAPI by lazy { NetworkModule().getApiService() }
    val gifsRepository: GifsRepository by lazy { GifsRepository(apiService) }

}
