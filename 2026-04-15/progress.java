package com.example.shewoongeo;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1, editText2;
    ProgressBar progressBar;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);
    }

    public void onButtonClicked(View view) {
        try{
            Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메시지입니다.", Toast.LENGTH_SHORT);

            int xOffset = Integer.parseInt(editText1.getText().toString());
            int yOffset = Integer.parseInt(editText2.getText().toString());

            toastView.setGravity(Gravity.TOP, xOffset, yOffset);
            toastView.show();
        }
        catch (NumberFormatException e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    public void onButtonClicked2(View view)
    {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toastborder,(ViewGroup)findViewById(R.id.toast_layout_root));

        TextView text = layout.findViewById(R.id.text);

        Toast toast = new Toast(this);
        text.setText("Make it Easy");
        toast.setGravity(Gravity.CENTER, 0, 100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void onButtonClicked3(View view)
    {
        Snackbar.make(view, "Make it East", Snackbar.LENGTH_SHORT).show();
    }

    public void onButtonClicked4(View v)
    {
        showMessage();
    }

    public void showMessage()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Make it Easy");
        builder.setMessage("Make it Easy");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String message = "OK 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String message = "Cancel 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            String message = "NO 버튼이 눌렸습니다.";
            textView.setText(message);
        }
    });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void onButtonClicked5(View view)
    {
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("데이터를 불러올수도 있는 중입니다...");
        progressDialog.show();
    }
}
