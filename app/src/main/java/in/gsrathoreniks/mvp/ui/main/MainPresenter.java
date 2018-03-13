package in.gsrathoreniks.mvp.ui.main;

import in.gsrathoreniks.mvp.data.DataManager;
import in.gsrathoreniks.mvp.ui.base.BasePresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}
