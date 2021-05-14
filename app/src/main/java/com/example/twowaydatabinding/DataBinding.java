package com.example.twowaydatabinding;

import android.widget.EditText;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;

public class DataBinding {

    @BindingAdapter("text")
    public static void setText(EditText view, String newValue) {
        // Important to break potential infinite loops.
        if (view.getText().toString() != newValue) {
            view.setText(newValue);
        }
    }

    @InverseBindingAdapter(attribute = "text")
    public static String getText(EditText view) {
        return view.getText().toString();
    }
}
