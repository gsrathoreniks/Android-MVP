package in.gsrathoreniks.mvp.ui.splash;

import in.gsrathoreniks.mvp.ui.base.MvpPresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
