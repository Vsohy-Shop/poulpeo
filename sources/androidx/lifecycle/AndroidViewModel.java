package androidx.lifecycle;

import android.app.Application;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;

/* compiled from: AndroidViewModel.kt */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application2) {
        C12775o.m28639i(application2, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
        this.application = application2;
    }

    public <T extends Application> T getApplication() {
        T t = this.application;
        C12775o.m28637g(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
