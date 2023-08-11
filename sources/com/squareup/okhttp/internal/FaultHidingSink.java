package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.C13121c;
import okio.C13148l;
import okio.C13175w0;

class FaultHidingSink extends C13148l {
    private boolean hasErrors;

    public FaultHidingSink(C13175w0 w0Var) {
        super(w0Var);
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void write(C13121c cVar, long j) {
        if (this.hasErrors) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }
}
