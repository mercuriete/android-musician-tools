package org.mercuriete.musiciantools.aboutme

import org.mercuriete.musiciantools.BasePresenter
import org.mercuriete.musiciantools.BaseView

interface AboutMeContract {

    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>

}
