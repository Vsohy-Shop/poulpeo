package p278x7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import p101g8.C7817i;
import p223s7.C9567t;

/* renamed from: x7.i */
/* compiled from: FirebaseInAppMessagingDisplayImpl */
public class C10578i implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C10584m.m22515a("Created activity: " + activity.getClass().getName());
    }

    public void onActivityDestroyed(Activity activity) {
        C10584m.m22515a("Destroyed activity: " + activity.getClass().getName());
    }

    public void onActivityPaused(Activity activity) {
        C10584m.m22515a("Pausing activity: " + activity.getClass().getName());
    }

    public void onActivityResumed(Activity activity) {
        C10584m.m22515a("Resumed activity: " + activity.getClass().getName());
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C10584m.m22515a("SavedInstance activity: " + activity.getClass().getName());
    }

    public void onActivityStarted(Activity activity) {
        C10584m.m22515a("Started activity: " + activity.getClass().getName());
    }

    public void onActivityStopped(Activity activity) {
        C10584m.m22515a("Stopped activity: " + activity.getClass().getName());
    }

    public void displayMessage(C7817i iVar, C9567t tVar) {
    }
}
