package fi.jamk.vko36t2launchamapwithimplicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view){
        // get lat and lng values
        EditText latEditText = (EditText) findViewById(R.id.latEditText);
        EditText lngEditText = (EditText) findViewById(R.id.longEditText);

        String n1 = latEditText.getText().toString();
        String n2 = lngEditText.getText().toString();

        double lat = Double.parseDouble(n1);
        double lng = Double.parseDouble(n2);

        //show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);
    }
}
