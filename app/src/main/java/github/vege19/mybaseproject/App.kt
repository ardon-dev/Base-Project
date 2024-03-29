package github.vege19.mybaseproject

import android.app.Application
import github.vege19.mybaseproject.di.AppComponent
import github.vege19.mybaseproject.di.DaggerAppComponent

class App : Application() {

    companion object {
        private lateinit var appComponent: AppComponent
        fun getComponent() = appComponent

        private lateinit var appContext: App
        fun getContext() = appContext
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
        appContext = this
    }

}