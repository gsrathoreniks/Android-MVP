package in.gsrathoreniks.mvp.ui.login;

import in.gsrathoreniks.mvp.data.DataManager;
import in.gsrathoreniks.mvp.ui.base.BasePresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}
