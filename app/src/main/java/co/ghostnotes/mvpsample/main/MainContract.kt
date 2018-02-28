package co.ghostnotes.mvpsample.main

import co.ghostnotes.mvpsample.core.mvp.BasePresenter
import co.ghostnotes.mvpsample.core.mvp.BaseView

interface MainContract {

    interface View: BaseView

    interface Presenter: BasePresenter

}