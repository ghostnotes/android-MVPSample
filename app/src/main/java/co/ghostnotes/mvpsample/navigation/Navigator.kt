package co.ghostnotes.mvpsample.navigation

import android.content.Context
import android.util.Log
import co.ghostnotes.mvpsample.addtask.AddTaskActivity

class Navigator {

    fun navigateToAddTask(context: Context) {
        Log.d("TEST", "### navigate to add task screen.")

        val intent = AddTaskActivity.getCallingIntent(context)
        context.startActivity(intent)
    }

}