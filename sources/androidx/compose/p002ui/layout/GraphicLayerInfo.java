package androidx.compose.p002ui.layout;

/* renamed from: androidx.compose.ui.layout.GraphicLayerInfo */
/* compiled from: GraphicLayerInfo.android.kt */
public interface GraphicLayerInfo {

    /* renamed from: androidx.compose.ui.layout.GraphicLayerInfo$DefaultImpls */
    /* compiled from: GraphicLayerInfo.android.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            return GraphicLayerInfo.super.getOwnerViewId();
        }
    }

    long getLayerId();

    long getOwnerViewId() {
        return 0;
    }
}
