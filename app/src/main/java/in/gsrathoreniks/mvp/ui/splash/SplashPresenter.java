package in.gsrathoreniks.mvp.ui.splash;

import in.gsrathoreniks.mvp.data.DataManager;
import in.gsrathoreniks.mvp.ui.base.BasePresenter;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
