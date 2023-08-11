package com.rmn.utils;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.poulpeo.R;
import p340fd.C11943a;

public class ErrorUtil {
    public static void displayAccountError(AppCompatActivity appCompatActivity, String str) {
        AlertDialog create = new AlertDialog.Builder(appCompatActivity).setTitle((int) R.string.account_error_title).setMessage((CharSequence) str).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).create();
        new C11943a().mo49176a(create);
        create.show();
    }
}
