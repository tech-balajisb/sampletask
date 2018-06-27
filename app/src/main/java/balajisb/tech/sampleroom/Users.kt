package balajisb.tech.sampleroom

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Users {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var name: String = ""

    var profession: String = ""

    var image: String = ""



}