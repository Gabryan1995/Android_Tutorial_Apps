package com.example.pickerfortime;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.timepicker));
    }

    public void processTimePickerResults(int hourOfDay, int minute) {
        String hourOfDay_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String dateMessage = (hourOfDay_string + ":" + minute_string);

        Toast.makeText(this, getString(R.string.time) + dateMessage, Toast.LENGTH_SHORT).show();
    }
}
