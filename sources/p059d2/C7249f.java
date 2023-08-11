package p059d2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p251v2.C9925a;

/* renamed from: d2.f */
/* compiled from: ViewIndexingTrigger.kt */
public final class C7249f implements SensorEventListener {

    /* renamed from: b */
    public static final C7250a f9983b = new C7250a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C7251b f9984a;

    /* renamed from: d2.f$a */
    /* compiled from: ViewIndexingTrigger.kt */
    public static final class C7250a {
        private C7250a() {
        }

        public /* synthetic */ C7250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d2.f$b */
    /* compiled from: ViewIndexingTrigger.kt */
    public interface C7251b {
        /* renamed from: a */
        void mo40790a();
    }

    /* renamed from: a */
    public final void mo40814a(C7251b bVar) {
        if (!C9925a.m20734d(this)) {
            try {
                this.f9984a = bVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(sensor, "sensor");
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(sensorEvent, NotificationCompat.CATEGORY_EVENT);
                C7251b bVar = this.f9984a;
                if (bVar != null) {
                    float[] fArr = sensorEvent.values;
                    float f = fArr[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (fArr[1] / 9.80665f);
                    double d3 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                        bVar.mo40790a();
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
