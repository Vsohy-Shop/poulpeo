package p052c9;

import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.apiclient.core.config.ILocalAPIConfig;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.impl.api.methods.AppConfigApi;

@StabilityInferred(parameters = 0)
/* renamed from: c9.a */
/* compiled from: APIConfigPLP.kt */
public final class C4036a implements IAPIConfig {

    /* renamed from: a */
    public static final C4036a f3228a = new C4036a();

    private C4036a() {
    }

    public String getCallingContext() {
        return "app";
    }

    public String getClientId() {
        return CloudUtil.CLOUD_ALIAS_POULPEO_ANDROID_CLIENT_ID;
    }

    public String getDomain() {
        return "api.poulpeo.com";
    }

    public ILocalAPIConfig getLocalAPIConfig() {
        return null;
    }

    public BaseApiMethod getRemoteConfigMethod() {
        return new AppConfigApi.GetAppConfig();
    }

    public String getVersion() {
        return "1.0";
    }
}
