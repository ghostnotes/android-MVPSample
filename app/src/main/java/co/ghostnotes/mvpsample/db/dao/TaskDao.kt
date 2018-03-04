package co.ghostnotes.mvpsample.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Query
import co.ghostnotes.mvpsample.data.Task
import io.reactivex.Flowable
import io.reactivex.Maybe


@Dao
interface TaskDao {

    @Query("select count(*) from " + Task.TABLE_NAME)
    fun count(): Maybe<Int>


    @Query("select * from " + Task.TABLE_NAME)
    fun getAllTasks(): Flowable<MutableList<Task>>

    @Delete
    fun deleteTask(task: Task)

}