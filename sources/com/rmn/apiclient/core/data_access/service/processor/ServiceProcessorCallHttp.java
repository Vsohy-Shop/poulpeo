package com.rmn.apiclient.core.data_access.service.processor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.exceptions.FailedCallException;
import com.rmn.apiclient.core.data_access.base.call.exceptions.ParsingCallException;
import com.rmn.apiclient.core.data_access.base.call.exceptions.ServerErrorCallException;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.service.call.ServiceCallListener;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceProcessorCallHttp extends BaseServiceActionProcessor {

    /* renamed from: com.rmn.apiclient.core.data_access.service.processor.ServiceProcessorCallHttp$a */
    class C11603a implements ServiceCallListener {

        /* renamed from: a */
        final /* synthetic */ IActionProcessorListener f18057a;

        /* renamed from: b */
        final /* synthetic */ ServiceProcessorCallHttp f18058b;

        /* renamed from: c */
        final /* synthetic */ ServiceOutput f18059c;

        /* renamed from: d */
        final /* synthetic */ ServiceInput f18060d;

        C11603a(IActionProcessorListener iActionProcessorListener, ServiceProcessorCallHttp serviceProcessorCallHttp, ServiceOutput serviceOutput, ServiceInput serviceInput) {
            this.f18057a = iActionProcessorListener;
            this.f18058b = serviceProcessorCallHttp;
            this.f18059c = serviceOutput;
            this.f18060d = serviceInput;
        }

        public void onError(@NonNull Throwable th) {
            CallException callException;
            if (th instanceof CallException) {
                callException = (CallException) th;
            } else {
                callException = new FailedCallException(th);
            }
            if (callException instanceof ServerErrorCallException) {
                ServerErrorCallException serverErrorCallException = (ServerErrorCallException) callException;
                String str = serverErrorCallException.rawResponse;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        callException = new ServerErrorCallException(serverErrorCallException.httpCode, str, ServiceProcessorCallHttp.this.getDocumentSerializer(this.f18060d).deserialize(new JSONObject(str)), serverErrorCallException.cloudflareDebugCode);
                    } catch (JSONException unused) {
                        callException = new ParsingCallException(serverErrorCallException.httpCode, str);
                    }
                }
            }
            ServiceOutput.Builder exception = ServiceOutput.Builder.newBuilder(this.f18059c, OutputStatus.FAILURE).setException(callException);
            if (callException instanceof FailedCallException) {
                exception.setHasTimedOut(((FailedCallException) callException).hasTimedOut);
            }
            this.f18057a.onActionProcessed(this.f18058b, exception.build());
        }

        public void onSuccess(int i, @NonNull String str) {
            this.f18057a.onActionProcessed(this.f18058b, ServiceOutput.Builder.newBuilder(this.f18059c, OutputStatus.SUCCESS).setHttpCode(Integer.valueOf(i)).setRawResponse(str).build());
        }
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull ServiceInput serviceInput, @NonNull ServiceOutput serviceOutput, @NonNull IActionProcessorListener<ServiceOutput> iActionProcessorListener) {
        serviceInput.callService(new C11603a(iActionProcessorListener, this, serviceOutput, serviceInput));
    }
}
