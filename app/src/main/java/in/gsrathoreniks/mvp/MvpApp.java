package in.gsrathoreniks.mvp;

import android.app.Application;

import in.gsrathoreniks.mvp.data.DataManager;
import in.gsrathoreniks.mvp.data.SharedPrefsHelper;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}
