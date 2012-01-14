package com.blogspot.sassylog.androidbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import gueei.binding.Binder;
import gueei.binding.Command;
import gueei.binding.observables.StringObservable;


public class AndroidBindingSampleActivity extends Activity {
    private AndroidBindingSampleViewModel viewModel_ = new AndroidBindingSampleViewModel();
    public final StringObservable Greeting = new StringObservable();
    public Command ChangeGreeting = new Command() {
        @Override
        public void Invoke(View arg0, Object... arg1) {
            Greeting.set("changed by command");
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = Binder.bindView(this, Binder.inflateView(this, R.layout.main, null, false), viewModel_);
        setContentView(view);
    }
}