package in.gsrathoreniks.mvp.ui.main;

import in.gsrathoreniks.mvp.ui.base.MvpPresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}
