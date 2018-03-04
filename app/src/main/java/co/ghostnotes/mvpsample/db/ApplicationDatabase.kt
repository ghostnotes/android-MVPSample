package co.ghostnotes.mvpsample.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import co.ghostnotes.mvpsample.data.Task
import co.ghostnotes.mvpsample.db.dao.TaskDao

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

}