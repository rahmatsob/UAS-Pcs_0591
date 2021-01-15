package id.Uas_0591

import android.app.Application
import id.Uas_0591.data.db.AppDatabase
import id.Uas_0591.data.pref.PrefManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class MenuUtama : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@MenuUtama))

    }

    companion object {
        @get:Synchronized
        lateinit var instance: MenuUtama
        lateinit var prefManager: PrefManager
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        prefManager = PrefManager(this)
        db = AppDatabase(this)
    }
}