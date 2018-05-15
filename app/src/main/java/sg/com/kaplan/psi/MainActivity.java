package sg.com.kaplan.psi;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.editText);
        Button b = (Button) findViewById(R.id.button);
        final TextView output = (TextView) findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int psi = Integer.parseInt(input.getText().toString());
                String status;

                if(psi >= 0 && psi <= 50) {
                    status = "Good";
                    output.setTextColor(Color.GREEN);
                } else if (psi >= 51 && psi <= 100) {
                    status = "Moderate";
                    output.setTextColor(Color.BLUE);
                } else {
                    status = "Hazardous";
                    output.setTextColor(Color.RED);
                }

                output.setText(status);
            }
        });

    }
}
