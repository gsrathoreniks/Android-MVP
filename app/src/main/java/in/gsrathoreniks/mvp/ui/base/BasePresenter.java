package in.gsrathoreniks.mvp.ui.base;

import in.gsrathoreniks.mvp.data.DataManager;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;


    public BasePresenter(DataManager dataManager){
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
