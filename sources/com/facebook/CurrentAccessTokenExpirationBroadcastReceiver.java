package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12775o;

/* compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        if (C12775o.m28634d("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && FacebookSdk.isInitialized()) {
            C4527d.f4139g.mo31543e().mo31537e();
        }
    }
}
