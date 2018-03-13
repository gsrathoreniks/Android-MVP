package in.gsrathoreniks.mvp;

/**
 * Created by gajendrasinghrathore on 13/03/18.
 */

public class DataManager {

    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email) {
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
