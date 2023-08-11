package com.braze.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3451n;
import p042bo.app.C3501o1;
import p126j0.C8266c;
import p270x.C10299e;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14020q1;
import p466yf.C14054y1;

public final class BrazeActionReceiver extends BroadcastReceiver {

    /* renamed from: com.braze.receivers.BrazeActionReceiver$a */
    public static final class C4283a {

        /* renamed from: d */
        public static final C4284a f3549d = new C4284a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final Context f3550a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Intent f3551b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f3552c;

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a */
        public static final class C4284a {

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$a */
            static final class C4285a extends C12777p implements C13074a<String> {

                /* renamed from: g */
                final /* synthetic */ int f3553g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4285a(int i) {
                    super(0);
                    this.f3553g = i;
                }

                /* renamed from: a */
                public final String invoke() {
                    return C12775o.m28647q("Location Services error: ", Integer.valueOf(this.f3553g));
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$b */
            static final class C4286b extends C12777p implements C13074a<String> {

                /* renamed from: g */
                final /* synthetic */ int f3554g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4286b(int i) {
                    super(0);
                    this.f3554g = i;
                }

                /* renamed from: a */
                public final String invoke() {
                    return C12775o.m28647q("Unsupported transition type received: ", Integer.valueOf(this.f3554g));
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$c */
            static final class C4287c extends C12777p implements C13074a<String> {

                /* renamed from: g */
                public static final C4287c f3555g = new C4287c();

                C4287c() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing location result";
                }
            }

            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$d */
            static final class C4288d extends C12777p implements C13074a<String> {

                /* renamed from: g */
                public static final C4288d f3556g = new C4288d();

                C4288d() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing single location update";
                }
            }

            public /* synthetic */ C4284a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public final boolean m4957a(Context context, Location location) {
                try {
                    C10299e.m21646e(context, new C3451n(location));
                    return true;
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4288d.f3556g, 4, (Object) null);
                    return false;
                }
            }

            /* renamed from: b */
            public final boolean mo31004b(Context context, GeofencingEvent geofencingEvent) {
                C12775o.m28639i(context, "applicationContext");
                C12775o.m28639i(geofencingEvent, "geofenceEvent");
                if (geofencingEvent.hasError()) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4285a(geofencingEvent.getErrorCode()), 6, (Object) null);
                    return false;
                }
                int geofenceTransition = geofencingEvent.getGeofenceTransition();
                List<Geofence> triggeringGeofences = geofencingEvent.getTriggeringGeofences();
                C12775o.m28638h(triggeringGeofences, "geofenceEvent.triggeringGeofences");
                if (1 == geofenceTransition) {
                    for (Geofence requestId : triggeringGeofences) {
                        String requestId2 = requestId.getRequestId();
                        C12775o.m28638h(requestId2, "geofence.requestId");
                        C10299e.m21647g(context, requestId2, C3501o1.ENTER);
                    }
                } else if (2 == geofenceTransition) {
                    for (Geofence requestId3 : triggeringGeofences) {
                        String requestId4 = requestId3.getRequestId();
                        C12775o.m28638h(requestId4, "geofence.requestId");
                        C10299e.m21647g(context, requestId4, C3501o1.EXIT);
                    }
                } else {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4286b(geofenceTransition), 6, (Object) null);
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final boolean mo31005c(Context context, LocationResult locationResult) {
                C12775o.m28639i(context, "applicationContext");
                C12775o.m28639i(locationResult, "locationResult");
                try {
                    Location lastLocation = locationResult.getLastLocation();
                    C12775o.m28638h(lastLocation, "locationResult.lastLocation");
                    C10299e.m21649i(context, new C3451n(lastLocation));
                    return true;
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4287c.f3555g, 4, (Object) null);
                    return false;
                }
            }

            private C4284a() {
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$b */
        static final class C4289b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3557g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4289b(C4283a aVar) {
                super(0);
                this.f3557g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Received intent with action ", this.f3557g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$c */
        static final class C4290c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4290c f3558g = new C4290c();

            C4290c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Received intent with null action. Doing nothing.";
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$d */
        static final class C4291d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3559g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4291d(C4283a aVar) {
                super(0);
                this.f3559g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("BrazeActionReceiver received intent with location result: ", this.f3559g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$e */
        static final class C4292e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3560g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4292e(C4283a aVar) {
                super(0);
                this.f3560g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("BrazeActionReceiver received intent without location result: ", this.f3560g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$f */
        static final class C4293f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3561g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4293f(C4283a aVar) {
                super(0);
                this.f3561g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("BrazeActionReceiver received intent with geofence transition: ", this.f3561g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$g */
        static final class C4294g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3562g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4294g(C4283a aVar) {
                super(0);
                this.f3562g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("BrazeActionReceiver received intent with single location update: ", this.f3562g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$h */
        static final class C4295h extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3563g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4295h(C4283a aVar) {
                super(0);
                this.f3563g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Unknown intent received in BrazeActionReceiver with action: ", this.f3563g.f3552c);
            }
        }

        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$i */
        static final class C4296i extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C4283a f3564g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4296i(C4283a aVar) {
                super(0);
                this.f3564g = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception while performing the BrazeActionReceiver work. Action: " + this.f3564g.f3552c + " Intent: " + this.f3564g.f3551b;
            }
        }

        public C4283a(Context context, Intent intent) {
            C12775o.m28639i(context, "applicationContext");
            C12775o.m28639i(intent, "intent");
            this.f3550a = context;
            this.f3551b = intent;
            this.f3552c = intent.getAction();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: android.location.Location} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.location.Location} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo31002b() {
            /*
                r10 = this;
                j0.c r8 = p126j0.C8266c.f11641a
                com.braze.receivers.BrazeActionReceiver$a$b r5 = new com.braze.receivers.BrazeActionReceiver$a$b
                r5.<init>(r10)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 7
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r0 = r10.f3552c
                r9 = 0
                if (r0 == 0) goto L_0x0101
                int r1 = r0.hashCode()
                r2 = -1382373484(0xffffffffad9aa794, float:-1.7582193E-11)
                if (r1 == r2) goto L_0x00ac
                r2 = 94647129(0x5a43359, float:1.5441348E-35)
                if (r1 == r2) goto L_0x0059
                r2 = 1794335912(0x6af364a8, float:1.47122155E26)
                if (r1 == r2) goto L_0x002b
                goto L_0x00b4
            L_0x002b:
                java.lang.String r1 = "com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0035
                goto L_0x00b4
            L_0x0035:
                com.braze.receivers.BrazeActionReceiver$a$f r5 = new com.braze.receivers.BrazeActionReceiver$a$f
                r5.<init>(r10)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 7
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                com.braze.receivers.BrazeActionReceiver$a$a r0 = f3549d
                android.content.Context r1 = r10.f3550a
                android.content.Intent r2 = r10.f3551b
                com.google.android.gms.location.GeofencingEvent r2 = com.google.android.gms.location.GeofencingEvent.fromIntent(r2)
                java.lang.String r3 = "fromIntent(intent)"
                kotlin.jvm.internal.C12775o.m28638h(r2, r3)
                boolean r9 = r0.mo31004b(r1, r2)
                goto L_0x010d
            L_0x0059:
                java.lang.String r1 = "com.appboy.action.receiver.SINGLE_LOCATION_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0062
                goto L_0x00b4
            L_0x0062:
                com.braze.receivers.BrazeActionReceiver$a$g r5 = new com.braze.receivers.BrazeActionReceiver$a$g
                r5.<init>(r10)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 7
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                java.lang.String r3 = "location"
                if (r0 < r1) goto L_0x008c
                android.content.Intent r0 = r10.f3551b
                android.os.Bundle r0 = r0.getExtras()
                if (r0 != 0) goto L_0x0082
                goto L_0x009b
            L_0x0082:
                java.lang.Class<android.location.Location> r1 = android.location.Location.class
                java.lang.Object r0 = r0.getParcelable(r3, r1)
                r2 = r0
                android.location.Location r2 = (android.location.Location) r2
                goto L_0x009b
            L_0x008c:
                android.content.Intent r0 = r10.f3551b
                android.os.Bundle r0 = r0.getExtras()
                if (r0 != 0) goto L_0x0095
                goto L_0x0099
            L_0x0095:
                java.lang.Object r2 = r0.get(r3)
            L_0x0099:
                android.location.Location r2 = (android.location.Location) r2
            L_0x009b:
                if (r2 != 0) goto L_0x009f
                goto L_0x010d
            L_0x009f:
                com.braze.receivers.BrazeActionReceiver$a$a r0 = f3549d
                android.content.Context r1 = r10.f3550a
                boolean r0 = r0.m4957a(r1, r2)
                r1 = 1
                if (r0 != r1) goto L_0x010d
                r9 = r1
                goto L_0x010d
            L_0x00ac:
                java.lang.String r1 = "com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00c5
            L_0x00b4:
                j0.c$a r2 = p126j0.C8266c.C8267a.f11651g
                com.braze.receivers.BrazeActionReceiver$a$h r5 = new com.braze.receivers.BrazeActionReceiver$a$h
                r5.<init>(r10)
                r3 = 0
                r4 = 0
                r6 = 6
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                goto L_0x010d
            L_0x00c5:
                android.content.Intent r0 = r10.f3551b
                boolean r0 = com.google.android.gms.location.LocationResult.hasResult(r0)
                if (r0 == 0) goto L_0x00f0
                com.braze.receivers.BrazeActionReceiver$a$d r5 = new com.braze.receivers.BrazeActionReceiver$a$d
                r5.<init>(r10)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 7
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                com.braze.receivers.BrazeActionReceiver$a$a r0 = f3549d
                android.content.Context r1 = r10.f3550a
                android.content.Intent r2 = r10.f3551b
                com.google.android.gms.location.LocationResult r2 = com.google.android.gms.location.LocationResult.extractResult(r2)
                java.lang.String r3 = "extractResult(intent)"
                kotlin.jvm.internal.C12775o.m28638h(r2, r3)
                boolean r9 = r0.mo31005c(r1, r2)
                goto L_0x0100
            L_0x00f0:
                j0.c$a r2 = p126j0.C8266c.C8267a.f11651g
                com.braze.receivers.BrazeActionReceiver$a$e r5 = new com.braze.receivers.BrazeActionReceiver$a$e
                r5.<init>(r10)
                r3 = 0
                r4 = 0
                r6 = 6
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x0100:
                return r9
            L_0x0101:
                com.braze.receivers.BrazeActionReceiver$a$c r5 = com.braze.receivers.BrazeActionReceiver.C4283a.C4290c.f3558g
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 7
                r7 = 0
                r0 = r8
                r1 = r10
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x010d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.receivers.BrazeActionReceiver.C4283a.mo31002b():boolean");
        }

        /* renamed from: d */
        public final void mo31003d() {
            try {
                mo31002b();
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C4296i(this), 4, (Object) null);
            }
        }
    }

    /* renamed from: com.braze.receivers.BrazeActionReceiver$b */
    static final class C4297b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4297b f3565g = new C4297b();

        C4297b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null intent. Doing nothing.";
        }
    }

    /* renamed from: com.braze.receivers.BrazeActionReceiver$c */
    static final class C4298c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4298c f3566g = new C4298c();

        C4298c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null context. Doing nothing.";
        }
    }

    @C12739f(mo50609c = "com.braze.receivers.BrazeActionReceiver$onReceive$3", mo50610f = "BrazeActionReceiver.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.receivers.BrazeActionReceiver$d */
    static final class C4299d extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3567h;

        /* renamed from: i */
        final /* synthetic */ C4283a f3568i;

        /* renamed from: j */
        final /* synthetic */ BroadcastReceiver.PendingResult f3569j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4299d(C4283a aVar, BroadcastReceiver.PendingResult pendingResult, C12074d<? super C4299d> dVar) {
            super(2, dVar);
            this.f3568i = aVar;
            this.f3569j = pendingResult;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C4299d) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C4299d(this.f3568i, this.f3569j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f3567h == 0) {
                C11910n.m25701b(obj);
                this.f3568i.mo31003d();
                this.f3569j.finish();
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4297b.f3565g, 6, (Object) null);
        } else if (context == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4298c.f3566g, 6, (Object) null);
        } else {
            Context applicationContext = context.getApplicationContext();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            C12775o.m28638h(applicationContext, "applicationContext");
            C14054y1 unused = C13985j.m32422d(C14020q1.f22944b, C13933b1.m32211b(), (C14004n0) null, new C4299d(new C4283a(applicationContext, intent), goAsync, (C12074d<? super C4299d>) null), 2, (Object) null);
        }
    }
}
