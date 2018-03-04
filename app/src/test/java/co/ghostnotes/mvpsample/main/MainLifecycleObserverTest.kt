package co.ghostnotes.mvpsample.main

import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class MainLifecycleObserverTest {

    @Mock
    private lateinit var mockView: MainContract.View
    @Mock
    private lateinit var mockPresenter: MainContract.Presenter

    private lateinit var mainLifecycleObserver: MainLifecycleObserver

    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        mainLifecycleObserver = MainLifecycleObserver(mockView, mockPresenter)
    }

    @Test
    @Throws(Exception::class)
    fun onStart() {
        // Call
        mainLifecycleObserver.onStart()

        // Test
        verify(mockPresenter, times(1)).start(mockView)
    }

    @Test
    @Throws(Exception::class)
    fun onDestroy() {
        // Call
        mainLifecycleObserver.onDestroy()

        // Test
        verify(mockPresenter, times(1)).stop()
    }

}
