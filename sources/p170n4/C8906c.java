package p170n4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.cloudmessaging.C4717l;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p131j5.C8414a;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: n4.c */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public class C8906c {

    /* renamed from: h */
    private static int f12920h;

    /* renamed from: i */
    private static PendingIntent f12921i;

    /* renamed from: j */
    private static final Executor f12922j = C8920q.f12949b;

    /* renamed from: k */
    private static final Pattern f12923k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    private final SimpleArrayMap<String, C10406g<Bundle>> f12924a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final Context f12925b;

    /* renamed from: c */
    private final C8914k f12926c;

    /* renamed from: d */
    private final ScheduledExecutorService f12927d;

    /* renamed from: e */
    private Messenger f12928e;

    /* renamed from: f */
    private Messenger f12929f;

    /* renamed from: g */
    private C8911h f12930g;

    public C8906c(@NonNull Context context) {
        this.f12925b = context;
        this.f12926c = new C8914k(context);
        this.f12928e = new Messenger(new C8908e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12927d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static /* synthetic */ Task m18043b(Bundle bundle) {
        if (m18049j(bundle)) {
            return C10410i.m21831e(null);
        }
        return C10410i.m21831e(bundle);
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m18044d(C8906c cVar, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C8910g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C8911h) {
                        cVar.f12930g = (C8911h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f12929f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str3 = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str3 = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str3);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                if (stringExtra2.length() != 0) {
                                    str2 = "Unexpected structured response ".concat(stringExtra2);
                                } else {
                                    str2 = new String("Unexpected structured response ");
                                }
                                Log.w("Rpc", str2);
                                return;
                            }
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            cVar.m18048i(str5, intent2.putExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str6).getExtras());
                            return;
                        }
                        synchronized (cVar.f12924a) {
                            for (int i = 0; i < cVar.f12924a.size(); i++) {
                                cVar.m18048i(cVar.f12924a.keyAt(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f12923k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            cVar.m18048i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        str4 = "Unexpected response action: ".concat(valueOf2);
                    } else {
                        str4 = new String("Unexpected response action: ");
                    }
                    Log.d("Rpc", str4);
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    @AnyThread
    /* renamed from: f */
    private final Task<Bundle> m18045f(Bundle bundle) {
        String g = m18046g();
        C10406g gVar = new C10406g();
        synchronized (this.f12924a) {
            this.f12924a.put(g, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f12926c.mo43062b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m18047h(this.f12925b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f12928e);
        if (!(this.f12929f == null && this.f12930g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f12929f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f12930g.mo43055b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            gVar.mo45096a().mo35451b(f12922j, new C8917n(this, g, this.f12927d.schedule(new C8919p(gVar), 30, TimeUnit.SECONDS)));
            return gVar.mo45096a();
        }
        if (this.f12926c.mo43062b() == 2) {
            this.f12925b.sendBroadcast(intent);
        } else {
            this.f12925b.startService(intent);
        }
        gVar.mo45096a().mo35451b(f12922j, new C8917n(this, g, this.f12927d.schedule(new C8919p(gVar), 30, TimeUnit.SECONDS)));
        return gVar.mo45096a();
    }

    /* renamed from: g */
    private static synchronized String m18046g() {
        String num;
        synchronized (C8906c.class) {
            int i = f12920h;
            f12920h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m18047h(Context context, Intent intent) {
        synchronized (C8906c.class) {
            if (f12921i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f12921i = C8414a.m16836a(context, 0, intent2, C8414a.f11986a);
            }
            intent.putExtra("app", f12921i);
        }
    }

    /* renamed from: i */
    private final void m18048i(String str, @Nullable Bundle bundle) {
        String str2;
        synchronized (this.f12924a) {
            C10406g remove = this.f12924a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.mo45098c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m18049j(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: a */
    public Task<Bundle> mo43045a(@NonNull Bundle bundle) {
        if (this.f12926c.mo43061a() >= 12000000) {
            return C4717l.m6363b(this.f12925b).mo32333d(1, bundle).mo35457h(f12922j, C8916m.f12943a);
        }
        if (this.f12926c.mo43062b() != 0) {
            return m18045f(bundle).mo35459j(f12922j, new C8915l(this, bundle));
        }
        return C10410i.m21830d(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ Task mo43046c(@NonNull Bundle bundle, @NonNull Task task) {
        if (task.mo35465p() && m18049j((Bundle) task.mo35461l())) {
            return m18045f(bundle).mo35466q(f12922j, C8918o.f12947a);
        }
        return task;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo43047e(@NonNull String str, @NonNull ScheduledFuture scheduledFuture, @NonNull Task task) {
        synchronized (this.f12924a) {
            this.f12924a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
