package co.ghostnotes.mvpsample.main

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations

class MainUIHelperTest {

    private lateinit var mainUIHelper: MainUIHelper

    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        mainUIHelper = MainUIHelper()
    }

    @Test
    @Throws(Exception::class)
    fun getText() {
        // Call
        val actual = mainUIHelper.getText()

        // Test
        assertThat(actual, `is`("text"))
    }

}