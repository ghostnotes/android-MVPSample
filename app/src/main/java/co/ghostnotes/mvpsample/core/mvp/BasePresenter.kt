package co.ghostnotes.mvpsample.core.mvp

interface BasePresenter {

    fun start(view: BaseView)

    fun stop()

}