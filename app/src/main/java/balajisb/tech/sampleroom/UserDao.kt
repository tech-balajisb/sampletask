package balajisb.tech.sampleroom

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDao {

    @Insert
    fun insert(users:Users)

    @Query("Select * from Users")
    fun getUsers()

    @Delete
    fun deleteUser(users:Users)

}