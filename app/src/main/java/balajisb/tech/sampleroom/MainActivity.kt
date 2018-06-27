package balajisb.tech.sampleroom

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var wordRoomDatabase: WordRoomDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordRoomDatabase = Room.databaseBuilder(this.applicationContext, WordRoomDatabase::class.java, "name").build()

        var user=Users()
        user.name="Balaji"
        user.profession="Developer"
        user.image="https://image.freepik.com/free-vector/abstract-logo-template_1331-33.jpg"
        wordRoomDatabase?.wordDao()?.insert(user)

        var user1=Users()
        user1.name="Demo"
        user1.profession="Android"
        user1.image="https://image.freepik.com/free-vector/abstract-logo-template_1331-33.jpg"
        wordRoomDatabase?.wordDao()?.insert(user1)


    }
}
