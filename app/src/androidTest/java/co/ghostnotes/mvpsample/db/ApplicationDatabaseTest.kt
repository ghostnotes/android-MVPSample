package co.ghostnotes.mvpsample.db

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import co.ghostnotes.mvpsample.db.dao.TaskDao
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ApplicationDatabaseTest {

    private lateinit var applicationDatabase: ApplicationDatabase
    private lateinit var taskDao: TaskDao

    @Before
    @Throws(Exception::class)
    fun setUp() {
        val context = InstrumentationRegistry.getTargetContext()

        applicationDatabase = Room.inMemoryDatabaseBuilder(context, ApplicationDatabase::class.java).build()
        taskDao = applicationDatabase.taskDao()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        applicationDatabase.close()
    }

}