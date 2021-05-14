package com.example.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private UserViewModel viewModel;
    private ActivityMainBinding mBinding;
    private DataBinding dataBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(UserViewModel.class);

        User user = new User();
        viewModel.userLiveData.postValue(user);

        viewModel.text.postValue("Aruna");

        mBinding.setUser(viewModel);



    }
}