package p170n4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.C4717l;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p131j5.C8418e;
import p276x5.C10410i;
import p297z4.C10822b;

/* renamed from: n4.b */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class C8905b extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f12919a;

    public C8905b() {
        C8418e.m16837a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C10822b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12919a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @WorkerThread
    /* renamed from: e */
    private final int m18037e(@NonNull Context context, @NonNull Intent intent) {
        Task<Void> task;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            task = C10410i.m21831e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            task = C4717l.m6363b(context).mo32332c(2, bundle);
        }
        int b = mo39791b(context, new C8904a(intent));
        try {
            C10410i.m21828b(task, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b;
    }

    @WorkerThread
    /* renamed from: f */
    private final int m18038f(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo39792c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public Executor mo43042a() {
        return this.f12919a;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public abstract int mo39791b(@NonNull Context context, @NonNull C8904a aVar);

    /* renamed from: d */
    public final /* synthetic */ void mo43043d(@NonNull Intent intent, @NonNull Context context, boolean z, @NonNull BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                i = m18038f(context, intent2);
            } else {
                i = m18037e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent != null) {
            mo43042a().execute(new C8912i(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public void mo39792c(@NonNull Context context, @NonNull Bundle bundle) {
    }
}
