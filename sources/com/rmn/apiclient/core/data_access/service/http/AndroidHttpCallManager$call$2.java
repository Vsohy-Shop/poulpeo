package com.rmn.apiclient.core.data_access.service.http;

import androidx.core.app.NotificationCompat;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.exceptions.FailedCallException;
import com.rmn.apiclient.core.data_access.base.call.exceptions.ServerErrorCallException;
import com.rmn.apiclient.core.data_access.service.call.ServiceCallListener;
import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p446vd.C13633n;

/* compiled from: AndroidHttpCallManager.kt */
public final class AndroidHttpCallManager$call$2 implements Callback {
    final /* synthetic */ ServiceCallListener $listener;

    AndroidHttpCallManager$call$2(ServiceCallListener serviceCallListener) {
        this.$listener = serviceCallListener;
    }

    public void onFailure(Call call, IOException iOException) {
        C12775o.m28640j(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28640j(iOException, "e");
        C13633n.m31161q("HTTP call failed : " + call.request(), iOException);
        this.$listener.onError(new FailedCallException(iOException));
    }

    public void onResponse(Call call, Response response) {
        String string;
        String string2;
        C12775o.m28640j(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28640j(response, "response");
        String str = "";
        if (!response.isSuccessful()) {
            int code = response.code();
            ResponseBody body = response.body();
            if (!(body == null || (string2 = body.string()) == null)) {
                str = string2;
            }
            ServerErrorCallException serverErrorCallException = new ServerErrorCallException(code, str, (IDocument) null, response.headers().get("cf-ray"));
            C13633n.m31161q("HTTP call failed : " + call.request() + "\n" + response.code(), serverErrorCallException);
            this.$listener.onError(serverErrorCallException);
            return;
        }
        ResponseBody body2 = response.body();
        if (!(body2 == null || (string = body2.string()) == null)) {
            str = string;
        }
        C13633n.m31162r("HTTP call succeeded : " + call.request() + "\n" + response.code() + "\n" + str);
        this.$listener.onSuccess(response.code(), str);
    }
}
