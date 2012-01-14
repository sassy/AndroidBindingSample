package com.blogspot.sassylog.androidbindingsample;

import android.view.View;
import gueei.binding.Command;
import gueei.binding.observables.StringObservable;
import gueei.binding.pojo.PojoViewModel;
import gueei.binding.pojo.PojoViewModelHelper;

public class AndroidBindingSampleViewModel implements PojoViewModel {
    private PojoViewModelHelper helper_ = new PojoViewModelHelper();
    public StringObservable Greeting = new StringObservable("Hello Android");

    @Override
    public PojoViewModelHelper getHelper() {
        return helper_;
    }

    @Override
    public void notifyPropertyChanged(String property) {
        helper_.notifyPropertyChanged(property);
    }

    public Command ChangeGreeting = new Command() {
        @Override
        public void Invoke(View arg0, Object... arg1) {
            Greeting.set("changed by command");
        }
    };

}
