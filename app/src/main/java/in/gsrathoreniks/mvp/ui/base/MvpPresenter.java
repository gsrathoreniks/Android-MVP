package in.gsrathoreniks.mvp.ui.base;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}
