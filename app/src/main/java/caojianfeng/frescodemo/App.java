package caojianfeng.frescodemo;

import android.app.Application;
import android.os.StrictMode;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 曹建峰(windcao@hotmail.com) on 2017/3/7.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedClosableObjects().penaltyDeath().penaltyLog().build());
        super.onCreate();
        Fresco.initialize(this);
    }
}
