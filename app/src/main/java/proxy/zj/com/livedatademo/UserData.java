package proxy.zj.com.livedatademo;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.util.Log;

/**
 * Created by thinkpad on 2018/2/26.
 */

public class UserData extends LiveData implements LifecycleObserver {

    private static final String TAG = "UserData";

    public UserData() {
    }

    @Override
    protected void onActive() {
        super.onActive();
        Log.e(TAG, "onActive");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        Log.e(TAG, "onInactive");
    }

    @Override
    protected void setValue(Object value) {
        super.setValue(value);
        Log.e(TAG, "setValue");
    }


}
