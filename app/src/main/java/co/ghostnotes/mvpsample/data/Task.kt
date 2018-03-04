package co.ghostnotes.mvpsample.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = Task.TABLE_NAME)
data class Task(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) var id: Long = 0,
        @ColumnInfo(name = "title") var title: String
) {


    companion object {

        const val TABLE_NAME = "tasks"

    }
}