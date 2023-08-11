package p223s7;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p101g8.C7796a;

/* renamed from: s7.t */
/* compiled from: FirebaseInAppMessagingDisplayCallbacks */
public interface C9567t {

    /* renamed from: s7.t$a */
    /* compiled from: FirebaseInAppMessagingDisplayCallbacks */
    public enum C9568a {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    /* renamed from: s7.t$b */
    /* compiled from: FirebaseInAppMessagingDisplayCallbacks */
    public enum C9569b {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT
    }

    @NonNull
    /* renamed from: a */
    Task<Void> mo29971a(@NonNull C7796a aVar);

    @NonNull
    /* renamed from: b */
    Task<Void> mo29972b(@NonNull C9568a aVar);

    @NonNull
    /* renamed from: c */
    Task<Void> mo29973c(@NonNull C9569b bVar);

    @NonNull
    /* renamed from: d */
    Task<Void> mo29974d();
}
