package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.mediarouter.media.MediaRouteSelector;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    private static final String ARGUMENT_SELECTOR = "selector";
    private Dialog mDialog;
    private MediaRouteSelector mSelector;
    private boolean mUseDynamicGroup = false;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = MediaRouteSelector.fromBundle(arguments.getBundle(ARGUMENT_SELECTOR));
            }
            if (this.mSelector == null) {
                this.mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MediaRouteSelector getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return;
        }
        if (this.mUseDynamicGroup) {
            ((MediaRouteDynamicControllerDialog) dialog).updateLayout();
        } else {
            ((MediaRouteControllerDialog) dialog).updateLayout();
        }
    }

    @NonNull
    public MediaRouteControllerDialog onCreateControllerDialog(@NonNull Context context, @Nullable Bundle bundle) {
        return new MediaRouteControllerDialog(context);
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (this.mUseDynamicGroup) {
            MediaRouteDynamicControllerDialog onCreateDynamicControllerDialog = onCreateDynamicControllerDialog(getContext());
            this.mDialog = onCreateDynamicControllerDialog;
            onCreateDynamicControllerDialog.setRouteSelector(this.mSelector);
        } else {
            this.mDialog = onCreateControllerDialog(getContext(), bundle);
        }
        return this.mDialog;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MediaRouteDynamicControllerDialog onCreateDynamicControllerDialog(@NonNull Context context) {
        return new MediaRouteDynamicControllerDialog(context);
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null && !this.mUseDynamicGroup) {
            ((MediaRouteControllerDialog) dialog).clearGroupListAnimation(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector != null) {
            ensureRouteSelector();
            if (!this.mSelector.equals(mediaRouteSelector)) {
                this.mSelector = mediaRouteSelector;
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle(ARGUMENT_SELECTOR, mediaRouteSelector.asBundle());
                setArguments(arguments);
                Dialog dialog = this.mDialog;
                if (dialog != null && this.mUseDynamicGroup) {
                    ((MediaRouteDynamicControllerDialog) dialog).setRouteSelector(mediaRouteSelector);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* access modifiers changed from: package-private */
    public void setUseDynamicGroup(boolean z) {
        if (this.mDialog == null) {
            this.mUseDynamicGroup = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }
}
