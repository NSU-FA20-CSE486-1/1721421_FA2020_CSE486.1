package NSU.CSE486.AlarmTimeCC;

import android.app.AlarmManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    }

    public void next_alarm_button(View view) {
        AlarmManager.AlarmClockInfo info = alarmManager.getNextAlarmClock();
        String message;
        if (info != null){
            Date nextAlarm = new Date(info.getTriggerTime());
            String newDate = DateFormat.getTimeInstance().format(nextAlarm);

            message = "The alarm is set for " + newDate + ".";
        }
        else{
            message = "9.40 AM";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
