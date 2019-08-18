package com.example.pragnas.radiobuttons
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.pragnas.R
import kotlinx.android.synthetic.main.activity_radio_buttons.*
import android.widget.CompoundButton


class RadioButtonsActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_buttons)

        rb1.setOnCheckedChangeListener(this);
        rb2.setOnCheckedChangeListener(this);
        rb3.setOnCheckedChangeListener(this);
        rb4.setOnCheckedChangeListener(this);
        rb5.setOnCheckedChangeListener(this);
        rb6.setOnCheckedChangeListener(this);
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        if (isChecked) {
            if (buttonView.id == R.id.rb1) {
                rb2.setChecked(false)
                rb3.setChecked(false)
                rb4.setChecked(false)
                rb5.setChecked(false)
                rb6.setChecked(false)
                Toast.makeText(applicationContext, "rb1", Toast.LENGTH_SHORT).show()
            }
            if (buttonView.id == R.id.rb2) {
                rb1.setChecked(false)
                rb3.setChecked(false)
                rb4.setChecked(false)
                rb5.setChecked(false)
                rb6.setChecked(false)
                Toast.makeText(applicationContext, "rb2", Toast.LENGTH_SHORT).show()
            }
            if (buttonView.id == R.id.rb3) {
                rb1.setChecked(false)
                rb2.setChecked(false)
                rb4.setChecked(false)
                rb5.setChecked(false)
                rb6.setChecked(false)
                Toast.makeText(applicationContext, "rb3", Toast.LENGTH_SHORT).show()
            }
            if (buttonView.id == R.id.rb4) {
                rb1.setChecked(false)
                rb2.setChecked(false)
                rb3.setChecked(false)
                rb5.setChecked(false)
                rb6.setChecked(false)
                Toast.makeText(applicationContext, "rb1", Toast.LENGTH_SHORT).show()
            }
            if (buttonView.id == R.id.rb5) {
                rb1.setChecked(false)
                rb2.setChecked(false)
                rb3.setChecked(false)
                rb4.setChecked(false)
                rb6.setChecked(false)
                Toast.makeText(applicationContext, "rb5", Toast.LENGTH_SHORT).show()
            }

            if (buttonView.id == R.id.rb6) {
                rb1.setChecked(false)
                rb2.setChecked(false)
                rb3.setChecked(false)
                rb4.setChecked(false)
                rb5.setChecked(false)
                Toast.makeText(applicationContext, "rb6", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
