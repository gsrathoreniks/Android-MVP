package in.gsrathoreniks.mvp.ui.login;

import in.gsrathoreniks.mvp.ui.base.MvpPresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}
