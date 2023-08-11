package com.rmn.api.p322v2.cloud.notifications;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.cloud.general.CloudMethodParameters;
import com.rmn.api.p322v2.cloud.proxy.methods.ProxyMethodsPushNotification;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Map;
import p446vd.C13621b;
import p446vd.C13623d;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: com.rmn.api.v2.cloud.notifications.BasePushNotificationManager */
public abstract class BasePushNotificationManager {
    private static final String FIELD_NAME_NOTIFICATION_DEVICE_TOKEN_APNS = "MR_push_notification_device_token_apns";
    private static final String FIELD_NAME_NOTIFICATION_DEVICE_TOKEN_FCM = "MR_push_notification_device_token";
    private static final String KEY_NAME_HASHCODE_REQUEST_REGISTER_APNS = "MR_push_hashcode_register_apns";
    private static final String KEY_NAME_HASHCODE_REQUEST_REGISTER_FCM = "MR_push_hashcode_register";
    private static final String STORAGE_KEY_PUSH_NOTIFICATION_ACCEPTED = "push_notification_accepted";
    protected ContextContainer contextContainer;

    /* renamed from: com.rmn.api.v2.cloud.notifications.BasePushNotificationManager$a */
    class C11235a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ PushNotificationSender f17788b;

        /* renamed from: c */
        final /* synthetic */ int f17789c;

        C11235a(PushNotificationSender pushNotificationSender, int i) {
            this.f17788b = pushNotificationSender;
            this.f17789c = i;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
                BasePushNotificationManager.this.saveLastHashCodeRequestRegister(this.f17788b, this.f17789c);
            }
        }
    }

    protected BasePushNotificationManager(ContextContainer contextContainer2) {
        if (contextContainer2 != null) {
            this.contextContainer = contextContainer2;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void addRegistrationParamsToInput(ProxyBundleInput proxyBundleInput, String str, String str2, @NonNull PushNotificationSender pushNotificationSender) {
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_APPLICATION_NAME_REQUIRED, C13621b.m31089c(this.contextContainer));
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_APPLICATION_VERSION_REQUIRED, C13621b.m31090d(this.contextContainer));
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_DEVICE_ID_REQUIRED, C13623d.m31108h(this.contextContainer));
        String c = C13623d.m31103c();
        if (c != null && !c.equals("")) {
            proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_DEVICE_NAME, c);
        }
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_DEVICE_MODEL, C13623d.m31102b());
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_DEVICE_TOKEN_REQUIRED, str);
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_PLATFORM_NAME, C13623d.m31104d());
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_PLATFORM_VERSION, C13623d.m31105e());
        String i = C13623d.m31109i(this.contextContainer);
        if (i != null) {
            proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_USER_AGENT, i);
        }
        if (str2 != null && !str2.equals("")) {
            proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_USER_ID, str2);
        }
        String g = C13623d.m31107g(this.contextContainer);
        if (g != null && !g.equals("")) {
            proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_SCREEN_SIZE, g);
        }
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_FINGER_PRINT_REQUIRED, C13623d.m31108h(this.contextContainer));
        String j = C13623d.m31110j(this.contextContainer);
        if (j != null && !j.equals("")) {
            proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_VIEWPORT, j);
        }
        proxyBundleInput.addParamValue(CloudMethodParameters.PUSH_SENDER, pushNotificationSender.tag);
    }

    private int generateHashCode(ProxyBundleInput proxyBundleInput) {
        int i;
        if (proxyBundleInput == null) {
            return 0;
        }
        Map<RMNMethodParam, Object> paramValues = proxyBundleInput.getParamValues();
        int i2 = 1;
        if (paramValues != null && !paramValues.isEmpty()) {
            for (Object next : paramValues.values()) {
                if (next == null) {
                    i = 0;
                } else {
                    i = next.hashCode();
                }
                i2 += i;
            }
        }
        return i2;
    }

    @NonNull
    private String getFieldNameRequestHashCode(@NonNull PushNotificationSender pushNotificationSender) {
        if (pushNotificationSender == PushNotificationSender.FCM) {
            return KEY_NAME_HASHCODE_REQUEST_REGISTER_FCM;
        }
        return KEY_NAME_HASHCODE_REQUEST_REGISTER_APNS;
    }

    @NonNull
    private String getFieldNameToken(@NonNull PushNotificationSender pushNotificationSender) {
        if (pushNotificationSender == PushNotificationSender.FCM) {
            return FIELD_NAME_NOTIFICATION_DEVICE_TOKEN_FCM;
        }
        return FIELD_NAME_NOTIFICATION_DEVICE_TOKEN_APNS;
    }

    private void removeLastHashCodeRequestRegister(@NonNull PushNotificationSender pushNotificationSender) {
        C13636q.m31181b(this.contextContainer).mo53293d(getFieldNameRequestHashCode(pushNotificationSender));
    }

    private String retrieveDeviceToken(@NonNull PushNotificationSender pushNotificationSender) {
        return C13636q.m31181b(this.contextContainer).mo53298i(getFieldNameToken(pushNotificationSender), (String) null);
    }

    private int retrieveLastHashCodeRequestRegister(@NonNull PushNotificationSender pushNotificationSender) {
        return C13636q.m31181b(this.contextContainer).mo53296g(getFieldNameRequestHashCode(pushNotificationSender), 0);
    }

    /* access modifiers changed from: private */
    public void saveLastHashCodeRequestRegister(@NonNull PushNotificationSender pushNotificationSender, int i) {
        C13636q.m31181b(this.contextContainer).mo53301l(getFieldNameRequestHashCode(pushNotificationSender), i);
    }

    public boolean hasAcceptedPushNotifications() {
        return C13636q.m31181b(this.contextContainer).mo53294e(STORAGE_KEY_PUSH_NOTIFICATION_ACCEPTED, false);
    }

    public boolean hasPassedPushNotificationConsent() {
        return C13636q.m31181b(this.contextContainer).mo53292a(STORAGE_KEY_PUSH_NOTIFICATION_ACCEPTED);
    }

    public void registerDevice(String str) {
        if (!hasAcceptedPushNotifications()) {
            C13633n.m31158n("Device won't register as it is disabled in user settings");
            return;
        }
        for (PushNotificationSender pushNotificationSender : PushNotificationSender.values()) {
            String retrieveDeviceToken = retrieveDeviceToken(pushNotificationSender);
            if (retrieveDeviceToken != null) {
                registerDevice(retrieveDeviceToken, str, pushNotificationSender);
            }
        }
    }

    public void removeAcceptedPushNotifications() {
        C13636q.m31181b(this.contextContainer).mo53293d(STORAGE_KEY_PUSH_NOTIFICATION_ACCEPTED);
    }

    public abstract void retrieveUserThenRegisterDevice();

    public abstract void retrieveUserThenUnregisterDevice();

    public void saveDeviceToken(String str, @NonNull PushNotificationSender pushNotificationSender) {
        if (str != null && !str.equals("")) {
            C13636q.m31181b(this.contextContainer).mo53303n(getFieldNameToken(pushNotificationSender), str);
        }
    }

    public void setAcceptedPushNotifications(boolean z) {
        C13636q.m31181b(this.contextContainer).mo53299j(STORAGE_KEY_PUSH_NOTIFICATION_ACCEPTED, z);
    }

    public void unregisterDevice(String str) {
        for (PushNotificationSender pushNotificationSender : PushNotificationSender.values()) {
            String retrieveDeviceToken = retrieveDeviceToken(pushNotificationSender);
            if (retrieveDeviceToken != null) {
                unregisterDevice(retrieveDeviceToken, str, pushNotificationSender);
            }
        }
    }

    private void unregisterDevice(String str, String str2, @NonNull PushNotificationSender pushNotificationSender) {
        removeLastHashCodeRequestRegister(pushNotificationSender);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(this.contextContainer, ProxyMethodsPushNotification.UNREGISTER, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        addRegistrationParamsToInput(proxyBundleInput, str, str2, pushNotificationSender);
        proxyBundleInput.executeProxyAction((IProxyListener) null);
    }

    private void registerDevice(String str, String str2, @NonNull PushNotificationSender pushNotificationSender) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(this.contextContainer, ProxyMethodsPushNotification.REGISTER, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        addRegistrationParamsToInput(proxyBundleInput, str, str2, pushNotificationSender);
        int generateHashCode = generateHashCode(proxyBundleInput);
        if (generateHashCode != retrieveLastHashCodeRequestRegister(pushNotificationSender)) {
            proxyBundleInput.executeProxyAction(new C11235a(pushNotificationSender, generateHashCode));
        }
    }
}
