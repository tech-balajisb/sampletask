package balajisb.tech.sampleroom

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = arrayOf(Users::class), version = 1)
abstract class WordRoomDatabase : RoomDatabase() {
    abstract fun wordDao(): UserDao

    companion object {

        private var INSTANCE: WordRoomDatabase? = null

        internal fun getDatabase(context: Context): WordRoomDatabase {
            if (INSTANCE == null) {
                synchronized(WordRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.applicationContext,
                                WordRoomDatabase::class.java, "word_database")
                                .build()

                    }
                }
            }
            return INSTANCE!!
        }
    }

}