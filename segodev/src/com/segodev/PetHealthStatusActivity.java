package com.segodev;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by sk on 13-10-27.
 */
public class PetHealthStatusActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pet_health_status);

        RadioGroup tabGroup = (RadioGroup) findViewById(R.id.tab_group);
        tabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.tab_today) {
                    Toast.makeText(PetHealthStatusActivity.this, "Today tab checked", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.tab_history) {
                    Toast.makeText(PetHealthStatusActivity.this, "History tab checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
