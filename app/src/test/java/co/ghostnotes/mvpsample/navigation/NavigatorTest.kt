package co.ghostnotes.mvpsample.navigation

import android.content.Context
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class NavigatorTest {

    @Mock
    private lateinit var mockContext: Context

    private lateinit var navigator: Navigator

    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        navigator = Navigator()
    }

    @Test
    @Throws(Exception::class)
    fun navigateToAddTask() {
        // Call
        navigator.navigateToAddTask(mockContext)

        // Test
        verify(mockContext, times(1)).startActivity(any())
    }

}